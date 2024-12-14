package projectacme.controller;

import projectacme.view.InterfaceCreateSecurityGuard;
import projectacme.view.InterfaceCreateOfficer;
import projectacme.view.InterfaceViewReports;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projectacme.view.InterfaceManagerMenu;

public class ManagerMenuController {

    private InterfaceManagerMenu managerMenuView;

    public ManagerMenuController(InterfaceManagerMenu managerMenuView) {
        this.managerMenuView = managerMenuView;
        initController();
    }

    private void initController() {
        // Obtener los botones de la vista del menú del manager usando los métodos get
        JButton buttonCreateGuard = managerMenuView.getButtonCreateGuard();
        JButton buttonCreateOfficer = managerMenuView.getButtonCreateOfficer();
        JButton buttonReports = managerMenuView.getButtonRegisterReport();

        // Agregar los ActionListeners a los botones
        buttonCreateGuard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCreateSecurityGuard();
            }
        });

        buttonCreateOfficer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCreateOfficer();
            }
        });

        buttonReports.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openReports();
            }
        });
    }

    private void openCreateSecurityGuard() {
        // Crear la interfaz para Crear Guardias de Seguridad
        InterfaceCreateSecurityGuard securityGuardView = new InterfaceCreateSecurityGuard();
        securityGuardView.setVisible(true);
        managerMenuView.dispose(); // Cierra la ventana actual
    }

    private void openCreateOfficer() {
        // Crear la interfaz para Crear Oficiales
        InterfaceCreateOfficer officerView = new InterfaceCreateOfficer();
        officerView.setVisible(true);
        managerMenuView.dispose(); // Cierra la ventana actual
    }

    private void openReports() {
        // Crear la interfaz para Ver Reportes
        InterfaceViewReports reportsView = new InterfaceViewReports();
        reportsView.setVisible(true);
        managerMenuView.dispose(); // Cierra la ventana actual
    }
}
