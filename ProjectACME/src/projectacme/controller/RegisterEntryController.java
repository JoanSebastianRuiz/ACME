package projectacme.controller;

import projectacme.UserActual;
import projectacme.util.Enum.AccessSubjectRoleEnum;
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
        if(UserActual.getAccessSubject().getRole()== AccessSubjectRoleEnum.officer) {
            boolean result = UserActual.getAccessSubjectOfficer().registerAccess(ScannerType.entry, registerExitView.getinputID().getText());
            if (result) {
                registerExitView.getTextMessage().setText("Successful entry recorded");
                registerExitView.getTextMessage().setForeground(Color.GREEN);
                registerExitView.getinputID().setText("");
            } else {
                registerExitView.getinputID().setForeground(Color.RED);

            }
        } else if (UserActual.getAccessSubject().getRole()== AccessSubjectRoleEnum.securityGuard) {
            boolean result = UserActual.getAccessSubjectSecurityGuard().registerAccess(ScannerType.entry, registerExitView.getinputID().getText());
            if (result) {
                registerExitView.getTextMessage().setText("Successful entry recorded");
                registerExitView.getTextMessage().setForeground(Color.GREEN);
                registerExitView.getinputID().setText("");
                System.out.println("True security guard");
            } else {
                registerExitView.getTextMessage().setText("Invalid data");
                registerExitView.getTextMessage().setForeground(Color.RED);
                System.out.println("False security guard");
            }
        }

    }
}
