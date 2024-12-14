package projectacme.util.validators;

import projectacme.model.AccessSubject;
import projectacme.repository.implementation.AccessSubjectImpl;

public class AccessSubjectValidator {
    public static boolean accessSubjectValidator(String document){
        AccessSubjectImpl accessSubjectImpl = new AccessSubjectImpl();
        AccessSubject accessSubject = accessSubjectImpl.getAccessSubjectById(document);
        return accessSubject != null;
    }
}
