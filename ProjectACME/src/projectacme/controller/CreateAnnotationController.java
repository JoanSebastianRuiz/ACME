package projectacme.controller;

import projectacme.UserActual;
import projectacme.service.SecurityGuard;
import projectacme.view.InterfaceCreateAnnotation;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

public class CreateAnnotationController {
    private InterfaceCreateAnnotation view;
    private SecurityGuard securityGuard;

    public CreateAnnotationController(InterfaceCreateAnnotation view) {
        this.view = view;
        this.securityGuard= UserActual.getAccessSubjectSecurityGuard();
        view.getTextMessage().setForeground(Color.WHITE);

        view.getTextButtonCreate().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                registerAnnotation();
            }
        });
    }

    private void registerAnnotation(){
        String reason = view.getTextReason().getText();
        String document = view.getInputID().getText();
        boolean suspended=false;

        if(Objects.requireNonNull(view.getComboSuspended().getSelectedItem()).toString().equals("Yes")){
            suspended = true;
        }

        boolean result = securityGuard.registerAnnotation(reason, suspended,document);
        if(result){
            view.getTextMessage().setText("Annotation added");
            view.getTextMessage().setForeground(Color.GREEN);

            view.getInputID().setText("");
            view.getTextReason().setText("");
        } else{
            view.getTextMessage().setText("Invalid data");
            view.getTextMessage().setForeground(Color.RED);
        }
    }
}
