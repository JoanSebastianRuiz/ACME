package projectacme.service;

import projectacme.model.AccessSubject;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.AccessSubjectRoleEnum;
import projectacme.util.validators.EmailValidator;
import projectacme.util.validators.PhoneValidator;
import projectacme.util.validators.StringValidator;

public class Manager extends User implements ReportService{
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

    public void createOfficer(String id, String name, String phone, String emailAddress, String password) {
        AccessSubjectImpl accessSubject = new AccessSubjectImpl();
        if (StringValidator.StringLengthExactlyThanValidator(id, 10)
                && StringValidator.StringLengthLessThanValidator(name, 100)
                && PhoneValidator.phoneValidator(phone)
                && EmailValidator.emailValidator(emailAddress)
                && StringValidator.StringLengthLessThanValidator(password, 100)) {
            accessSubject.addAccessSubject(new AccessSubject(id, name, phone, emailAddress, AccessSubjectRoleEnum.officer, StateEnum.active, password));
        } else {
            System.out.println("Invalid Data For Create Officer");
        }
    }

    public void getReportsSecurityGuard() {
        // TODO: Implement get reports for security guard
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
    public void getReportsWorkers() {

    }

    @Override
    public void getReportsGuest() {

    }

    @Override
    public void getReportsIndividuals() {

    }
}
