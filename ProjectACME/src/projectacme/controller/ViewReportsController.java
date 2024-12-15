/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectacme.controller;

import java.util.List;
import java.util.Map;
import projectacme.util.Report;
import projectacme.view.InterfaceViewReports;

/**
 *
 * @author ASUS
 */
public class ViewReportsController {
    InterfaceViewReports view;
    Report report;

    public ViewReportsController(InterfaceViewReports view, Report report) {
        this.view = view;
        this.report = report;
        setTitleView();
        setTable();
    }
    
    private void setTitleView(){
        view.setTitle(report.getTitle());
    }
    
    private void setTable(){
        view.setTable(report.getInformation());
    }
    
    
}
