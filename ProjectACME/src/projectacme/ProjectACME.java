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
//import projectacme.view.InterfaceSudo;

import java.util.List;
import java.util.Map;

/**
 *
 * @author USUARIO
 */
public class ProjectACME {

    public static void main(String[] args) {
        Officer manager = new Officer("","","","", UserRoleEnum.manager, StateEnum.active,
                "",1);
        List<Map<String,Object>> securityGuards = manager.getReportsIndividuals();
        securityGuards.forEach(System.out::println);
        
    }
    
}
