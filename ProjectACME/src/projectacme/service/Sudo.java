package projectacme.service;

import projectacme.model.AccessSubject;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.AccessSubjectRoleEnum;
import projectacme.util.validators.EmailValidator;
import projectacme.util.validators.PhoneValidator;
import projectacme.util.validators.StringValidator;

public class Sudo extends User{
    private static final AccessSubjectImpl accessSubject = new AccessSubjectImpl();
    public Sudo(String id, String name, String phone, String emailAddress, AccessSubjectRoleEnum role, StateEnum state, String password) {
        super(id, name, phone, emailAddress, role, state, password);
    }

    public void creationManager(String id, String name, String phone, String emailAddress, String password) {
        if (StringValidator.StringLengthExactlyThanValidator(id, 10)
                && StringValidator.StringLengthLessThanValidator(name, 100)
                && PhoneValidator.phoneValidator(phone)
                && EmailValidator.emailValidator(emailAddress)
                && StringValidator.StringLengthLessThanValidator(password, 100)) {
            accessSubject.addAccessSubject(new AccessSubject(id, name, phone, emailAddress, AccessSubjectRoleEnum.manager, StateEnum.active, password));
        } else {
            System.out.println("Invalid Data For Create Manager");
        }
    }

    public void inactivityManager(String id) {
        AccessSubject individual = accessSubject.getAccessSubjectById(id);
        accessSubject.updateAccessSubject(individual, individual.getName(), individual.getPhone(), individual.getEmailAddress(), individual.getRole(), StateEnum.inactive, individual.getPassword());
    }

    public void activityManager(String id) {
        AccessSubject individual = accessSubject.getAccessSubjectById(id);
        accessSubject.updateAccessSubject(individual, individual.getName(), individual.getPhone(), individual.getEmailAddress(), individual.getRole(), StateEnum.active, individual.getPassword());
    }
}
