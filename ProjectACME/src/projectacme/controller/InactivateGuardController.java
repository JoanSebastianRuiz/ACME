package projectacme.controller;

import projectacme.model.AccessSubject;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.service.Manager;
import projectacme.service.SecurityGuard;
import projectacme.util.Enum.AccessSubjectRoleEnum;
import projectacme.util.validators.AccessSubjectValidator;
import projectacme.view.InterfaceInactivateGuard;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InactivateGuardController {
    private final InterfaceInactivateGuard view;
    private Manager manager;
    private final AccessSubjectImpl accessSubjectImpl = new AccessSubjectImpl();

    public InactivateGuardController(InterfaceInactivateGuard view, Manager manager) {
        this.view = view;
        this.manager = manager;

        view.getTextMessage().setForeground(Color.white);

        view.getTextInactivate().addMouseListener(new MouseAdapter() {
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
                boolean result = manager.inactivateSecurityGuard(securityGuard);

                if(result){
                    view.getinputID().setText("");
                    view.getTextMessage().setText("Security guard inactivated");
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
