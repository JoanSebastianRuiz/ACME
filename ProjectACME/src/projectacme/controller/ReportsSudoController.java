package projectacme.controller;

import projectacme.service.Sudo;
import projectacme.util.Report;
import projectacme.view.InterfaceReportsSudo;
import projectacme.view.InterfaceViewReports;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReportsSudoController {
    private InterfaceReportsSudo view;
    private Sudo sudo;

    public ReportsSudoController(InterfaceReportsSudo view, Sudo sudo) {
        this.view = view;
        this.sudo = sudo;

        view.getTextManagers().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                createReportManagers();
            }
        });
    }

    public void createReportManagers(){
        Report report = new Report(sudo.getReportsManager(),"Managers");
        InterfaceViewReports viewReports = new InterfaceViewReports();
        ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
        viewReports.setVisible(true);
        view.setVisible(false);
    }
}
