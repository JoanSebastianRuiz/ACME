package projectacme.service;

import projectacme.model.AccessSubject;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.UserRoleEnum;

public class Individual extends AccessSubject{
    public Individual(StateEnum state, UserRoleEnum role, String emailAddress, String phone, String name, String id, int idCompany) {
        super(state, role, emailAddress, phone, name, id, idCompany);
    }
}
