package projectacme.service;

import projectacme.repository.implementation.ReportManagerImpl;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.UserRoleEnum;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Officer extends User implements ReportService{
    private int idCompany;
    private final ReportManagerImpl reportManagerImpl = new ReportManagerImpl();

    public Officer(String id, String name, String phone, String emailAddress, UserRoleEnum role, StateEnum state, String password, int idCompany) {
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
    public List<Map<String,Object>> getReportsWorkers() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("role").equals("worker") && (int)element.get("idCompany")==this.idCompany)
                .collect(Collectors.toList());
    }

    @Override
    public List<Map<String,Object>> getReportsGuest() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("role").equals("guest") && (int)element.get("idCompany")==this.idCompany)
                .collect(Collectors.toList());
    }

    @Override
    public List<Map<String, Object>> getReportsIndividuals() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->(element.get("role").equals("worker") || element.get("role").equals("guest")) && (int)element.get("idCompany")==this.idCompany)
                .collect(Collectors.toList());
    }
}
