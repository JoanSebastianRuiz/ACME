package projectacme.controller;

import projectacme.UserActual;
import projectacme.view.InterfaceCreateSecurityGuard;
import projectacme.view.InterfaceCreateOfficer;
import projectacme.view.InterfaceViewReports;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projectacme.view.InterfaceActivateGuard;
import projectacme.view.InterfaceDownloadReportsManager;
import projectacme.view.InterfaceInactivateGuard;
import projectacme.view.InterfaceManagerMenu;
import projectacme.view.InterfaceReportsManager;

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
        
        managerMenuView.getButtonViewReports().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openViewReports();
            }
        });
        
        managerMenuView.getButtonDownloadReports().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDownloadReport();
            }
        });
    }

    private void openCreateSecurityGuard() {
        InterfaceCreateSecurityGuard securityGuardView = new InterfaceCreateSecurityGuard();
        CreateSecurityGuardController securityGuardController = new CreateSecurityGuardController(securityGuardView);
        securityGuardView.setVisible(true);
        managerMenuView.dispose();
    }

    private void openCreateOfficer() {
        InterfaceCreateOfficer officerView = new InterfaceCreateOfficer();
        CreateOfficerController officerController = new CreateOfficerController(officerView);
        officerView.setVisible(true);
        managerMenuView.dispose(); 
    }
    
    private void openActivate() {
        // Crear la interfaz para Ver Reportes
        InterfaceActivateGuard view = new InterfaceActivateGuard();
        ActivateGuardController activateGuardController = new ActivateGuardController(view);
        view.setVisible(true);
        managerMenuView.dispose(); // Cierra la ventana actual
    }
    
    private void openInactivate() {
        // Crear la interfaz para Ver Reportes
        InterfaceInactivateGuard view = new InterfaceInactivateGuard();
        InactivateGuardController inactivateGuardController = new InactivateGuardController(view);
        view.setVisible(true);
        managerMenuView.dispose(); // Cierra la ventana actual
    }
    
    private void openViewReports() {
        // Crear la interfaz para Ver Reportes
        InterfaceReportsManager reportsView = new InterfaceReportsManager();
        ReportsManagerController reportsManagerController = new ReportsManagerController(reportsView);
        reportsView.setVisible(true);
        managerMenuView.dispose(); // Cierra la ventana actual
    }
    
    private void openDownloadReport() {
        // Crear la interfaz para Ver Reportes
        InterfaceDownloadReportsManager reportsView = new InterfaceDownloadReportsManager();
        DownloadReportsManagerController controller = new DownloadReportsManagerController(reportsView);
        reportsView.setVisible(true);
        managerMenuView.dispose(); // Cierra la ventana actual
    }
    
    
}

