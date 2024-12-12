package projectacme.service;

import projectacme.repository.implementation.ReportManagerImpl;
import projectacme.util.Enum.ScannerType;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.UserRoleEnum;

import java.util.List;
import java.util.Map;

public class SecurityGuard extends User implements RegisterAccessService{
    private final ReportManagerImpl reportManagerImpl = new ReportManagerImpl();

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

    public List<Map<String, Object>> getReportsVehicles(){
        return reportManagerImpl.getInformationVehicles();
    }

}
