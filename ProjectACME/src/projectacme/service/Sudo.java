package projectacme.service;

import projectacme.factory.AccessSubjectFactory;
import projectacme.model.AccessSubject;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.AccessSubjectRoleEnum;
import projectacme.util.validators.AccessSubjectValidator;
import projectacme.util.validators.EmailValidator;
import projectacme.util.validators.PhoneValidator;
import projectacme.util.validators.StringValidator;

public class Sudo extends User{
    private static final AccessSubjectImpl accessSubject = new AccessSubjectImpl();
    public Sudo(String id, String name, String phone, String emailAddress, AccessSubjectRoleEnum role, StateEnum state, String password) {
        super(id, name, phone, emailAddress, role, state, password);
    }

    public boolean creationManager(String id, String name, String phone, String emailAddress, String password) {
        if (StringValidator.StringLengthExactlyThanValidator(id, 10)
                && StringValidator.StringLengthLessThanValidator(name, 100)
                && PhoneValidator.phoneValidator(phone)
                && EmailValidator.emailValidator(emailAddress)
                && StringValidator.StringLengthLessThanValidator(password, 100)
                && !AccessSubjectValidator.accessSubjectValidator(id)) {
            accessSubject.addAccessSubject(AccessSubjectFactory.createAccessSubject(id, name, phone, emailAddress, AccessSubjectRoleEnum.manager, StateEnum.active, password, null));
            return true;
        } else {
            System.out.println("Invalid Data For Create Manager");
            return false;
        }
    }

    public boolean inactivityManager(Manager manager) {
        if(AccessSubjectValidator.accessSubjectValidator(manager.getId())){
            accessSubject.updateAccessSubject(manager, manager.getName(), manager.getPhone(), manager.getEmailAddress(), manager.getRole(), StateEnum.inactive, manager.getPassword());
            return true;
        } else {
            return false;
        }
    }

    public boolean activityManager(Manager manager) {
        if(AccessSubjectValidator.accessSubjectValidator(manager.getId())){
            accessSubject.updateAccessSubject(manager, manager.getName(), manager.getPhone(), manager.getEmailAddress(), manager.getRole(), StateEnum.active, manager.getPassword());
            return true;
        } else {
            return false;
        }
    }
}
