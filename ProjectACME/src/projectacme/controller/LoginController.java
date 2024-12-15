package projectacme.controller;

import java.awt.Color;

import projectacme.UserActual;
import projectacme.model.AccessSubject;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.util.Login;
import projectacme.view.*;

import javax.swing.*;

public class LoginController {

    private IntefarceLogin loginView;
    private AccessSubjectImpl accessSubjectService;

    public LoginController(IntefarceLogin loginView) {
        this.loginView = loginView;
        this.accessSubjectService = new AccessSubjectImpl();
        initController();
    }

    private void initController() {
        loginView.getTextButtonEnter().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handleLogin();
            }
        });
    }

    private void handleLogin() {
        String identification = loginView.getInputUsername().getText();
        String password = new String(loginView.getInputPassword().getPassword());
        AccessSubject user = accessSubjectService.getAccessSubjectById(identification);
        if (user != null) {
            if (Login.validationUser(identification, password)) {
                UserActual.setAccessSubject(user);
                System.out.println("User Validated: " + user.getName());
                JFrame newWindow = switch (user.getRole()) {
                    case sudo -> new InterfaceSudoMenu();
                    case officer -> new InterfaceOfficerMenu();
                    case manager -> new InterfaceManagerMenu();
                    case securityGuard -> new InterfaceSecurityGuardMenu();
                    default -> null;
                };
                if (newWindow != null){
                newWindow.setVisible(true);
                }
            loginView.dispose(); // * Close Actual Window
            } else {
            System.out.println("User Is Not Valid");
            loginView.getInputUsername().setForeground(Color.RED);
            loginView.getInputPassword().setForeground(Color.RED);
            }
        } else {
            System.out.println("User Is Not Valid");
            loginView.getInputUsername().setForeground(Color.RED);
            loginView.getInputPassword().setForeground(Color.RED);
        }
    }
}