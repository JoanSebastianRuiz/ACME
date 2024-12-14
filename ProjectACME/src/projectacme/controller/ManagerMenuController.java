package projectacme.controller;

import projectacme.view.InterfaceCreateSecurityGuard;
import projectacme.view.InterfaceCreateOfficer;
import projectacme.view.InterfaceViewReports;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projectacme.view.InterfaceActivateGuard;
import projectacme.view.InterfaceCreateReport;
import projectacme.view.InterfaceInactivateGuard;
import projectacme.view.InterfaceManagerMenu;

public class ManagerMenuController {

    private InterfaceManagerMenu managerMenuView;

    public ManagerMenuController(InterfaceManagerMenu managerMenuView) {
        this.managerMenuView = managerMenuView;
        initController();  
    }

    private void initController() {
        // Agregar ActionListener a los botones
        managerMenuView.getButtonCreateGuard().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCreateSecurityGuard();
            }
        });

        managerMenuView.getButtonCreateOfficer().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCreateOfficer();
            }
        });

        managerMenuView.getButtonReports().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openReports();
            }
        });
        managerMenuView.getButtonActivate().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openActivate();
            }
        });
        managerMenuView.getButtonInactive().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openInactivate();
            }
        });
        
        managerMenuView.ButtonRegisterReport().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCreateReport();
            }
        });
    }

    private void openCreateSecurityGuard() {
        InterfaceCreateSecurityGuard securityGuardView = new InterfaceCreateSecurityGuard();
        securityGuardView.setVisible(true);
        managerMenuView.dispose(); 
    }

    private void openCreateOfficer() {
        InterfaceCreateOfficer officerView = new InterfaceCreateOfficer();
        officerView.setVisible(true);
        managerMenuView.dispose(); 
    }

    private void openReports() {
        // Crear la interfaz para Ver Reportes
        InterfaceViewReports reportsView = new InterfaceViewReports();
        reportsView.setVisible(true);
        managerMenuView.dispose(); // Cierra la ventana actual
    }
    
    private void openActivate() {
        // Crear la interfaz para Ver Reportes
        InterfaceActivateGuard reportsView = new InterfaceActivateGuard();
        reportsView.setVisible(true);
        managerMenuView.dispose(); // Cierra la ventana actual
    }
    
    private void openInactivate() {
        // Crear la interfaz para Ver Reportes
        InterfaceInactivateGuard reportsView = new InterfaceInactivateGuard();
        reportsView.setVisible(true);
        managerMenuView.dispose(); // Cierra la ventana actual
    }
    
    private void openCreateReport() {
        // Crear la interfaz para Ver Reportes
        InterfaceCreateReport reportsView = new InterfaceCreateReport();
        reportsView.setVisible(true);
        managerMenuView.dispose(); // Cierra la ventana actual
    }
    
    
}

