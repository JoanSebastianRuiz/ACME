package projectacme.controller;

import projectacme.service.Manager;
import projectacme.util.Report;
import projectacme.util.ThreadReportManage;
import projectacme.view.InterfaceDownloadReportsManager;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class DownloadReportsManagerController {
    private InterfaceDownloadReportsManager view;
    private Manager manager;
    private Map<String, Supplier<List<Map<String, Object>>>> reportFunctions = new HashMap<>();

    public DownloadReportsManagerController(InterfaceDownloadReportsManager view, Manager manager) {
        this.view = view;
        this.manager = manager;
        view.getTextMessage().setForeground(Color.white);

        view.getTextDownload().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(!view.getCheckWorkers().isSelected()
                    && !view.getCheckCompanies().isSelected()
                    && !view.getCheckVehicles().isSelected()
                    && !view.getCheckGuests().isSelected()
                    && !view.getCheckSecurityGuards().isSelected()
                    && !view.getCheckAccessLogs().isSelected()
                    && !view.getCheckOfficers().isSelected()){

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
        if(view.getCheckCompanies().isSelected()){
            reportFunctions.put("Companies", ()->manager.getReportsCompanies());
        }
        if(view.getCheckGuests().isSelected()){
            reportFunctions.put("Guests", ()->manager.getReportsGuest());
        }
        if(view.getCheckAccessLogs().isSelected()){
            reportFunctions.put("Access logs", ()->manager.getReportsAccessLogs());
        }
        if(view.getCheckOfficers().isSelected()){
            reportFunctions.put("Officers", ()-> manager.getReportsOfficers());
        }
        if(view.getCheckVehicles().isSelected()){
            reportFunctions.put("Vehicles", ()->manager.getReportsVehicles());
        }
        if(view.getCheckSecurityGuards().isSelected()){
            reportFunctions.put("Security guards", ()->manager.getReportsSecurityGuard());
        }
        if(view.getCheckWorkers().isSelected()){
            reportFunctions.put("Workers", ()->manager.getReportsWorkers());
        }
    }
}
