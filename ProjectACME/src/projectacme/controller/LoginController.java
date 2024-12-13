package projectacme.controller;

import projectacme.model.AccessSubject;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.util.Login;

public class LoginController {
    public boolean validationUser(String document, String password){
        return Login.validationUser(document, password);
    }
}
