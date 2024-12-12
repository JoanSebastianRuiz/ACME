package projectacme.service;

import projectacme.repository.implementation.ReportManagerImpl;
import projectacme.model.AccessSubject;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.AccessSubjectRoleEnum;
import projectacme.util.validators.EmailValidator;
import projectacme.util.validators.PhoneValidator;
import projectacme.util.validators.StringValidator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Officer extends User implements ReportService{
    private static final AccessSubjectImpl accessSubject = new AccessSubjectImpl();
    private int idCompany;
    private static final ReportManagerImpl reportManagerImpl = new ReportManagerImpl();

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

    public void workerRegistration(String id, String name, String phone, String emailAddress, String password){
        if (StringValidator.StringLengthExactlyThanValidator(id, 10)
                && StringValidator.StringLengthLessThanValidator(name, 100)
                && PhoneValidator.phoneValidator(phone)
                && EmailValidator.emailValidator(emailAddress)
                && StringValidator.StringLengthLessThanValidator(password, 100)) {
            accessSubject.addAccessSubject(new AccessSubject(id, name, phone, emailAddress, AccessSubjectRoleEnum.worker, StateEnum.active, null, this.idCompany));
        } else {
            System.out.println("Invalid Data For Create Worker");
        }
    }

    public void guestRegistration(String id, String name, String phone, String emailAddress, String password){
        if (StringValidator.StringLengthExactlyThanValidator(id, 10)
                && StringValidator.StringLengthLessThanValidator(name, 100)
                && PhoneValidator.phoneValidator(phone)
                && EmailValidator.emailValidator(emailAddress)
                && StringValidator.StringLengthLessThanValidator(password, 100)) {
            accessSubject.addAccessSubject(new AccessSubject(id, name, phone, emailAddress, AccessSubjectRoleEnum.guest, StateEnum.active, null, this.idCompany));
        } else {
            System.out.println("Invalid Data For Create Guest");
        }
    }

    public void inactiveIndividual(String id){
        AccessSubject individual = accessSubject.getAccessSubjectById(id);
        accessSubject.updateAccessSubject(individual, individual.getName(), individual.getPhone(), individual.getEmailAddress(), individual.getRole(), StateEnum.inactive, individual.getPassword());
    }

    public void activateIndividual(String id){
        AccessSubject individual = accessSubject.getAccessSubjectById(id);
        accessSubject.updateAccessSubject(individual, individual.getName(), individual.getPhone(), individual.getEmailAddress(), individual.getRole(), StateEnum.active, individual.getPassword());
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
