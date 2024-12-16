package projectacme.controller;

import projectacme.UserActual;
import projectacme.util.Enum.ScannerType;
import projectacme.view.InterfaceRegisterEntry;
import projectacme.view.InterfaceRegisterExit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterEntryController {

    private InterfaceRegisterEntry registerExitView;

    public RegisterEntryController(InterfaceRegisterEntry registerEntryView) {
        this.registerExitView = registerEntryView;
        initController();
    }

    public void initController() {
        registerExitView.getTextMessage().setForeground(Color.WHITE);
        registerExitView.getTextRegister().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                registerExit();
            }
        });
    }

    public void registerExit(){
        try {
            if(UserActual.getAccessSubjectOfficer().registerAccess(ScannerType.entry, registerExitView.getinputID().getText())){
                registerExitView.getTextMessage().setText("Successful entry recorded");
                registerExitView.getTextMessage().setForeground(Color.GREEN);
            } else{
                registerExitView.getinputID().setForeground(Color.RED);
                registerExitView.getTextMessage().setText("Invalid data");
                registerExitView.getTextMessage().setForeground(Color.RED);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
            if (UserActual.getAccessSubjectSecurityGuard().registerAccess(ScannerType.entry, registerExitView.getinputID().getText())) {
                registerExitView.getTextMessage().setText("Successful exit recorded");
                registerExitView.getTextMessage().setForeground(Color.GREEN);
            } else{
                registerExitView.getinputID().setForeground(Color.RED);
            }
        }
    }
}
