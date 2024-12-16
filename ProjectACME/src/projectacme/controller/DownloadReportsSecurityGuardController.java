package projectacme.controller;

import projectacme.UserActual;
import projectacme.service.Manager;
import projectacme.service.SecurityGuard;
import projectacme.util.ThreadReportManage;
import projectacme.view.InterfaceDownloadReportsManager;
import projectacme.view.InterfaceDownloadReportsSecurityGuard;
import projectacme.view.InterfaceReportsSecurityGuard;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class DownloadReportsSecurityGuardController {
    InterfaceDownloadReportsSecurityGuard view;
    SecurityGuard securityGuard;
    private Map<String, Supplier<List<Map<String, Object>>>> reportFunctions = new HashMap<>();

    public DownloadReportsSecurityGuardController(InterfaceDownloadReportsSecurityGuard view) {
        this.view = view;
        this.securityGuard = UserActual.getAccessSubjectSecurityGuard();
        view.getTextMessage().setForeground(Color.white);

        view.getTextDownload().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(!view.getCheckCompanies().isSelected()
                        && !view.getCheckVehicles().isSelected()
                        && !view.getCheckJustifications().isSelected()
                        && !view.getCheckAnnotations().isSelected()
                        && !view.getCheckAccessLogs().isSelected()
                        && !view.getCheckAuthorizedPeople().isSelected()){

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
            reportFunctions.put("Companies", ()->securityGuard.getReportsCompanies());
        }
        if(view.getCheckAnnotations().isSelected()){
            reportFunctions.put("Guests", ()->securityGuard.getReportAnnotations());
        }
        if(view.getCheckAccessLogs().isSelected()){
            reportFunctions.put("Access logs", ()->securityGuard.getReportsAccessLogs());
        }
        if(view.getCheckJustifications().isSelected()){
            reportFunctions.put("Officers", ()-> securityGuard.getReportJustifications());
        }
        if(view.getCheckVehicles().isSelected()){
            reportFunctions.put("Vehicles", ()->securityGuard.getReportsVehicles());
        }
        if(view.getCheckAuthorizedPeople().isSelected()){
            reportFunctions.put("Security guards", ()->securityGuard.getReportsAccessSubjects());
        }
    }

}
