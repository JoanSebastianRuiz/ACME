package projectacme.controller;

import projectacme.UserActual;
import projectacme.view.InterfaceCreateSecurityGuard;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CreateSecurityGuardController {
    private InterfaceCreateSecurityGuard  interfaceCreateSecurityGuard;

    public CreateSecurityGuardController(InterfaceCreateSecurityGuard interfaceCreateManager) {
        this.interfaceCreateSecurityGuard = interfaceCreateManager;
        interfaceCreateSecurityGuard.getTextMessage().setForeground(Color.WHITE);
        initController();
    }

    private void initController() {
        interfaceCreateSecurityGuard.getTextButtonCreate().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                registerManager();
            }
        });
    }

    private void registerManager() {
        String id = interfaceCreateSecurityGuard.getInputID().getText();
        String name = interfaceCreateSecurityGuard.getInputName().getText();
        String phone = interfaceCreateSecurityGuard.getInputPhone().getText();
        String email = interfaceCreateSecurityGuard.getInputEmailAddress().getText();
        String password = new String(interfaceCreateSecurityGuard.getInputPassword().getPassword());
        boolean result = UserActual.getAccessSubjectManager().createSecurityGuard(id, name, phone, email, password);
        System.out.println("Success: -" +result );

        if(result){
            interfaceCreateSecurityGuard.getTextMessage().setForeground(Color.GREEN);
            interfaceCreateSecurityGuard.getTextMessage().setText("Create security guard sucessfully");

            interfaceCreateSecurityGuard.getInputID().setText("");
            interfaceCreateSecurityGuard.getInputName().setText("");
            interfaceCreateSecurityGuard.getInputPhone().setText("");
            interfaceCreateSecurityGuard.getInputEmailAddress().setText("");
            interfaceCreateSecurityGuard.getInputPassword().setText("");
        } else{
            interfaceCreateSecurityGuard.getTextMessage().setForeground(Color.RED);
            interfaceCreateSecurityGuard.getTextMessage().setText("Invalid data");
        }
    }
}
