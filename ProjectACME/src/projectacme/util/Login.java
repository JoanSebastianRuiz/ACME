package projectacme.util;

import projectacme.model.AccessSubject;
import projectacme.model.ConnectionData;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.service.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    public boolean validationUser(String document, String password){
        AccessSubjectImpl accessSubjectImpl = new AccessSubjectImpl();
        AccessSubject accessSubject = accessSubjectImpl.getAccessSubjectById(document);
        return accessSubject.getPassword().equals(password) && (accessSubject.getRole().name().equals("sudo") || accessSubject.getRole().name().equals("officer") || accessSubject.getRole().name().equals("manager") || accessSubject.getRole().name().equals("securityGuard"));
    }
}
