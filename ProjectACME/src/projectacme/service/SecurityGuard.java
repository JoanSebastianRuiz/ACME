package projectacme.service;

import projectacme.events.Observer;
import projectacme.model.Vehicle;
import projectacme.repository.implementation.ReportManagerImpl;
import projectacme.model.AccessLog;
import projectacme.repository.implementation.AccessLogImpl;
import projectacme.repository.implementation.VehicleImpl;
import projectacme.util.Enum.*;
import projectacme.util.validators.PlateValidator;
import projectacme.util.validators.UserValidator;

import java.sql.Timestamp;
import java.time.Instant;

import java.util.List;
import java.util.Map;

public class SecurityGuard extends User implements RegisterAccessService, Observer {
    private static final AccessLogImpl accessLogImpl = new AccessLogImpl();
    private final ReportManagerImpl reportManagerImpl = new ReportManagerImpl();
    private static final VehicleImpl vehicleImpl = new VehicleImpl();

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

    public void registerPlate(String plate, String id){
        if (UserValidator.UserIdValidator(id)){
        if (PlateValidator.plateCarValidator(plate)){
            vehicleImpl.addVehicle(new Vehicle(plate, VehicleEnum.car, id));
        } else if (PlateValidator.plateMotorcycleValidator(plate)){
            vehicleImpl.addVehicle(new Vehicle(plate, VehicleEnum.motorcycle, id));
        } else {
            System.out.println("Invalid Plate Format");
        }}
        System.out.println("Invalid Identification");
    }

    public void getReportsUsers(){
        // TODO: implement get reports users
    }

    public List<Map<String, Object>> getReportsVehicles(){
        return reportManagerImpl.getInformationVehicles();
    }

}
