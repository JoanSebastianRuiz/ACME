package projectacme.controller;

import projectacme.UserActual;
import projectacme.service.Manager;
import projectacme.service.Officer;
import projectacme.util.ThreadReportManage;
import projectacme.view.InterfaceDownloadReportsManager;
import projectacme.view.InterfaceDownloadReportsOfficer;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class DownloadReportsOfficerController {
    private InterfaceDownloadReportsOfficer view;
    private Officer officer;
    private Map<String, Supplier<List<Map<String, Object>>>> reportFunctions = new HashMap<>();

    public DownloadReportsOfficerController(InterfaceDownloadReportsOfficer view) {
        this.view = view;
        this.officer = UserActual.getAccessSubjectOfficer();
        view.getTextMessage().setForeground(Color.white);

        view.getTextDownload().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(!view.getCheckWorkers().isSelected()
                        && !view.getCheckVehicles().isSelected()
                        && !view.getCheckGuests().isSelected()
                        && !view.getCheckAccessLogs().isSelected()){

                    view.getTextMessage().setText("Select at least one report");
                    view.getTextMessage().setForeground(Color.RED);
                } else{
                    view.getTextMessage().setText("PDF successfully generated");
                    view.getTextMessage().setForeground(Color.GREEN);
                    addReports();
                    ThreadReportManage.generateReports(reportFunctions);
                    reportFunctions.clear();
                }
            }
        });
    }

    private void addReports(){
        if(view.getCheckGuests().isSelected()){
            reportFunctions.put("Guests", ()->officer.getReportsGuest());
        }
        if(view.getCheckAccessLogs().isSelected()){
            reportFunctions.put("Access logs", ()->officer.getReportsAccessLogs());
        }
        if(view.getCheckVehicles().isSelected()){
            reportFunctions.put("Vehicles", ()->officer.getReportsVehicles());
        }
        if(view.getCheckWorkers().isSelected()){
            reportFunctions.put("Workers", ()->officer.getReportsWorkers());
        }
    }
}
