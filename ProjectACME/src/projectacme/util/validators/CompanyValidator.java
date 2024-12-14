package projectacme.util.validators;

import projectacme.model.Company;
import projectacme.repository.implementation.AccessSubjectImpl;
import projectacme.repository.implementation.CompanyImpl;

import java.util.stream.Collectors;

public class CompanyValidator{
    public static boolean CompanyIdValidator (int id){
        CompanyImpl companyImpl = new CompanyImpl();
        for (Company company : companyImpl.getAllCompanies()){
            if (company.getId() == id){
                return true;
            }
        }
        return false;
    }

    public static boolean companyHasOfficer(int idCompany){
        AccessSubjectImpl accessSubjectImpl = new AccessSubjectImpl();
        int officerCount =accessSubjectImpl.getAccessSubjects().stream()
                .filter(element->element.getRole().name().equals("officer") && element.getIdCompany()==idCompany)
                .collect(Collectors.toList())
                .size();

        return officerCount==1;
    }
}
