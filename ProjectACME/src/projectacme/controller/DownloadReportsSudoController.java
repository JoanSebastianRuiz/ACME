package projectacme.controller;

import projectacme.UserActual;
import projectacme.service.Officer;
import projectacme.service.Sudo;
import projectacme.util.ThreadReportManage;
import projectacme.view.InterfaceDownloadReportsOfficer;
import projectacme.view.InterfaceDownloadReportsSudo;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class DownloadReportsSudoController {
    InterfaceDownloadReportsSudo view;
    Sudo sudo;
    private Map<String, Supplier<List<Map<String, Object>>>> reportFunctions = new HashMap<>();

    public DownloadReportsSudoController(InterfaceDownloadReportsSudo view) {
        this.view = view;
        this.sudo = UserActual.getAccessSubjectSudo();
        view.getTextMessage().setForeground(Color.white);

        view.getTextDownload().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(!view.getCheckManagers().isSelected()){
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
        if(view.getCheckManagers().isSelected()){
            reportFunctions.put("Guests", ()->sudo.getReportsManager());
        }
    }
}
