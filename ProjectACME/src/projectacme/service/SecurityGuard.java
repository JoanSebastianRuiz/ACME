package projectacme.service;

import projectacme.events.Observer;
import projectacme.model.Annotation;
import projectacme.model.Justification;
import projectacme.model.Vehicle;
import projectacme.repository.implementation.*;
import projectacme.model.AccessLog;
import projectacme.util.Enum.*;
import projectacme.util.validators.*;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Comparator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecurityGuard extends User implements RegisterAccessService, Observer {
    private static final AccessLogImpl accessLogImpl = new AccessLogImpl();
    private final ReportManagerImpl reportManagerImpl = new ReportManagerImpl();
    private static final VehicleImpl vehicleImpl = new VehicleImpl();
    private static final AnnotationImpl annotationImpl = new AnnotationImpl();
    private static final JustificationImpl justificationImpl = new JustificationImpl();

    public SecurityGuard(String id, String name, String phone, String emailAddress, AccessSubjectRoleEnum role, StateEnum state, String password) {
        super(id, name, phone, emailAddress, role, state, password);
    }

    @Override
    public void update(String message) {
        System.out.println("Security Guard received message: " + message);
    }

    @Override
    public boolean registerAccess(ScannerType type, String id) {
        AccessLog lastAccessLog = accessLogImpl.getAllAccessLog().stream()
                .filter(accessLog -> accessLog.getIdAccessSubject().equals(id)).max(Comparator.comparing(AccessLog::getDatetime))
                .orElse(null);
        if(type==ScannerType.exit){
            if (lastAccessLog != null && !lastAccessLog.getType().toString().equals(ScannerType.exit.toString())){
           accessLogImpl.addAccessLog(new AccessLog.Builder(AccessType.exit,Timestamp.from(Instant.now()),id).setIdAccessSubjectLogger(this.getId()).build());
           return true;
            } else {
                System.out.println("The Individual Is Already Outside");
                return false;
            }
        } else if (type == ScannerType.entry) {
            if ((lastAccessLog == null || !lastAccessLog.getType().toString().equals(ScannerType.entry.toString()))
                && !AnnotationValidator.personHasAnnotations(id)){
            accessLogImpl.addAccessLog(new AccessLog.Builder(AccessType.entry,Timestamp.from(Instant.now()),id).setIdAccessSubjectLogger(this.getId()).build());
            return true;
            } else {
                System.out.println("The Individual Is Already Inside or Has Annotations");
                return false;
            }
        } else {
            System.out.println("AccessType Invalid");
            return false;
        }
    }

    public List<Map<String, Object>> getReportAnnotations(){
        return reportManagerImpl.getInformationAnnotations()
                .stream().peek(element->{
                    if(Boolean.parseBoolean(String.valueOf(element.get("Suspended")))){
                        element.put("Suspended","Yes");
                    } else{
                        element.put("Suspended","No");
                    }
                })
                .collect(Collectors.toList());
    }

    public List<Map<String, Object>> getReportJustifications(){
        return reportManagerImpl.getInformationJustifications()
                .stream().peek(element->{
                    element.remove("idAccessSubjectLogger");
                })
                .collect(Collectors.toList());
    }

    public boolean registerAnnotation(String reason, Boolean suspended, String idAccessSubject){
        if(AccessSubjectValidator.accessSubjectValidator(idAccessSubject)){
            if(StringValidator.StringLengthLessThanValidator(reason,500)){
                annotationImpl.addAnnotation(new Annotation(Timestamp.from(Instant.now()), reason, suspended, StateEnum.active, idAccessSubject, this.getId()));
                return true;
            } else {
                System.out.println("Reason too long, it only could have 500 characters");
                return false;
            }
        } else{
            System.out.println("The AccessSubject doesn't exist in the database");
            return false;
        }
    }

    public boolean registerJustification(Timestamp datetime, String reason, int idAnnotation){
        if(AnnotationValidator.annotationValidator(idAnnotation)){
            if(StringValidator.StringLengthLessThanValidator(reason,500)
                && !AnnotationValidator.annotationHasJustification(idAnnotation)){
                justificationImpl.addJustification(new Justification(Timestamp.from(Instant.now()), reason, this.getId(), idAnnotation));
                Annotation annotation = annotationImpl.getAnnotationLogById(idAnnotation);
                annotationImpl.updateAnnotation(annotation,annotation.getDatetime(),annotation.getReason(),annotation.getSuspended(),StateEnum.inactive);
                return true;
            } else {
                System.out.println("Invalid Data For Register Justification");
                return false;
            }
        } else{
            System.out.println("The Annotation doesn't exist in the database");
            return false;
        }
    }

    public boolean registerPlate(String plate, String id){
        if (UserValidator.UserIdValidator(id)){
            if (PlateValidator.plateCarValidator(plate)){
                vehicleImpl.addVehicle(new Vehicle(plate, VehicleEnum.car, id));
                return true;
            } else if (PlateValidator.plateMotorcycleValidator(plate)){
                vehicleImpl.addVehicle(new Vehicle(plate, VehicleEnum.motorcycle, id));
                return true;
            } else {
                System.out.println("Invalid Plate Format");
                return false;
            }
        }
        System.out.println("Invalid Identification");
        return false;
    }

    public List<Map<String, Object>> getReportsAccessSubjects(){
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->!element.get("Role").equals("sudo") && element.get("State").equals("active"))
                .peek(element->{
                    if(element.get("Role").equals("securityGuard") || element.get("Role").equals("manager")){
                        element.put("Company","");
                    }
                    element.remove("idCompany");
                    element.remove("Email Address");
                    element.remove("Phone");
                    element.remove("State");
                })
                .collect(Collectors.toList());
    }

    public List<Map<String, Object>> getReportsVehicles(){
        return reportManagerImpl.getInformationVehicles()
                .stream().peek(element->{
                    element.remove("idCompany");
                })
                .collect(Collectors.toList());
    }

    public List<Map<String, Object>> getReportsCompanies(){
        return reportManagerImpl.getInformationCompanies()
                .stream().peek(element->{
                    element.remove("id");
                })
                .collect(Collectors.toList());
    }

    public List<Map<String, Object>> getReportsAccessLogs(){
        return reportManagerImpl.getInformationAccessLogs()
                .stream().peek(element->{
                    if(element.get("Logger")==null){
                        element.put("Logger", "Scanner "+element.get("idScanner"));
                    }
                    element.remove("idScanner");
                    element.remove("idCompany");
                })
                .collect(Collectors.toList());
    }

}
