package projectacme.service;

import projectacme.model.AccessSubject;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.AccessSubjectRoleEnum;

public class User extends AccessSubject {
    public User(String id, String name, String phone, String emailAddress, AccessSubjectRoleEnum role, StateEnum state, String password) {
        super(id, name, phone, emailAddress, role, state, password);
    }
}
