package projectacme.controller;

import projectacme.view.InterfaceOfficerMenu;
import projectacme.view.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OfficerMenuController {

    private InterfaceOfficerMenu officerMenuView;

    public OfficerMenuController(InterfaceOfficerMenu officerMenuView) {
        this.officerMenuView = officerMenuView;
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

        officerMenuView.getButtonRegisterWorker().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openRegisterWorker();
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

}
