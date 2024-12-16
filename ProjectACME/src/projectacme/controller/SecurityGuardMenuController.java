package projectacme.controller;

import projectacme.UserActual;
import projectacme.service.SecurityGuard;
import projectacme.util.Report;
import projectacme.view.InterfaceCreateSecurityGuard;
import projectacme.view.InterfaceCreateOfficer;
import projectacme.view.InterfaceViewReports;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projectacme.view.InterfaceAccssesUsers;
import projectacme.view.InterfaceCreateVehicle;
import projectacme.view.InterfaceActivateGuard;
import projectacme.view.InterfaceCreateReport;
import projectacme.view.InterfaceDownloadReportsManager;
import projectacme.view.InterfaceDownloadReportsSecurityGuard;
import projectacme.view.InterfaceInactivateGuard;
import projectacme.view.InterfaceReportsManager;
import projectacme.view.InterfaceReportsSecurityGuard;
import projectacme.view.InterfaceSecurityGuardMenu;

public class SecurityGuardMenuController {

    private InterfaceSecurityGuardMenu securityGuardMenuView;
    private SecurityGuard securityGuard = UserActual.getAccessSubjectSecurityGuard();

    public SecurityGuardMenuController(InterfaceSecurityGuardMenu securityGuardMenuView) {
        this.securityGuardMenuView = securityGuardMenuView;
        initController();  
    }

    private void initController() {
        // Agregar ActionListener a los botones
        securityGuardMenuView.getButtonIndividual().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openIndividualView();
            }
        });

        securityGuardMenuView.getButtonVehicle().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openVehicleView();
            }
        });

        securityGuardMenuView.getButtonReport().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openReportsView();
            }
        });

        securityGuardMenuView.getButtonCreateReport().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCreateReportView();
            }
        });

        securityGuardMenuView.getButtonLiveAccessLog().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Report report = new Report(securityGuard.getReportsAccessLogs(),"Live Access Log");
                InterfaceViewReports viewReports = new InterfaceViewReports();
                viewReports.getTextTitle().setText("Live Access Log");
                viewReports.getTextTitleReport().setForeground(Color.white);
                ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
                viewReports.setVisible(true);
                securityGuardMenuView.setVisible(false);
            }
        });
        
        securityGuardMenuView.getButtonViewReports().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openViewReports();
            }
        });
        
        securityGuardMenuView.getButtonDownloadReports().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDownloadReport();
            }
        });
    }

    private void openIndividualView() {
        InterfaceAccssesUsers individualView = new InterfaceAccssesUsers();
        individualView.setVisible(true);
        securityGuardMenuView.dispose(); 
    }

    private void openVehicleView() {
        InterfaceCreateVehicle vehicleView = new InterfaceCreateVehicle();
        vehicleView.setVisible(true);
        securityGuardMenuView.dispose(); 
    }

    private void openReportsView() {
        InterfaceViewReports reportsView = new InterfaceViewReports();
        reportsView.setVisible(true);
        securityGuardMenuView.dispose(); 
    }

    private void openCreateReportView() {
        InterfaceCreateReport createReportView = new InterfaceCreateReport();
        createReportView.setVisible(true);
        securityGuardMenuView.dispose(); 
    }
    
    private void openViewReports() {
        // Crear la interfaz para Ver Reportes
        InterfaceReportsSecurityGuard reportsView = new InterfaceReportsSecurityGuard();
        reportsView.setVisible(true);
        securityGuardMenuView.dispose(); // Cierra la ventana actual
    }
    
    private void openDownloadReport() {
        // Crear la interfaz para Ver Reportes
        InterfaceDownloadReportsSecurityGuard reportsView = new InterfaceDownloadReportsSecurityGuard();
        reportsView.setVisible(true);
        securityGuardMenuView.dispose(); // Cierra la ventana actual
    }
}
