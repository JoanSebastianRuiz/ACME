package projectacme.service;

import projectacme.model.AccessSubject;
import projectacme.repository.implementation.ReportManagerImpl;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.UserRoleEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Manager extends User implements ReportService{
    private final ReportManagerImpl reportManagerImpl= new ReportManagerImpl();
    public Manager(String id, String name, String phone, String emailAddress, UserRoleEnum role, StateEnum state, String password) {
        super(id, name, phone, emailAddress, role, state, password);
    }


    public void createSecurityGuard() {
        // TODO: Implement create security guard
    }

    public void createOfficer() {
        // TODO: Implement create officer
    }

    public List<Map<String,Object>> getReportsSecurityGuard() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("role").equals("securityGuard"))
                .collect(Collectors.toList());
    }

    public void inactivateSecurityGuard() {
        // TODO: Implement inactivate security guard
    }

    public  void activateSecurityGuard() {
        // TODO: Implement activate security guard
    }

    @Override
    public List<Map<String,Object>> getReportsWorkers() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("role").equals("worker"))
                .collect(Collectors.toList());
    }

    @Override
    public List<Map<String,Object>> getReportsGuest() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("role").equals("worker"))
                .collect(Collectors.toList());
    }

    @Override
    public List<Map<String, Object>> getReportsIndividuals() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("role").equals("worker") || element.get("role").equals("guest"))
                .collect(Collectors.toList());
    }

    public List<Map<String, Object>> getReportsOfficers() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("role").equals("officer"))
                .collect(Collectors.toList());
    }
}
