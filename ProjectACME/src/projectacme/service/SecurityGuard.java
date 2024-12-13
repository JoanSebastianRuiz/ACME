package projectacme.service;

import projectacme.events.Observer;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.repository.implementation.ReportManagerImpl;
import projectacme.model.AccessLog;
import projectacme.repository.implementation.AccessLogImpl;
import projectacme.util.Enum.AccessType;
import projectacme.util.Enum.ScannerType;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.AccessSubjectRoleEnum;

import java.sql.Timestamp;
import java.time.Instant;

import java.util.List;
import java.util.Map;

public class SecurityGuard extends User implements RegisterAccessService, Observer {
    private static final AccessLogImpl accessLogImpl = new AccessLogImpl();
    private final ReportManagerImpl reportManagerImpl = new ReportManagerImpl();

    public SecurityGuard(String id, String name, String phone, String emailAddress, AccessSubjectRoleEnum role, StateEnum state, String password) {
        super(id, name, phone, emailAddress, role, state, password);
    }

    @Override
    public void update(String message) {
        System.out.println("Security Guard received message: " + message);
    }

    @Override
    public void registerAccess(ScannerType type, String id) {
        AccessLog lastAccessLog = accessLogImpl.getAllAccessLog().stream().filter(accessLog -> accessLog.getIdAccessSubject().equals(id)).findFirst().orElse(null);
        if (type == ScannerType.exit){
            if (lastAccessLog == null || !lastAccessLog.getType().toString().equals(ScannerType.exit.toString())){
           accessLogImpl.addAccessLog(new AccessLog(AccessType.exit, Timestamp.from(Instant.now()), id, null, this.getId()));
                // TODO: Change For Factory Method
            } else {
                System.out.println("The Individual Is Already Outside");
            }
        } else if (type == ScannerType.entry) {
            if (lastAccessLog == null || !lastAccessLog.getType().toString().equals(ScannerType.entry.toString())){
            accessLogImpl.addAccessLog(new AccessLog(AccessType.entry, Timestamp.from(Instant.now()), id, null, this.getId()));
                // TODO: Change For Factory Method
            } else {
                System.out.println("The Individual Is Already Inside");
            }
        } else {
            System.out.println("AccessType Invalid");
        }
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
