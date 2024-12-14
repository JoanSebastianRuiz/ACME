/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectacme;
import projectacme.repository.implementation.AnnotationImpl;
import projectacme.util.FileManagement;
import projectacme.view.InterfaceAccessDataBase;
import projectacme.view.InterfaceManagerMenu;
import projectacme.view.InterfaceSudoMenu;
/**
 *
 * @author USUARIO
 */
public class ProjectACME {

    public static void main(String[] args) {
        // Crear la vista principal (menú del manager)
        InterfaceSudoMenu accessDatabase= new InterfaceSudoMenu();
        // Crear el controlador que maneja la vista
        
        // Mostrar la ventana
        accessDatabase.setVisible(true);
    }
}


