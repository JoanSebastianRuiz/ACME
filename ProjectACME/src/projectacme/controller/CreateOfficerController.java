/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectacme.controller;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.stream.Collectors;

import projectacme.UserActual;
import projectacme.repository.implementation.CompanyImpl;
import projectacme.service.Manager;
import projectacme.util.validators.*;
import projectacme.view.InterfaceCreateOfficer;
import projectacme.service.Officer;

import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class CreateOfficerController {
    private Manager manager;
    private InterfaceCreateOfficer view;
    private static final CompanyImpl companyImpl = new CompanyImpl();

    public CreateOfficerController(Manager accessSubjectManager, InterfaceCreateOfficer view) {
        this.manager = UserActual.getAccessSubjectManager();
        this.view = view;
        view.getTextButtonCreate().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String document = view.getInputID().getText();

                String name = view.getInputName().getText();
                String phone = view.getInputPhone().getText();
                String password = new String(view.getInputPassword().getPassword());
                String emailAddress = view.getInputEmailAddress().getText();
                String companyName = view.getComboCompany().getSelectedItem().toString();
                view.getTextInvalid().setForeground(Color.WHITE);

                int idCompany = companyImpl.getAllCompanies().stream()
                        .filter(element->element.getName().equals(companyName))
                        .collect(Collectors.toList()).get(0).getId();

                if(!StringValidator.StringLengthExactlyThanValidator(document, 10)
                    || AccessSubjectValidator.accessSubjectValidator(document)
                    ){
                    view.getTextInvalid().setText("Invalid ID");
                    view.getTextInvalid().setForeground(Color.RED);
                }
                else if(!StringValidator.StringLengthLessThanValidator(name, 100)){
                    view.getTextInvalid().setText("Invalid name");
                    view.getTextInvalid().setForeground(Color.RED);
                }

                else if(!PhoneValidator.phoneValidator(phone)){
                    view.getTextInvalid().setText("Invalid phone");
                    view.getTextInvalid().setForeground(Color.RED);
                }
                else if(!StringValidator.StringLengthLessThanValidator(password, 100)
                    || !StringValidator.PasswordValidator(password)){
                    view.getTextInvalid().setText("Invalid password");
                    view.getTextInvalid().setForeground(Color.RED);
                }
                else if(!EmailValidator.emailValidator(emailAddress)){
                    view.getTextInvalid().setText("Invalid email");
                    view.getTextInvalid().setForeground(Color.RED);
                }
                else if(!CompanyValidator.CompanyIdValidator(idCompany)
                    || CompanyValidator.companyHasOfficer(idCompany)){
                    view.getTextInvalid().setText("Company already has officer");
                    view.getTextInvalid().setForeground(Color.RED);
                } else{
                    manager.createOfficer(document,name,phone,emailAddress,password,idCompany);
                    view.getTextInvalid().setText("Officer added");
                    view.getTextInvalid().setForeground(Color.GREEN);

                    view.getInputName().setText("");
                    view.getInputPassword().setText("");
                    view.getInputPhone().setText("");
                    view.getInputEmailAddress().setText("");
                    view.getInputID().setText("");
                }
            }
            });

    }
    
    
    
}
