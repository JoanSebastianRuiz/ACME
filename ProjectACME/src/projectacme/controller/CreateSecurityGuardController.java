package projectacme.controller;

import projectacme.UserActual;
import projectacme.view.InterfaceCreateSecurityGuard;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CreateSecurityGuardController {
    private InterfaceCreateSecurityGuard  interfaceCreateSecurityGuard;

    public CreateSecurityGuardController(InterfaceCreateSecurityGuard interfaceCreateManager) {
        this.interfaceCreateSecurityGuard = interfaceCreateManager;
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
        System.out.println("Success: -" + UserActual.getAccessSubjectManager().createSecurityGuard(id, name, phone, email, password));
    }
}
