package projectacme.util;

import projectacme.factory.AccessSubjectFactory;
import projectacme.service.Manager;
import projectacme.util.Enum.AccessSubjectRoleEnum;
import projectacme.util.Enum.StateEnum;
import projectacme.util.pdf.PdfGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class ThreadReportManage {

    private final Map<String, Supplier<List<Map<String, Object>>>> reportFunctions = new HashMap<>();

    public static void generateReports(Map<String, Supplier<List<Map<String, Object>>>> reportFunctions){
         String pdfPath = "generated_report.pdf";
        List<List<Map<String,Object>>> reports = new ArrayList<>();
        List<String> titles = new ArrayList<>();

        ArrayList<ReportThread> threads = new ArrayList<>();

        reportFunctions.forEach((key,value)->threads.add(new ReportThread(key,value)));
        threads.forEach(ReportThread::start);
        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        threads.forEach(thread -> {
            reports.add(thread.getReportResult());
            titles.add(thread.getReportTitle());
        });


        PdfGenerator.generatePdf(pdfPath,reports,titles);
        PdfGenerator.openPdf(pdfPath);
    }

}

class ReportThread extends Thread{
    private List<Map<String, Object>> reportResult;
    private String reportTitle;
    private Supplier<List<Map<String, Object>>> reportFunction;

    public ReportThread(String reportTitle, Supplier<List<Map<String, Object>>> reportFunction){
        this.reportFunction=reportFunction;
        this.reportTitle=reportTitle;
    }

    @Override
    public void run(){
        this.reportResult=reportFunction.get();
    }

    public List<Map<String, Object>> getReportResult() {
        return reportResult;
    }

    public void setReportResult(List<Map<String, Object>> reportResult) {
        this.reportResult = reportResult;
    }

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    public Supplier<List<Map<String, Object>>> getReportFunction() {
        return reportFunction;
    }

    public void setReportFunction(Supplier<List<Map<String, Object>>> reportFunction) {
        this.reportFunction = reportFunction;
    }
}