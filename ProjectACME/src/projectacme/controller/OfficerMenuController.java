package projectacme.controller;

import projectacme.UserActual;
import projectacme.service.Officer;
import projectacme.util.Report;
import projectacme.view.InterfaceOfficerMenu;
import projectacme.view.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OfficerMenuController {

    private InterfaceOfficerMenu officerMenuView;
    private Officer officer;

    public OfficerMenuController(InterfaceOfficerMenu officerMenuView) {
        this.officerMenuView = officerMenuView;
        this.officer = UserActual.getAccessSubjectOfficer();
        initController();
    }

    private void initController() {
        // Agregar ActionListener a los botones
        officerMenuView.getButtonActivateIndividual().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openActivateIndividual();
            }
        });

        officerMenuView.getButtonInactivateIndividual().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openInactivateIndividual();
            }
        });

        officerMenuView.getButtonRegisterGuest().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openRegisterGuest();
            }
        });

        officerMenuView.getButtonRegisterExit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openRegisterExit();
            }
        });
        
        officerMenuView.getButtonViewReports().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openViewReports();
            }
        });
        
        officerMenuView.getButtonDownloadReports().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDownloadReport();
            }
        });

        officerMenuView.getButtonLiveAccessLog().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Report report = new Report(officer.getReportsAccessLogs(),"Live Access Log");
                InterfaceViewReports viewReports = new InterfaceViewReports();
                viewReports.getTextTitle().setText("Live Access Log");
                viewReports.getTextTitleReport().setForeground(Color.white);
                ViewReportsController viewReportsController = new ViewReportsController(viewReports, report);
                viewReports.setVisible(true);
                officerMenuView.setVisible(false);
            }
        });
    }

    private void openActivateIndividual() {
        // Crear la interfaz para Activar Individuo
        InterfaceActivateIndividual activateView = new InterfaceActivateIndividual();
        activateView.setVisible(true);
        officerMenuView.dispose(); // Cierra la ventana actual
    }

    private void openInactivateIndividual() {
        // Crear la interfaz para Inactivar Individuo
        InterfaceInactivateIndividual inactivateView = new InterfaceInactivateIndividual();
        inactivateView.setVisible(true);
        officerMenuView.dispose(); // Cierra la ventana actual
    }

    private void openRegisterGuest() {
        // Crear la interfaz para Registrar Invitado
        InterfaceCreateGuest registerGuestView = new InterfaceCreateGuest();
        CreateGuestController createGuestController = new CreateGuestController(registerGuestView);
        registerGuestView.setVisible(true);
        officerMenuView.dispose(); // Cierra la ventana actual
    }

    private void openRegisterWorker() {
        // Crear la interfaz para Registrar Trabajador
        InterfaceCreateWorker registerWorkerView = new InterfaceCreateWorker();
        CreateWorkerController createWorkerController = new CreateWorkerController(registerWorkerView);
        registerWorkerView.setVisible(true);
        officerMenuView.dispose(); // Cierra la ventana actual
    }

    private void openRegisterExit() {
        InterfaceRegisterExit registerExit = new InterfaceRegisterExit();
        RegisterExitController registerExitController = new RegisterExitController(registerExit);
        registerExit.setVisible(true);
        officerMenuView.dispose();
    }
    
    private void openViewReports() {
        InterfaceReportsSecurityGuard reportsView = new InterfaceReportsSecurityGuard();
        reportsView.setVisible(true);
        officerMenuView.dispose(); 
    }
    
    private void openDownloadReport() {
        // Crear la interfaz para Ver Reportes
        InterfaceDownloadReportsSecurityGuard reportsView = new InterfaceDownloadReportsSecurityGuard();
        reportsView.setVisible(true);
        officerMenuView.dispose(); // Cierra la ventana actual
    }
    
}
