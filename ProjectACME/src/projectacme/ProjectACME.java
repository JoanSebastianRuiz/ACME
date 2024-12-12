/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectacme;

import projectacme.model.AccessSubject;
import projectacme.service.Manager;
import projectacme.service.Officer;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.UserRoleEnum;
//import projectacme.view.IntefarceLogin;

import java.util.List;
import java.util.Map;
import projectacme.view.IntefaceCreateWorker;
import projectacme.view.IntefarceLogin;
import projectacme.view.InterfaceCreateGuest;
import projectacme.view.InterfaceCreateOfficer;
import projectacme.view.InterfaceCreateSecurityGuard;
import projectacme.view.InterfaceSudoCreate;

/**
 *
 * @author USUARIO
 */
public class ProjectACME {

    public static void main(String[] args) {
        InterfaceSudoCreate ventana = new InterfaceSudoCreate();
        
        ventana.setVisible(true);
        
    }
    
}
