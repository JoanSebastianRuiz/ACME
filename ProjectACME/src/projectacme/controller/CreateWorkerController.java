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
        interfaceCreateWorker.getTextMessage().setForeground(Color.WHITE);
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
        boolean result = UserActual.getAccessSubjectOfficer().workerRegistration(id, name, phone, emailAddress);
        System.out.println("Success: -" + result);

        if(result){
            interfaceCreateWorker.getTextMessage().setForeground(Color.GREEN);
            interfaceCreateWorker.getTextMessage().setText("Create worker sucessfully");

            interfaceCreateWorker.getInputID().setText("");
            interfaceCreateWorker.getInputName().setText("");
            interfaceCreateWorker.getInputPhone().setText("");
            interfaceCreateWorker.getInputEmailAddress().setText("");
        } else{
            interfaceCreateWorker.getTextMessage().setForeground(Color.RED);
            interfaceCreateWorker.getTextMessage().setText("Invalid data");
        }
    }

}
