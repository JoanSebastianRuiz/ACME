/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectacme.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import projectacme.util.FileManagement;
import projectacme.view.InterfaceAccessDataBase;
import projectacme.view.InterfaceActivateGuard;
import projectacme.view.InterfaceActivateManager;
import projectacme.view.InterfaceCreateManager;
import projectacme.view.InterfaceCreateOfficer;
import projectacme.view.InterfaceCreateReport;
import projectacme.view.InterfaceCreateSecurityGuard;
import projectacme.view.InterfaceInactivateGuard;
import projectacme.view.InterfaceInactivateManager;
import projectacme.view.InterfaceManagerMenu;
import projectacme.view.InterfaceSudoMenu;
import projectacme.view.InterfaceViewReports;

/**
 * Controlador principal del menú del superusuario (Sudo).
 * Maneja las acciones de los botones en la interfaz de menú de superusuario.
 * Permite la navegación hacia diferentes vistas relacionadas con la gestión de personal y reportes.
 *
 * @author Sebastian
 */
public class SudoMenuController {

    private InterfaceSudoMenu sudoMenuView;

    public SudoMenuController(InterfaceSudoMenu sudoMenuView) {
        this.sudoMenuView = sudoMenuView;
        initController();
    }

    private void initController() {
        // Agregar ActionListener a los botones
        sudoMenuView.getButtonCreateManager().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCreateManager();
            }
        });

        sudoMenuView.getButtonActivateManager().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openActivateManager();
            }
        });

        sudoMenuView.getButtonInactivateManager().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openInactivateManager();
            }
        });

        sudoMenuView.getButtonAccessDatabase().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAccessDatabase();
            }
        });


    }

    private void openCreateManager() {
        InterfaceCreateManager createManagerView = new InterfaceCreateManager();
        CreateManagerController createManagerController = new CreateManagerController(createManagerView);
        createManagerView.setVisible(true);
        sudoMenuView.dispose();
    }

    private void openActivateManager() {
        InterfaceActivateManager activateManagerView = new InterfaceActivateManager();
        activateManagerView.setVisible(true);
        sudoMenuView.dispose();
    }

    private void openInactivateManager() {
        InterfaceInactivateManager inactivateManagerView = new InterfaceInactivateManager();
        inactivateManagerView.setVisible(true);
        sudoMenuView.dispose();
    }

    private void openAccessDatabase() {
        InterfaceAccessDataBase accessDataBaseView = new InterfaceAccessDataBase();
        try {
            FileManagement.ChangeConnectionDatabase();
            sudoMenuView.dispose();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
