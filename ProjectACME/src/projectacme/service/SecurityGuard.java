package projectacme.service;

import projectacme.model.AccessLog;
import projectacme.repository.implementation.AccessLogImpl;
import projectacme.util.Enum.AccessType;
import projectacme.util.Enum.ScannerType;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.AccessSubjectRoleEnum;

import java.sql.Timestamp;
import java.time.Instant;

public class SecurityGuard extends User implements RegisterAccessService{
    public SecurityGuard(String id, String name, String phone, String emailAddress, AccessSubjectRoleEnum role, StateEnum state, String password) {
        super(id, name, phone, emailAddress, role, state, password);
    }

    @Override
    public void registerAccess(ScannerType type, String id) {
        AccessLogImpl accessLogImpl = new AccessLogImpl();
        AccessLog lastAccessLog = accessLogImpl.getAllAccessLog().stream().filter(accessLog -> accessLog.getIdAccessSubject().equals(id)).findFirst().orElse(null);
        if (type == ScannerType.exit){
            if (lastAccessLog == null || !lastAccessLog.getType().toString().equals(ScannerType.exit.toString())){
           accessLogImpl.addAccessLog(new AccessLog(AccessType.exit, Timestamp.from(Instant.now()), id, null, this.getId()));
            } else {
                System.out.println("The Individual Is Already Outside");
            }
        } else if (type == ScannerType.entry) {
            if (lastAccessLog == null || !lastAccessLog.getType().toString().equals(ScannerType.entry.toString())){
            accessLogImpl.addAccessLog(new AccessLog(AccessType.entry, Timestamp.from(Instant.now()), id, null, this.getId()));
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

}
