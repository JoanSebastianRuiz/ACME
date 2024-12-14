package projectacme.controller;

import projectacme.service.SecurityGuard;
import projectacme.util.Enum.ScannerType;

import java.util.List;
import java.util.Map;

public class SecurityGuardController {
    private final SecurityGuard securityGuardService;

    public SecurityGuardController(SecurityGuard securityGuardService) {
        this.securityGuardService = securityGuardService;
    }

    public void registerAccess(ScannerType type, String id) {
        securityGuardService.registerAccess(type, id);
        System.out.println("Access registered successfully");
    }

    public void viewUserAnnotation() {
        securityGuardService.getReportAnnotations();
        System.out.println("User annotation viewed");
    }

    public void registerAnnotation(String reason, Boolean suspended, String idAccessSubject) {
        securityGuardService.registerAnnotation(reason, suspended, idAccessSubject);
        System.out.println("Annotation registered");
    }

    public void registerPlate(String plate, String id) {
        securityGuardService.registerPlate(plate, id);
        System.out.println("Plate registered");
    }

    public void getReportsAccessSubjects() {
        securityGuardService.getReportsAccessSubjects();
        System.out.println("AccessSubject report retrieved");
    }

    public void getReportsVehicles() {
        List<Map<String, Object>> reports = securityGuardService.getReportsVehicles();
        System.out.println("Vehicle reports retrieved: " + reports);
    }
}
