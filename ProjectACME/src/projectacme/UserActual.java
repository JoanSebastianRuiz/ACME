package projectacme;

import projectacme.model.AccessSubject;
import projectacme.service.Manager;
import projectacme.service.Officer;
import projectacme.service.SecurityGuard;
import projectacme.service.Sudo;

public class UserActual {
    private static AccessSubject accessSubject;

    public static Sudo getAccessSubjectSudo() {
        return (Sudo) accessSubject;
    }

    public static Manager getAccessSubjectManager() {
        return (Manager) accessSubject;
    }

    public static Officer getAccessSubjectOfficer() {
        return (Officer) accessSubject;
    }

    public static SecurityGuard getAccessSubjectSecurityGuard() {
        return (SecurityGuard) accessSubject;
    }
    
    public static AccessSubject getAccessSubject() {
        return accessSubject;
    }

    public static void setAccessSubject(AccessSubject accessSubject) {
        UserActual.accessSubject = accessSubject;
    }
}
