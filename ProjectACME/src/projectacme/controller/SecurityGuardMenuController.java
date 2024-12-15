package projectacme.controller;

import projectacme.view.InterfaceCreateSecurityGuard;
import projectacme.view.InterfaceCreateOfficer;
import projectacme.view.InterfaceViewReports;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projectacme.view.InterfaceAccssesUsers;
import projectacme.view.InterfaceCreateVehicle;
import projectacme.view.InterfaceActivateGuard;
import projectacme.view.InterfaceCreateReport;
import projectacme.view.InterfaceInactivateGuard;
import projectacme.view.InterfaceSecurityGuardMenu;

public class SecurityGuardMenuController {

    private InterfaceSecurityGuardMenu securityGuardMenuView;

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
}
