package projectacme.controller;

import projectacme.service.Manager;
import projectacme.service.SecurityGuard;
import projectacme.util.Report;
import projectacme.view.InterfaceReportsManager;
import projectacme.view.InterfaceReportsSecurityGuard;
import projectacme.view.InterfaceViewReports;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReportsSecurityGuardController {
    InterfaceReportsSecurityGuard view;
    SecurityGuard securityGuard;

    public ReportsSecurityGuardController(InterfaceReportsSecurityGuard view, SecurityGuard securityGuard) {
        this.view = view;
        this.securityGuard = securityGuard;

        view.getTextAuthorizedPeople().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                createReportAuthorizedPeople();
            }
        });


        view.getTextVehicles().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                createReportVehicles();
            }
        });

        view.getTextAccessLogs().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                createReportAccessLogs();
            }
        });


        view.getTextCompanies().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                createReportCompanies();
            }
        });

        view.getTextAnnotations().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                createReportAnnotations();
            }
        });

        view.getTextJustifications().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                createReportJustifications();
            }
        });
    }

    public void createReportAuthorizedPeople(){
        Report report = new Report(securityGuard.getReportsAccessSubjects(),"Authorized people");
        InterfaceViewReports viewReports = new InterfaceViewReports();
        ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
        viewReports.setVisible(true);
        view.setVisible(false);
    }

    public void createReportVehicles(){
        Report report = new Report(securityGuard.getReportsVehicles(),"Vehicles");
        InterfaceViewReports viewReports = new InterfaceViewReports();
        ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
        viewReports.setVisible(true);
        view.setVisible(false);
    }

    public void createReportAccessLogs(){
        Report report = new Report(securityGuard.getReportsAccessLogs(),"Access logs");
        InterfaceViewReports viewReports = new InterfaceViewReports();
        ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
        viewReports.setVisible(true);
        view.setVisible(false);
    }

    public void createReportCompanies(){
        Report report = new Report(securityGuard.getReportsCompanies(),"Companies");
        InterfaceViewReports viewReports = new InterfaceViewReports();
        ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
        viewReports.setVisible(true);
        view.setVisible(false);
    }

    public void createReportAnnotations(){
        Report report = new Report(securityGuard.getReportAnnotations(),"Annotations");
        InterfaceViewReports viewReports = new InterfaceViewReports();
        ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
        viewReports.setVisible(true);
        view.setVisible(false);
    }

    public void createReportJustifications(){
        Report report = new Report(securityGuard.getReportJustifications(),"Justifications");
        InterfaceViewReports viewReports = new InterfaceViewReports();
        ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
        viewReports.setVisible(true);
        view.setVisible(false);
    }
}
