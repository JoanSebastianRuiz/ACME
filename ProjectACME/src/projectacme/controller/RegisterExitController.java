package projectacme.controller;

import projectacme.UserActual;
import projectacme.util.Enum.ScannerType;
import projectacme.view.InterfaceRegisterExit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterExitController {

    private InterfaceRegisterExit registerExitView;

    public RegisterExitController(InterfaceRegisterExit registerExitView) {
        this.registerExitView = registerExitView;
        initController();
    }

    public void initController() {
        registerExitView.getTextRegister().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                registerExit();
            }
        });
    }

    public void registerExit(){
        if (!UserActual.getAccessSubjectOfficer().registerAccess(ScannerType.exit, registerExitView.getinputID().getText())) {
            registerExitView.getinputID().setForeground(Color.RED);
        };
    }
}
