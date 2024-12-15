package projectacme.controller;

import projectacme.model.AccessSubject;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.service.Manager;
import projectacme.service.Sudo;
import projectacme.util.Enum.AccessSubjectRoleEnum;
import projectacme.util.validators.AccessSubjectValidator;
import projectacme.view.InterfaceInactivateManager;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InactivateManagerController {
    private InterfaceInactivateManager view;
    private Sudo sudo;
    private AccessSubjectImpl accessSubjectImpl = new AccessSubjectImpl();

    public InactivateManagerController(InterfaceInactivateManager view, Sudo sudo) {
        this.view = view;
        this.sudo = sudo;
        view.getTextMessage().setForeground(Color.white);

        view.getTextInactivate().addMouseListener(new MouseAdapter() {
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
                boolean result = sudo.inactivityManager(manager);

                if(result){
                    view.getTextMessage().setText("Manager inactivated");
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
