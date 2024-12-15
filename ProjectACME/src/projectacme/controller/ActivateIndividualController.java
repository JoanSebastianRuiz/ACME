package projectacme.controller;

import projectacme.model.AccessSubject;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.service.Individual;
import projectacme.service.Officer;
import projectacme.util.Enum.AccessSubjectRoleEnum;
import projectacme.util.validators.AccessSubjectValidator;
import projectacme.view.InterfaceActivateIndividual;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ActivateIndividualController {
    private final InterfaceActivateIndividual view;
    private Officer officer;
    private final AccessSubjectImpl accessSubjectImpl = new AccessSubjectImpl();

    public ActivateIndividualController(InterfaceActivateIndividual view, Officer officer) {
        this.view = view;
        this.officer = officer;

        view.getTextMessage().setForeground(Color.white);

        view.getTextActivate().addMouseListener(new MouseAdapter() {
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
                boolean result = officer.activateIndividual(individual);

                if(result){
                    view.getinputID().setText("");
                    view.getTextMessage().setText("Person activated");
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
