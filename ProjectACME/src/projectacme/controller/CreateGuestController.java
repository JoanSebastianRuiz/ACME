package projectacme.controller;

import projectacme.UserActual;
import projectacme.view.InterfaceCreateGuest;
import projectacme.view.InterfaceCreateWorker;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class CreateGuestController {
    private InterfaceCreateGuest interfaceCreateGuest;

    public CreateGuestController(InterfaceCreateGuest interfaceCreateGuest) {
        this.interfaceCreateGuest = interfaceCreateGuest;
        interfaceCreateGuest.getTextMessage().setForeground(Color.WHITE);
        initController();
    }

    private void initController() {
        interfaceCreateGuest.getTextButtonCreate().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                registerGuest();
            }
        });
    }

    private void registerGuest() {
        String id = interfaceCreateGuest.getInputID().getText();
        String name = interfaceCreateGuest.getInputName().getText();
        String phone = interfaceCreateGuest.getInputPhone().getText();
        String emailAddress = interfaceCreateGuest.getInputEmailAddress().getText();

        boolean result = UserActual.getAccessSubjectOfficer().guestRegistration(id, name, phone, emailAddress);
        System.out.println("Success: -" +result );

        if(result){
            interfaceCreateGuest.getTextMessage().setForeground(Color.GREEN);
            interfaceCreateGuest.getTextMessage().setText("Create guest sucessfully");
        } else{
            interfaceCreateGuest.getTextMessage().setForeground(Color.RED);
            interfaceCreateGuest.getTextMessage().setText("Invalid data");

            interfaceCreateGuest.getInputID().setText("");
            interfaceCreateGuest.getInputName().setText("");
            interfaceCreateGuest.getInputPhone().setText("");
            interfaceCreateGuest.getInputEmailAddress().setText("");
        }


    }

}
