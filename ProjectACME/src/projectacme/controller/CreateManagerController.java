package projectacme.controller;

import projectacme.UserActual;
import projectacme.service.Manager;
import projectacme.view.InterfaceCreateManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CreateManagerController {

    private InterfaceCreateManager interfaceCreateManager;

    public CreateManagerController(InterfaceCreateManager createManagerView) {
        this.interfaceCreateManager = createManagerView;
        interfaceCreateManager.getTextMessage().setForeground(Color.WHITE);
        initController();
    }

    private void initController() {
        interfaceCreateManager.getTextButtonCreate().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                registerManager();
            }
        });
    }

    private void registerManager() {
        String id = interfaceCreateManager.getInputID().getText();
        String name = interfaceCreateManager.getInputName().getText();
        String phone = interfaceCreateManager.getInputPhone().getText();
        String email = interfaceCreateManager.getInputEmailAddress().getText();
        String password = new String(interfaceCreateManager.getInputPassword().getPassword());

        boolean result = UserActual.getAccessSubjectSudo().creationManager(id, name, phone, email, password);
        System.out.println("Success: -" + result);

        if(result){

                interfaceCreateManager.getTextMessage().setForeground(Color.GREEN);
                interfaceCreateManager.getTextMessage().setText("Create manager successfully");

                interfaceCreateManager.getInputID().setText("");
                interfaceCreateManager.getInputName().setText("");
                interfaceCreateManager.getInputPhone().setText("");
                interfaceCreateManager.getInputEmailAddress().setText("");
                interfaceCreateManager.getInputPassword().setText("");

        } else{
                interfaceCreateManager.getTextMessage().setForeground(Color.RED);
                interfaceCreateManager.getTextMessage().setText("Invalid data");
        }
    }


}
