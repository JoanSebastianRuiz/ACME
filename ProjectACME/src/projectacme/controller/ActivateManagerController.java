package projectacme.controller;

import projectacme.UserActual;
import projectacme.model.AccessSubject;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.service.Manager;
import projectacme.service.Sudo;
import projectacme.util.Enum.AccessSubjectRoleEnum;
import projectacme.util.validators.AccessSubjectValidator;
import projectacme.view.InterfaceActivateManager;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ActivateManagerController {
    private InterfaceActivateManager view;
    private Sudo sudo;
    private final AccessSubjectImpl accessSubjectImpl = new AccessSubjectImpl();

    public ActivateManagerController(InterfaceActivateManager view) {
        this.view = view;
        this.sudo = UserActual.getAccessSubjectSudo();
        view.getTextMessage().setForeground(Color.white);
        view.getTextActivate().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                inactiveManager();
            }
        });
    }

    private void inactiveManager(){
        String document = view.getinputID().getText();

        if(AccessSubjectValidator.accessSubjectValidator(document)){
            AccessSubject accessSubject =accessSubjectImpl.getAccessSubjectById(document);
            if(accessSubject.getRole()== AccessSubjectRoleEnum.manager){
                Manager manager = (Manager) accessSubject;
                boolean result = sudo.activityManager(manager);

                if(result){
                    System.out.println("A");
                    view.getinputID().setText("");
                    view.getTextMessage().setText("Manager activated");
                    view.getTextMessage().setForeground(Color.GREEN);
                } else{
                    System.out.println("B");
                    view.getTextMessage().setText("Invalid ID");
                    view.getTextMessage().setForeground(Color.RED);
                }
            }
            else{
                System.out.println("C");
                view.getTextMessage().setText("Invalid ID");
                view.getTextMessage().setForeground(Color.RED);
            }
        } else{
            System.out.println("D");
            view.getTextMessage().setText("Invalid ID");
            view.getTextMessage().setForeground(Color.RED);
        }

    }
}
