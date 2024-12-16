/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectacme.controller;

import java.util.List;
import java.util.Map;
import projectacme.UserActual;
import projectacme.util.Report;
import projectacme.util.ThreadAccess;
import projectacme.view.InterfaceViewReports;

/**
 *
 * @author ASUS
 */
public class ViewReportsController {
    InterfaceViewReports view;
    Report report;
    ThreadAccess threadAccess;
    String role;

    public ViewReportsController(InterfaceViewReports view, Report report, String role) {
        this.threadAccess = new ThreadAccess();
        this.view = view;
        this.report = report;
        this.role = role;
        setTitleView();
        setTable2();
    }
    
     public ViewReportsController(InterfaceViewReports view, Report report) {
        this.threadAccess = new ThreadAccess();
        this.view = view;
        this.report = report;
        setTitleView();
        setTable1();
    }
    
    private void setTitleView(){
        view.setTitle(report.getTitle());
    }
    
    private void setTable2(){
        System.out.println("Table Rendered");
        threadAccess.setRole(role);
        threadAccess.setView(view);
        threadAccess.start();
    }
    
    private void setTable1(){
        view.setTable(report.getInformation());
    }
    
    private void shutdownThread(){
        threadAccess.stopThread();
    }
}
