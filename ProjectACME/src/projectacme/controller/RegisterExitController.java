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
        registerExitView.getTextMessage().setForeground(Color.WHITE);
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
        try {
            if(!UserActual.getAccessSubjectOfficer().registerAccess(ScannerType.exit, registerExitView.getinputID().getText())){
                registerExitView.getinputID().setForeground(Color.RED);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
            if (!UserActual.getAccessSubjectSecurityGuard().registerAccess(ScannerType.exit, registerExitView.getinputID().getText())) {
            registerExitView.getinputID().setForeground(Color.RED);
            registerExitView.getTextMessage().setText("Successful exit recorded");
            registerExitView.getTextMessage().setForeground(Color.GREEN);
        } else{
            registerExitView.getTextMessage().setText("Invalid data");
            registerExitView.getTextMessage().setForeground(Color.RED);
        }
    }
}
