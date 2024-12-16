package projectacme.controller;

import projectacme.UserActual;
import projectacme.service.SecurityGuard;
import projectacme.util.validators.AnnotationValidator;
import projectacme.util.validators.NumberValidator;
import projectacme.view.InterfaceCreateJustification;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

public class CreateJustificationController {
    private InterfaceCreateJustification view;
    private SecurityGuard securityGuard;

    public CreateJustificationController(InterfaceCreateJustification view) {
        this.view = view;
        securityGuard= UserActual.getAccessSubjectSecurityGuard();
        view.getTextMessage().setForeground(Color.WHITE);

        view.getTextButtonCreate().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                registerJustification();
            }
        });
    }

    private void registerJustification(){
        String reason = view.getTextReason().getText();
        String id = view.getInputID().getText();

        if(NumberValidator.isNumeric(id)){
            boolean result = securityGuard.registerJustification(reason,Integer.parseInt(id));
            if(result){
                view.getTextMessage().setText("Justification added");
                view.getTextMessage().setForeground(Color.GREEN);

                view.getInputID().setText("");
                view.getTextReason().setText("");
            } else{
                if(AnnotationValidator.annotationHasJustification(Integer.parseInt(id))){
                    view.getTextMessage().setText("Annotation already has justification");
                    view.getTextMessage().setForeground(Color.RED);
                } else{
                    view.getTextMessage().setText("Invalid annotation identifier");
                    view.getTextMessage().setForeground(Color.RED);
                }
            }
        } else{
            view.getTextMessage().setText("Invalid annotation identifier");
            view.getTextMessage().setForeground(Color.RED);
        }
    }


}
