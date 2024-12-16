package projectacme.controller;

import projectacme.UserActual;
import projectacme.model.AccessSubject;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.service.Individual;
import projectacme.service.Manager;
import projectacme.service.Officer;
import projectacme.util.Enum.AccessSubjectRoleEnum;
import projectacme.util.validators.AccessSubjectValidator;
import projectacme.view.InterfaceInactivateIndividual;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InactivateIndividualController {
    private final InterfaceInactivateIndividual view;
    private Officer officer;
    private final AccessSubjectImpl accessSubjectImpl = new AccessSubjectImpl();

    public InactivateIndividualController(InterfaceInactivateIndividual view) {
        this.view = view;
        this.officer = UserActual.getAccessSubjectOfficer();

        view.getTextMessage().setForeground(Color.white);

        view.getTextInactivate().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                inactiveIndividual();
            }
        });
    }

    private void inactiveIndividual(){
        String document = view.getinputID().getText();

        if(AccessSubjectValidator.accessSubjectValidator(document)){
            AccessSubject accessSubject =accessSubjectImpl.getAccessSubjectById(document);
            if(accessSubject.getRole()== AccessSubjectRoleEnum.worker || accessSubject.getRole()== AccessSubjectRoleEnum.guest){
                Individual individual = (Individual) accessSubject;
                boolean result = officer.inactiveIndividual(individual);

                if(result){
                    view.getinputID().setText("");
                    view.getTextMessage().setText("Person inactivated");
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
