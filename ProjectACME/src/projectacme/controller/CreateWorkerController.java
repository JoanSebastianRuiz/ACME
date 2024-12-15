package projectacme.controller;

import projectacme.UserActual;
import projectacme.repository.implementation.CompanyImpl;
import projectacme.service.Manager;
import projectacme.util.validators.*;
import projectacme.view.InterfaceCreateManager;
import projectacme.view.InterfaceCreateOfficer;
import projectacme.view.InterfaceCreateWorker;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.stream.Collectors;

public class CreateWorkerController {
    private InterfaceCreateWorker interfaceCreateWorker;

    public CreateWorkerController(InterfaceCreateWorker interfaceCreateWorker) {
        this.interfaceCreateWorker = interfaceCreateWorker;
        initController();
    }

    private void initController() {
        interfaceCreateWorker.getTextButtonCreate().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                registerWorker();
            }
        });
    }

    private void registerWorker() {
        String id = interfaceCreateWorker.getInputID().getText();
        String name = interfaceCreateWorker.getInputName().getText();
        String phone = interfaceCreateWorker.getInputPhone().getText();
        String emailAddress = interfaceCreateWorker.getInputEmailAddress().getText();

        System.out.println("Success: -" + UserActual.getAccessSubjectOfficer().workerRegistration(id, name, phone, emailAddress));

        interfaceCreateWorker.getInputID().setText("");
        interfaceCreateWorker.getInputName().setText("");
        interfaceCreateWorker.getInputPhone().setText("");
        interfaceCreateWorker.getInputEmailAddress().setText("");
    }

}
