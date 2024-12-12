package projectacme.service;

import projectacme.model.AccessSubject;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.AccessSubjectRoleEnum;

public class Individual extends AccessSubject{
    public Individual(StateEnum state, AccessSubjectRoleEnum role, String emailAddress, String phone, String name, String id, int idCompany) {
        super(state, role, emailAddress, phone, name, id, idCompany);
    }
}
