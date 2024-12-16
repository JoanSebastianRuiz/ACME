/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectacme;
import projectacme.controller.AccessDatabaseController;
import projectacme.repository.implementation.AnnotationImpl;
import projectacme.util.FileManagement;
import projectacme.view.InterfaceAccessDataBase;
import projectacme.view.InterfaceManagerMenu;
import projectacme.view.InterfaceReportsSecurityGuard;
import projectacme.view.InterfaceSecurityGuardMenu;
import projectacme.view.InterfaceSudoMenu;
/**
 *
 * @author USUARIO
 */
public class ProjectACME {

public static void main(String[] args) {
    InterfaceReportsSecurityGuard SudoMenuView = new InterfaceReportsSecurityGuard();
        // Crear el controlador que maneja la vista
        
        // Mostrar la ventana
        SudoMenuView.setVisible(true);
    }
}


