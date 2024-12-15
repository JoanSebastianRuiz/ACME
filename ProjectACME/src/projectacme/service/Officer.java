package projectacme.service;

import projectacme.events.Observer;
import projectacme.factory.AccessSubjectFactory;
import projectacme.model.AccessLog;
import projectacme.repository.implementation.AccessLogImpl;
import projectacme.repository.implementation.ReportManagerImpl;
import projectacme.model.AccessSubject;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.util.Enum.AccessType;
import projectacme.util.Enum.ScannerType;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.AccessSubjectRoleEnum;
import projectacme.util.validators.AccessSubjectValidator;
import projectacme.util.validators.EmailValidator;
import projectacme.util.validators.PhoneValidator;
import projectacme.util.validators.StringValidator;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Officer extends User implements ReportService, Observer, RegisterAccessService{
    private static final AccessSubjectImpl accessSubject = new AccessSubjectImpl();
    private int idCompany;
    private static final ReportManagerImpl reportManagerImpl = new ReportManagerImpl();
    private final AccessLogImpl accessLogImpl = new AccessLogImpl();

    public Officer(String id, String name, String phone, String emailAddress, AccessSubjectRoleEnum role, StateEnum state, String password, int idCompany) {
        super(id, name, phone, emailAddress, role, state, password);
        this.idCompany = idCompany;
    }

    @Override
    public void update(String message) {
        System.out.println("Officer received message: " + message);
    }

    @Override
    public Integer getIdCompany() {
        return idCompany;
    }

    @Override
    public void setIdCompany(Integer idCompany) {
        this.idCompany = idCompany;
    }

    public boolean workerRegistration(String id, String name, String phone, String emailAddress){
        if (StringValidator.StringLengthExactlyThanValidator(id, 10)
                && StringValidator.StringLengthLessThanValidator(name, 100)
                && PhoneValidator.phoneValidator(phone)
                && EmailValidator.emailValidator(emailAddress)
                && !AccessSubjectValidator.accessSubjectValidator(id)) {
            accessSubject.addAccessSubject(AccessSubjectFactory.createAccessSubject(id, name, phone, emailAddress, AccessSubjectRoleEnum.worker, StateEnum.active, null, this.idCompany));
            return true;
        } else {
            System.out.println("Invalid Data For Create Worker");
            return false;
        }
    }

    public boolean guestRegistration(String id, String name, String phone, String emailAddress){
        if (StringValidator.StringLengthExactlyThanValidator(id, 10)
                && StringValidator.StringLengthLessThanValidator(name, 100)
                && PhoneValidator.phoneValidator(phone)
                && EmailValidator.emailValidator(emailAddress)
                && !AccessSubjectValidator.accessSubjectValidator(id)) {
            accessSubject.addAccessSubject(AccessSubjectFactory.createAccessSubject(id, name, phone, emailAddress, AccessSubjectRoleEnum.guest, StateEnum.active, null, this.idCompany));
            return true;
        } else {
            System.out.println("Invalid Data For Create Guest");
            return false;
        }
    }



    public boolean inactiveIndividual(Individual individual){
        if(AccessSubjectValidator.accessSubjectValidator(individual.getId())){
            accessSubject.updateAccessSubject(individual, individual.getName(), individual.getPhone(), individual.getEmailAddress(), individual.getRole(), StateEnum.inactive, individual.getPassword());
            return true;
        } else {
            return false;
        }

    }

    public boolean activateIndividual(Individual individual){
        if(AccessSubjectValidator.accessSubjectValidator(individual.getId())){
            accessSubject.updateAccessSubject(individual, individual.getName(), individual.getPhone(), individual.getEmailAddress(), individual.getRole(), StateEnum.active, individual.getPassword());
            return true;
        } else {
            return false;
        }
    }


    @Override
    public List<Map<String,Object>> getReportsWorkers() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("role").equals("worker") && (int)element.get("idCompany")==this.idCompany)
                .collect(Collectors.toList());
    }

    @Override
    public List<Map<String,Object>> getReportsGuest() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("role").equals("guest") && (int)element.get("idCompany")==this.idCompany)
                .collect(Collectors.toList());
    }

    @Override
    public List<Map<String, Object>> getReportsIndividuals() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->(element.get("role").equals("worker") || element.get("role").equals("guest")) && (int)element.get("idCompany")==this.idCompany)
                .collect(Collectors.toList());
    }

    @Override
    public boolean registerAccess(ScannerType type, String id) {
        AccessLog lastAccessLog = accessLogImpl.getAllAccessLog().stream()
                .filter(accessLog -> accessLog.getIdAccessSubject().equals(id)).max(Comparator.comparing(AccessLog::getDatetime))
                .orElse(null);
        if(type==ScannerType.exit){
            if (lastAccessLog == null || !lastAccessLog.getType().toString().equals(ScannerType.exit.toString())){

                accessLogImpl.addAccessLog(new AccessLog.Builder(AccessType.exit,Timestamp.from(Instant.now()),id).setIdAccessSubjectLogger(this.getId()).build());
                return true;
            } else {
                System.out.println("The Individual Is Already Outside");
                return false;
            }
        }else{
            System.out.println("Access Type Invalid");
            return false;
        }

    }

    public List<Map<String, Object>> getReportsAccessLogs(){
        return reportManagerImpl.getInformationAccessLogs()
                .stream()
                .filter(element->element.get("idCompany")==(Integer)this.idCompany)
                .peek(element->{
                    if(element.get("Logger")==null){
                        element.put("Logger", "Scanner "+element.get("idScanner"));
                    }
                    element.remove("idScanner");
                    element.remove("idCompany");

                })
                .collect(Collectors.toList());
    }
}
