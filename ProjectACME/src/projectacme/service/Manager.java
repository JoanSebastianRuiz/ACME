package projectacme.service;

import projectacme.factory.AccessSubjectFactory;
import projectacme.repository.implementation.ReportManagerImpl;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.AccessSubjectRoleEnum;
import projectacme.util.validators.CompanyValidator;
import projectacme.util.validators.EmailValidator;
import projectacme.util.validators.PhoneValidator;
import projectacme.util.validators.StringValidator;

import java.util.List;
import java.util.Map;
import java.util.Observable;
import projectacme.events.Observer;
import java.util.stream.Collectors;

public class Manager extends User implements ReportService, Observer {
    private static final AccessSubjectImpl accessSubject = new AccessSubjectImpl();
    private static final ReportManagerImpl reportManagerImpl= new ReportManagerImpl();
    public Manager(String id, String name, String phone, String emailAddress, AccessSubjectRoleEnum role, StateEnum state, String password) {
        super(id, name, phone, emailAddress, role, state, password);
    }

    @Override
    public void update(String message) {
        System.out.println("Manager received message: " + message);
    }

    public void createSecurityGuard(String id, String name, String phone, String emailAddress, String password) {
        if (StringValidator.StringLengthExactlyThanValidator(id, 10)
                && StringValidator.StringLengthLessThanValidator(name, 100)
                && PhoneValidator.phoneValidator(phone)
                && EmailValidator.emailValidator(emailAddress)
                && StringValidator.StringLengthLessThanValidator(password, 100)) {

            accessSubject.addAccessSubject(AccessSubjectFactory.createAccessSubject(id, name, phone, emailAddress, AccessSubjectRoleEnum.securityGuard, StateEnum.active, password, null));
        } else {
            System.out.println("Invalid Data For Create Security Guard");
        }
    }

    public void createOfficer(String id, String name, String phone, String emailAddress, String password, int idCompany) {
        if (StringValidator.StringLengthExactlyThanValidator(id, 10)
                && StringValidator.StringLengthLessThanValidator(name, 100)
                && PhoneValidator.phoneValidator(phone)
                && EmailValidator.emailValidator(emailAddress)
                && StringValidator.StringLengthLessThanValidator(password, 100)
                && CompanyValidator.CompanyIdValidator(idCompany)
        ) {
            accessSubject.addAccessSubject(AccessSubjectFactory.createAccessSubject(id, name, phone, emailAddress, AccessSubjectRoleEnum.officer, StateEnum.active, password, idCompany));
        } else {
            System.out.println("Invalid Data For Create Officer");
        }
    }

    public List<Map<String,Object>> getReportsSecurityGuard() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("Role").equals("securityGuard"))
                .peek(element->{
                    element.remove("idCompany");
                    element.remove("Company");
                    element.remove("Role");
                })
                .collect(Collectors.toList());
    }

    public void inactivateSecurityGuard(SecurityGuard securityGuard) {
        accessSubject.updateAccessSubject(securityGuard, securityGuard.getName(), securityGuard.getPhone(), securityGuard.getEmailAddress(), securityGuard.getRole(), StateEnum.inactive, securityGuard.getPassword());
    }

    public  void activateSecurityGuard(SecurityGuard securityGuard) {
        accessSubject.updateAccessSubject(securityGuard, securityGuard.getName(), securityGuard.getPhone(), securityGuard.getEmailAddress(), securityGuard.getRole(), StateEnum.active, securityGuard.getPassword());
    }

    @Override
    public List<Map<String,Object>> getReportsWorkers() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("Role").equals("worker"))
                .peek(element->{
                    element.remove("Role");
                    element.remove("idCompany");
                })
                .collect(Collectors.toList());
    }

    @Override
    public List<Map<String,Object>> getReportsGuest() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("Role").equals("guest"))
                .peek(element->{
                    element.remove("Role");
                    element.remove("idCompany");
                })
                .collect(Collectors.toList());
    }

    @Override
    public List<Map<String, Object>> getReportsIndividuals() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("Role").equals("worker") || element.get("Role").equals("guest"))
                .peek(element->{
                    element.remove("Role");
                    element.remove("idCompany");
                })
                .collect(Collectors.toList());
    }

    public List<Map<String, Object>> getReportsOfficers() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("Role").equals("officer"))
                .peek(element->{
                    element.remove("Role");
                    element.remove("idCompany");
                })
                .collect(Collectors.toList());
    }
}
