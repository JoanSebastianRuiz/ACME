package projectacme.service;

import projectacme.model.AccessSubject;
import projectacme.repository.implementation.ReportManagerImpl;
import projectacme.model.AccessSubject;
import projectacme.model.Company;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.AccessSubjectRoleEnum;
import projectacme.util.validators.CompanyValidator;
import projectacme.util.validators.EmailValidator;
import projectacme.util.validators.PhoneValidator;
import projectacme.util.validators.StringValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Manager extends User implements ReportService{
    private final ReportManagerImpl reportManagerImpl= new ReportManagerImpl();
    public Manager(String id, String name, String phone, String emailAddress, AccessSubjectRoleEnum role, StateEnum state, String password) {
        super(id, name, phone, emailAddress, role, state, password);
    }


    public void createSecurityGuard(String id, String name, String phone, String emailAddress, String password) {
        AccessSubjectImpl accessSubject = new AccessSubjectImpl();
        if (StringValidator.StringLengthExactlyThanValidator(id, 10)
                && StringValidator.StringLengthLessThanValidator(name, 100)
                && PhoneValidator.phoneValidator(phone)
                && EmailValidator.emailValidator(emailAddress)
                && StringValidator.StringLengthLessThanValidator(password, 100)) {
            accessSubject.addAccessSubject(new AccessSubject(id, name, phone, emailAddress, AccessSubjectRoleEnum.securityGuard, StateEnum.active, password));
        } else {
            System.out.println("Invalid Data For Create Security Guard");
        }
    }

    public void createOfficer(String id, String name, String phone, String emailAddress, String password, int idCompany) {
        AccessSubjectImpl accessSubject = new AccessSubjectImpl();
        if (StringValidator.StringLengthExactlyThanValidator(id, 10)
                && StringValidator.StringLengthLessThanValidator(name, 100)
                && PhoneValidator.phoneValidator(phone)
                && EmailValidator.emailValidator(emailAddress)
                && StringValidator.StringLengthLessThanValidator(password, 100)
                && CompanyValidator.CompanyIdValidator(idCompany)
        ) {
            accessSubject.addAccessSubject(new AccessSubject(id, name, phone, emailAddress, AccessSubjectRoleEnum.officer, StateEnum.active, password, idCompany));
        } else {
            System.out.println("Invalid Data For Create Officer");
        }
    }

    public List<Map<String,Object>> getReportsSecurityGuard() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("role").equals("securityGuard"))
                .collect(Collectors.toList());
    }

    public void inactivateSecurityGuard(SecurityGuard securityGuard) {
        AccessSubjectImpl accessSubject = new AccessSubjectImpl();
        accessSubject.updateAccessSubject(securityGuard, securityGuard.getName(), securityGuard.getPhone(), securityGuard.getEmailAddress(), securityGuard.getRole(), StateEnum.inactive, securityGuard.getPassword());
    }

    public  void activateSecurityGuard(SecurityGuard securityGuard) {
        AccessSubjectImpl accessSubject = new AccessSubjectImpl();
        accessSubject.updateAccessSubject(securityGuard, securityGuard.getName(), securityGuard.getPhone(), securityGuard.getEmailAddress(), securityGuard.getRole(), StateEnum.active, securityGuard.getPassword());
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
