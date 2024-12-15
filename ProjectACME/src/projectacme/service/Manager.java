package projectacme.service;

import projectacme.factory.AccessSubjectFactory;
import projectacme.repository.implementation.ReportManagerImpl;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.AccessSubjectRoleEnum;
import projectacme.util.validators.*;

import java.util.List;
import java.util.Map;
import java.util.Observable;
import projectacme.events.Observer;
import java.util.stream.Collectors;

public class Manager extends User implements ReportService, Observer {
    private static final AccessSubjectImpl accessSubject = new AccessSubjectImpl();
    private static final ReportManagerImpl reportManagerImpl= new ReportManagerImpl();
    public Manager(String id, String name, String phone, String emailAddress, AccessSubjectRoleEnum role, StateEnum state, String password) {
        super(id, name, phone, emailAddress, role, state, password);
    }

    @Override
    public void update(String message) {
        System.out.println("Manager received message: " + message);
    }

    public boolean createSecurityGuard(String id, String name, String phone, String emailAddress, String password) {
        if (StringValidator.StringLengthExactlyThanValidator(id, 10)
                && StringValidator.StringLengthLessThanValidator(name, 100)
                && PhoneValidator.phoneValidator(phone)
                && EmailValidator.emailValidator(emailAddress)
                && StringValidator.StringLengthLessThanValidator(password, 100)
                && !AccessSubjectValidator.accessSubjectValidator(id)
                && StringValidator.PasswordValidator(password)) {

            accessSubject.addAccessSubject(AccessSubjectFactory.createAccessSubject(id, name, phone, emailAddress, AccessSubjectRoleEnum.securityGuard, StateEnum.active, password, null));
            return true;
        } else {
            System.out.println("Invalid Data For Create Security Guard");
            return false;
        }
    }

    public boolean changeOfficerToWorker(Officer officer){
        if(AccessSubjectValidator.accessSubjectValidator(officer.getId())){
            accessSubject.updateAccessSubject(officer,officer.getName(),officer.getPhone(),officer.getEmailAddress(), AccessSubjectRoleEnum.worker,officer.getState(), null);
            return true;
        } else{
            return false;
        }
    }

    public boolean changeWorkerToOfficer(Individual worker){
        if(AccessSubjectValidator.accessSubjectValidator(worker.getId())
            && !CompanyValidator.companyHasOfficer(worker.getIdCompany())
            && worker.getRole().name().equals("worker")){
            accessSubject.updateAccessSubject(worker,worker.getName(),worker.getPhone(),worker.getEmailAddress(), AccessSubjectRoleEnum.officer,worker.getState(), worker.getId());
            return true;
        } else{
            return false;
        }
    }

    public boolean createOfficer(String id, String name, String phone, String emailAddress, String password, int idCompany) {
        if(AccessSubjectValidator.accessSubjectValidator(id)
            && !CompanyValidator.companyHasOfficer(idCompany)){
            if(accessSubject.getAccessSubjectById(id).getRole().name().equals("worker")){
                changeWorkerToOfficer((Individual) accessSubject.getAccessSubjectById(id));
                return true;
            }
        } else{
            if (StringValidator.StringLengthExactlyThanValidator(id, 10)
                    && StringValidator.StringLengthLessThanValidator(name, 100)
                    && PhoneValidator.phoneValidator(phone)
                    && EmailValidator.emailValidator(emailAddress)
                    && StringValidator.StringLengthLessThanValidator(password, 100)
                    && CompanyValidator.CompanyIdValidator(idCompany)
                    && !CompanyValidator.companyHasOfficer(idCompany)
                    && !AccessSubjectValidator.accessSubjectValidator(id)
                    && StringValidator.PasswordValidator(password)
            ) {
                accessSubject.addAccessSubject(AccessSubjectFactory.createAccessSubject(id, name, phone, emailAddress, AccessSubjectRoleEnum.officer, StateEnum.active, password, idCompany));
                return true;
            } else {
                System.out.println("Invalid Data For Create Officer");
                return false;
            }
        }

        return false;
    }

    public List<Map<String,Object>> getReportsSecurityGuard() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("Role").equals("securityGuard"))
                .peek(element->{
                    element.remove("idCompany");
                    element.remove("Company");
                    element.remove("Role");
                })
                .collect(Collectors.toList());
    }

    public boolean inactivateSecurityGuard(SecurityGuard securityGuard) {
        if(AccessSubjectValidator.accessSubjectValidator(securityGuard.getId())){
            accessSubject.updateAccessSubject(securityGuard, securityGuard.getName(), securityGuard.getPhone(), securityGuard.getEmailAddress(), securityGuard.getRole(), StateEnum.inactive, securityGuard.getPassword());
            return true;
        } else{
            return false;
        }
    }

    public  boolean activateSecurityGuard(SecurityGuard securityGuard) {
        if(AccessSubjectValidator.accessSubjectValidator(securityGuard.getId())){
            accessSubject.updateAccessSubject(securityGuard, securityGuard.getName(), securityGuard.getPhone(), securityGuard.getEmailAddress(), securityGuard.getRole(), StateEnum.active, securityGuard.getPassword());
            return true;
        } else{
            return false;
        }
    }

    public boolean inactivateOfficer(Officer officer) {
        if(AccessSubjectValidator.accessSubjectValidator(officer.getId())){
            accessSubject.updateAccessSubject(officer, officer.getName(), officer.getPhone(), officer.getEmailAddress(), AccessSubjectRoleEnum.worker, StateEnum.inactive, null);
            return true;
        } else{
            return false;
        }
    }


    @Override
    public List<Map<String,Object>> getReportsWorkers() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("Role").equals("worker"))
                .peek(element->{
                    element.remove("Role");
                    element.remove("idCompany");
                })
                .collect(Collectors.toList());
    }

    @Override
    public List<Map<String,Object>> getReportsGuest() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("Role").equals("guest"))
                .peek(element->{
                    element.remove("Role");
                    element.remove("idCompany");
                })
                .collect(Collectors.toList());
    }

    @Override
    public List<Map<String, Object>> getReportsIndividuals() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("Role").equals("worker") || element.get("Role").equals("guest"))
                .peek(element->{
                    element.remove("Role");
                    element.remove("idCompany");
                })
                .collect(Collectors.toList());
    }

    public List<Map<String, Object>> getReportsOfficers() {
        return reportManagerImpl.getInformationAccessSubjects().stream()
                .filter(element->element.get("Role").equals("officer"))
                .peek(element->{
                    element.remove("Role");
                    element.remove("idCompany");
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
