package projectacme.controller;

import projectacme.UserActual;
import projectacme.service.SecurityGuard;
import projectacme.util.Report;
import projectacme.view.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projectacme.view.InterfaceAccssesUsers;
import projectacme.view.InterfaceCreateVehicle;
import projectacme.view.InterfaceActivateGuard;
import projectacme.view.InterfaceDownloadReportsManager;
import projectacme.view.InterfaceDownloadReportsSecurityGuard;
import projectacme.view.InterfaceInactivateGuard;
import projectacme.view.InterfaceRegisterExit;
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

        securityGuardMenuView.getButtonVehicle().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openVehicleView();
            }
        });

        securityGuardMenuView.getButtonLiveAccessLog().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Report report = new Report(securityGuard.getReportsAccessLogs(),"Live Access Log");
                InterfaceViewReports viewReports = new InterfaceViewReports();
                viewReports.getTextTitle().setText("Live Access Log");
                viewReports.getTextTitleReport().setForeground(Color.white);
                ViewReportsController viewReportsController = new ViewReportsController(viewReports, report, securityGuard.getRole().toString());
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
        
        securityGuardMenuView.getButtonRegisterEntrty().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openRegisterEntry();
            }
        });
        securityGuardMenuView.getButtonRegisterExit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openRegisterExit();
            }
        });
    }

    private void openRegisterEntry() {
        System.out.println("A");
        InterfaceRegisterEntry interfaceRegisterEntry = new InterfaceRegisterEntry();
        RegisterEntryController registerExitController = new RegisterEntryController(interfaceRegisterEntry);
        interfaceRegisterEntry.setVisible(true);
        securityGuardMenuView.dispose();
        
    }
    
     private void openRegisterExit() {
                 System.out.println("B");
         InterfaceRegisterExit interfaceRegisterExit = new InterfaceRegisterExit();
         RegisterExitController registerExitController = new RegisterExitController(interfaceRegisterExit);
         interfaceRegisterExit.setVisible(true);
         securityGuardMenuView.dispose();
        
    }


    private void openVehicleView() {
        InterfaceCreateVehicle vehicleView = new InterfaceCreateVehicle();
        CreateVehicleController createVehicleController = new CreateVehicleController(vehicleView);
        vehicleView.setVisible(true);
        securityGuardMenuView.dispose(); 
    }
    
    private void openViewReports() {
        
        InterfaceReportsSecurityGuard reportsView = new InterfaceReportsSecurityGuard();
        ReportsSecurityGuardController reportsSecurityGuardController = new ReportsSecurityGuardController(reportsView);
        reportsView.setVisible(true);
        securityGuardMenuView.dispose(); 
    }
    
    private void openDownloadReport() {
        
        InterfaceDownloadReportsSecurityGuard reportsView = new InterfaceDownloadReportsSecurityGuard();
        DownloadReportsSecurityGuardController downloadReportsSecurityGuardController = new DownloadReportsSecurityGuardController(reportsView);
        reportsView.setVisible(true);
        securityGuardMenuView.dispose(); 
    }
    
    private void openRegisterExit() {
       
        InterfaceRegisterExit reportsView = new InterfaceRegisterExit();
        RegisterExitController RegisterExitController = new RegisterExitController(reportsView);
        reportsView.setVisible(true);
        securityGuardMenuView.dispose(); 
    }
}
