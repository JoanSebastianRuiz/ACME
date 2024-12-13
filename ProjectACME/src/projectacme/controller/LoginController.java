package projectacme.controller;

import java.awt.Color;
import projectacme.model.AccessSubject;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.view.IntefarceLogin;

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
        String username = loginView.getInputUsername().getText();
        String password = new String(loginView.getInputPassword().getPassword());

        // Validación de usuario a través del DAO
        AccessSubject user = accessSubjectService.getAccessSubjectById(username);
                    System.out.println("A");


        if (user != null) {
            System.out.println("User Validated: " + user.getName());
            // Abrir nueva ventana
            IntefarceLogin newWindow = new IntefarceLogin();
            newWindow.setVisible(true);
            loginView.dispose(); // Cerrar ventana actual
        } else {
            System.out.println("User Is Not Valid");
            // Mostrar error en campos
            loginView.getInputUsername().setForeground(Color.RED);
            loginView.getInputPassword().setForeground(Color.RED);
        }
    }
}