package projectacme.controller;

import projectacme.UserActual;
import projectacme.service.Manager;
import projectacme.service.Officer;
import projectacme.util.Report;
import projectacme.view.InterfaceReportsManager;
import projectacme.view.InterfaceReportsOfficer;
import projectacme.view.InterfaceViewReports;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReportsOfficerController {
    private InterfaceReportsOfficer view;
    private Officer officer;

    public ReportsOfficerController(InterfaceReportsOfficer view) {
        this.view = view;
        this.officer = UserActual.getAccessSubjectOfficer();

        view.getTextWorkers().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                createReportWorkers();
            }
        });

        view.getTextGuests().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                createReportGuests();
            }
        });

        view.getTextAccessLogs().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                createReportAccessLogs();
            }
        });

        view.getTextVehicles().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                createReportVehicles();
            }
        });
    }

    public void createReportWorkers(){
        Report report = new Report(officer.getReportsWorkers(),"Workers");
        InterfaceViewReports viewReports = new InterfaceViewReports();
        ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
        viewReports.setVisible(true);
        view.setVisible(false);
    }

    public void createReportGuests(){
        Report report = new Report(officer.getReportsGuest(),"Guests");
        InterfaceViewReports viewReports = new InterfaceViewReports();
        ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
        viewReports.setVisible(true);
        view.setVisible(false);
    }

    public void createReportVehicles(){
        Report report = new Report(officer.getReportsVehicles(),"Vehicles");
        InterfaceViewReports viewReports = new InterfaceViewReports();
        ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
        viewReports.setVisible(true);
        view.setVisible(false);
    }

    public void createReportAccessLogs(){
        Report report = new Report(officer.getReportsAccessLogs(),"Access logs");
        InterfaceViewReports viewReports = new InterfaceViewReports();
        ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
        viewReports.setVisible(true);
        view.setVisible(false);
    }


}
