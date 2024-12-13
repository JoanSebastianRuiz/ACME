package projectacme.controller;

import projectacme.model.AccessSubject;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.util.Login;

import javax.crypto.spec.PSource;

public class LoginController {
    public static boolean validationUser(String document, String password){
        return Login.validationUser(document, password);
    }
}
