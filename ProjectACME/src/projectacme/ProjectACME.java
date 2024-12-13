/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectacme;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import projectacme.controller.LoginController;
import projectacme.factory.AccessSubjectFactory;
import projectacme.model.AccessSubject;
import projectacme.service.Manager;
import projectacme.service.Officer;
import projectacme.util.Enum.AccessSubjectRoleEnum;
import projectacme.util.Enum.StateEnum;
import projectacme.util.ThreadReportManage;
import projectacme.util.pdf.PdfGenerator;
import projectacme.view.IntefarceLogin;
//import projectacme.view.IntefarceLogin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import javax.swing.JFrame;
//import projectacme.view.IntefaceCreateWorker;
//import projectacme.view.IntefarceLogin;
//import projectacme.view.InterfaceCreateGuest;
//import projectacme.view.InterfaceCreateOfficer;
//import projectacme.view.InterfaceCreateSecurityGuard;
//import projectacme.view.InterfaceSudoCreate;
//import projectacme.view.InterfaceSecurityGuardMenu;

/**
 *
 * @author USUARIO
 */
public class ProjectACME {

    public static void main(String[] args) {
        Manager manager = (Manager)AccessSubjectFactory.createAccessSubject("","","","",AccessSubjectRoleEnum.manager,StateEnum.active,"",null);
        Map<String, Supplier<List<Map<String, Object>>>> reportFunctions = new HashMap<>();
        reportFunctions.put("Report",()->manager.getReportsOfficers());
        ThreadReportManage.generateReports(reportFunctions);
    }


}


