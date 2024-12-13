package projectacme.util;

import projectacme.model.AccessSubject;
import projectacme.repository.implementation.AccessSubjectImpl;

public class Login {
    public static boolean validationUser(String document, String password){
        AccessSubjectImpl accessSubjectImpl = new AccessSubjectImpl();
        AccessSubject accessSubject = accessSubjectImpl.getAccessSubjectById(document);
        if (accessSubject != null){
        return accessSubject.getPassword().equals(password) && (accessSubject.getRole().name().equals("sudo") || accessSubject.getRole().name().equals("officer") || accessSubject.getRole().name().equals("manager") || accessSubject.getRole().name().equals("securityGuard"));
        }
        return false;
    }
}
