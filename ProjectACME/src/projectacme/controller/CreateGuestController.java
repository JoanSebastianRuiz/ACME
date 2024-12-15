package projectacme.controller;

import projectacme.UserActual;
import projectacme.view.InterfaceCreateGuest;
import projectacme.view.InterfaceCreateWorker;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class CreateGuestController {
    private InterfaceCreateGuest interfaceCreateGuest;

    public CreateGuestController(InterfaceCreateGuest interfaceCreateGuest) {
        this.interfaceCreateGuest = interfaceCreateGuest;
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

        System.out.println("Success: -" + UserActual.getAccessSubjectOfficer().guestRegistration(id, name, phone, emailAddress));

        interfaceCreateGuest.getInputID().setText("");
        interfaceCreateGuest.getInputName().setText("");
        interfaceCreateGuest.getInputPhone().setText("");
        interfaceCreateGuest.getInputEmailAddress().setText("");
    }

}
