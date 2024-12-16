package projectacme.controller;

import projectacme.UserActual;
import projectacme.model.AccessSubject;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.service.Manager;
import projectacme.service.SecurityGuard;
import projectacme.util.Enum.AccessSubjectRoleEnum;
import projectacme.util.validators.AccessSubjectValidator;
import projectacme.view.InterfaceActivateGuard;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ActivateGuardController {
    private final InterfaceActivateGuard view;
    private Manager manager;
    private final AccessSubjectImpl accessSubjectImpl = new AccessSubjectImpl();

    public ActivateGuardController(InterfaceActivateGuard view) {
        this.view = view;
        this.manager = UserActual.getAccessSubjectManager();

        view.getTextMessage().setForeground(Color.white);

        view.getTextActivate().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                inactivateSecurityGuard();
            }
        });
    }

    private void inactivateSecurityGuard(){
        String document = view.getinputID().getText();

        if(AccessSubjectValidator.accessSubjectValidator(document)){
            AccessSubject accessSubject =accessSubjectImpl.getAccessSubjectById(document);
            if(accessSubject.getRole()== AccessSubjectRoleEnum.securityGuard){
                SecurityGuard securityGuard = (SecurityGuard) accessSubject;
                boolean result = manager.activateSecurityGuard(securityGuard);

                if(result){
                    view.getinputID().setText("");
                    view.getTextMessage().setText("Security guard activated");
                    view.getTextMessage().setForeground(Color.GREEN);
                } else{
                    view.getTextMessage().setText("Invalid ID");
                    view.getTextMessage().setForeground(Color.RED);
                }
            }
            else{
                view.getTextMessage().setText("Invalid ID");
                view.getTextMessage().setForeground(Color.RED);
            }
        } else{
            view.getTextMessage().setText("Invalid ID");
            view.getTextMessage().setForeground(Color.RED);
        }

    }
}
