package projectacme.controller;

import projectacme.UserActual;
import projectacme.service.Manager;
import projectacme.util.Report;
import projectacme.view.InterfaceReportsManager;
import projectacme.view.InterfaceViewReports;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReportsManagerController {
    private InterfaceReportsManager view;
    private Manager manager;

    public ReportsManagerController(InterfaceReportsManager view) {
        this.view = view;
        this.manager = UserActual.getAccessSubjectManager();

        view.getTextWorkers().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                createReportWorkers();
            }
        });

        view.getTextSecurityGuards().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                createReportGuards();
            }
        });

        view.getTextGuests().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                createReportGuests();
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

        view.getTextOfficers().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                createReportOfficers();
            }
        });

        view.getTextCompanies().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                createReportCompanies();
            }
        });
    }

    public void createReportWorkers(){
        Report report = new Report(manager.getReportsWorkers(),"Workers");
        InterfaceViewReports viewReports = new InterfaceViewReports();
        ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
        viewReports.setVisible(true);
        view.setVisible(false);
    }

    public void createReportGuests(){
        Report report = new Report(manager.getReportsGuest(),"Guests");
        InterfaceViewReports viewReports = new InterfaceViewReports();
        ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
        viewReports.setVisible(true);
        view.setVisible(false);
    }

    public void createReportGuards(){
        Report report = new Report(manager.getReportsSecurityGuard(),"Security guards");
        InterfaceViewReports viewReports = new InterfaceViewReports();
        ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
        viewReports.setVisible(true);
        view.setVisible(false);
    }

    public void createReportVehicles(){
        Report report = new Report(manager.getReportsVehicles(),"Vehicles");
        InterfaceViewReports viewReports = new InterfaceViewReports();
        ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
        viewReports.setVisible(true);
        view.setVisible(false);
    }

    public void createReportAccessLogs(){
        Report report = new Report(manager.getReportsAccessLogs(),"Access logs");
        InterfaceViewReports viewReports = new InterfaceViewReports();
        ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
        viewReports.setVisible(true);
        view.setVisible(false);
    }

    public void createReportOfficers(){
        Report report = new Report(manager.getReportsOfficers(),"Officers");
        InterfaceViewReports viewReports = new InterfaceViewReports();
        ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
        viewReports.setVisible(true);
        view.setVisible(false);
    }

    public void createReportCompanies(){
        Report report = new Report(manager.getReportsCompanies(),"Companies");
        InterfaceViewReports viewReports = new InterfaceViewReports();
        ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
        viewReports.setVisible(true);
        view.setVisible(false);
    }

}
