package projectacme.controller;

import projectacme.util.ConnectionData;
import projectacme.util.FileManagement;
import projectacme.view.InterfaceAccessDataBase;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AccessDatabaseController {
    private InterfaceAccessDataBase accessDataBaseView;

    public AccessDatabaseController(InterfaceAccessDataBase accessDataBaseView) {
        System.out.println("AccessDatabaseController initialized");
        this.accessDataBaseView = accessDataBaseView;
        initController();
    }

    private void initController() {
        accessDataBaseView.getTextButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                System.out.println("Access");
                try {
                    FileManagement.SetConnectionDatabase(
                            accessDataBaseView.getInputID().getText(),
                            accessDataBaseView.getInputUser().getText(),
                            new String(accessDataBaseView.getInputPassword().getPassword()));
                    if (ConnectionData.getConnectionDatabase() == null) {
                        System.out.println("Connection Database Failed");
                        accessDataBaseView.getInputID().setForeground(Color.red);
                        accessDataBaseView.getInputUser().setForeground(Color.red);
                        accessDataBaseView.getInputPassword().setForeground(Color.red);
                    } else {
                        System.out.println("Connection Database Successfully");
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        });
    }



}
