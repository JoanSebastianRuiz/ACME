package projectacme.controller;

import projectacme.UserActual;
import projectacme.service.SecurityGuard;
import projectacme.util.validators.AccessSubjectValidator;
import projectacme.util.validators.PlateValidator;
import projectacme.view.InterfaceCreateVehicle;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CreateVehicleController {
    InterfaceCreateVehicle view;
    SecurityGuard securityGuard;

    public CreateVehicleController(InterfaceCreateVehicle view) {
        this.view = view;
        this.securityGuard = UserActual.getAccessSubjectSecurityGuard();
        view.getTextMessage().setForeground(Color.white);
        view.getButtonCreate().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                createVehicle();
            }
        });
    }

    private void createVehicle(){
        String document = view.getinputID().getText();
        String plate = view.getInputPlate().getText();
        String type = view.getComboType().getSelectedItem().toString();

        if(PlateValidator.plateCarValidator(plate) || PlateValidator.plateMotorcycleValidator(plate)){
            if(!PlateValidator.plateExist(plate)){
                if(AccessSubjectValidator.accessSubjectValidator(document)){
                    securityGuard.registerPlate(plate, document);
                } else{
                    view.getTextMessage().setText("Invalid ID");
                    view.getTextMessage().setForeground(Color.RED);
                }
            } else{
                view.getTextMessage().setText("Plate already registered");
                view.getTextMessage().setForeground(Color.RED);
            }
        }else{
            view.getTextMessage().setText("Plate format invalid");
            view.getTextMessage().setForeground(Color.RED);
        }
    }
}
