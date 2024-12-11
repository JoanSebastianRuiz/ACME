package projectacme.service;

import projectacme.util.Enum.ScannerType;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.UserRoleEnum;

public class SecurityGuard extends User implements RegisterAccessService{
    public SecurityGuard(String id, String name, String phone, String emailAddress, UserRoleEnum role, StateEnum state, String password) {
        super(id, name, phone, emailAddress, role, state, password);
    }

    @Override
    public void registerAccess(ScannerType type) {
        // TODO: implement register access for security guard
        // ! Entry And Exit
    }

    public void viewUserAnnotation(){
        // TODO: implement view user annotation
    }

    public void registerNotes(){
        // TODO: implement register notes
    }

    public void registerPlate(){
        // TODO: implement register plate
    }

    public void getReportsUsers(){
        // TODO: implement get reports users
    }

}
