package projectacme.controller;

import projectacme.UserActual;
import projectacme.service.Manager;
import projectacme.view.InterfaceCreateManager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CreateManagerController {

    private InterfaceCreateManager interfaceCreateManager;

    public CreateManagerController(InterfaceCreateManager createManagerView) {
        this.interfaceCreateManager = createManagerView;
        initController();
    }

    private void initController() {
        interfaceCreateManager.getTextButtonCreate().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                registerManager();
            }
        });
    }

    private void registerManager() {
        String id = interfaceCreateManager.getInputID().getText();
        String name = interfaceCreateManager.getInputName().getText();
        String phone = interfaceCreateManager.getInputPhone().getText();
        String email = interfaceCreateManager.getInputEmailAddress().getText();
        String password = new String(interfaceCreateManager.getInputPassword().getPassword());
        System.out.println("Success: -" + UserActual.getAccessSubjectSudo().creationManager(id, name, phone, email, password));
    }


}
