package projectacme.service;

import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.UserRoleEnum;

public class Manager extends User implements ReportService{
    public Manager(String id, String name, String phone, String emailAddress, UserRoleEnum role, StateEnum state, String password) {
        super(id, name, phone, emailAddress, role, state, password);
    }

    public void createSecurityGuard() {
        // TODO: Implement create security guard
    }

    public void createOfficer() {
        // TODO: Implement create officer
    }

    public void getReportsSecurityGuard() {
        // TODO: Implement get reports for security guard
    }

    public void inactivateSecurityGuard() {
        // TODO: Implement inactivate security guard
    }

    public  void activateSecurityGuard() {
        // TODO: Implement activate security guard
    }

    @Override
    public void getReportsWorkers() {

    }

    @Override
    public void getReportsGuest() {

    }

    @Override
    public void getReportsIndividuals() {

    }
}
