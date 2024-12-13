package projectacme.factory;

import projectacme.model.AccessSubject;
import projectacme.service.Individual;
import projectacme.service.Manager;
import projectacme.service.Officer;
import projectacme.service.SecurityGuard;
import projectacme.util.Enum.AccessSubjectRoleEnum;
import projectacme.util.Enum.StateEnum;
import projectacme.service.Sudo;

public class AccessSubjectFactory {
    public static AccessSubject createAccessSubject(String id, String name, String phone, String emailAddress, AccessSubjectRoleEnum role, StateEnum state, String password, Integer idCompany){
        return switch (role.name()) {
            case "sudo" -> new Sudo(id, name, phone, emailAddress, role, state, password);
            case "manager" -> new Manager(id, name, phone, emailAddress, role, state, password);
            case "officer" -> new Officer(id, name, phone, emailAddress, role, state, password, idCompany);
            case "securityGuard" -> new SecurityGuard(id, name, phone, emailAddress, role, state, password);
            case "worker", "guest" -> new Individual(state, role, emailAddress, phone, name, id, idCompany);
            default -> throw new IllegalArgumentException("Role not recognized: " + role);
        };
    }
}
