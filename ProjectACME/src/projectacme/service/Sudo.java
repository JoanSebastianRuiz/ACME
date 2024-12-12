package projectacme.service;

import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.AccessSubjectRoleEnum;

public class Sudo extends User{
    public Sudo(String id, String name, String phone, String emailAddress, AccessSubjectRoleEnum role, StateEnum state, String password) {
        super(id, name, phone, emailAddress, role, state, password);
    }

    public void creationManager() {
        // TODO: create a manager
    }

    public void inactivityManager() {
        // TODO: inactivate a manager
    }

    public void activityManager() {
        // TODO: activate a manager
    }
}
