package projectacme.service;

import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.AccessSubjectRoleEnum;

public class Officer extends User implements ReportService{
    private int idCompany;
    public Officer(String id, String name, String phone, String emailAddress, AccessSubjectRoleEnum role, StateEnum state, String password, int idCompany) {
        super(id, name, phone, emailAddress, role, state, password);
        this.idCompany = idCompany;
    }

    @Override
    public int getIdCompany() {
        return idCompany;
    }

    @Override
    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public void workerRegistration(){
        // TODO: Implement worker registration
    }

    public void guestRegistration(){
        // TODO: Implement guest registration
    }

    public void inactiveIndividual(){
        // TODO: Implement inactive individual
    }

    public void activateIndividual(){
        // TODO: Implement activate individual
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
