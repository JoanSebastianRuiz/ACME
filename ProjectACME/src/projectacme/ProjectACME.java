/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectacme;
import projectacme.repository.implementation.AnnotationImpl;
import projectacme.util.FileManagement;
import projectacme.view.InterfaceAccessDataBase;
/**
 *
 * @author USUARIO
 */
public class ProjectACME {

    public static void main(String[] args) {
        InterfaceAccessDataBase interfaceAccessDataBase = new InterfaceAccessDataBase();
        interfaceAccessDataBase.setVisible(true);
        FileManagement.SetConnectionDatabase();
        AnnotationImpl annotation = new AnnotationImpl();
        annotation.getAllAnnotation().forEach(e -> System.out.println(e.getReason()));
    }
}


