package projectacme.util.validators;

import projectacme.model.Company;
import projectacme.repository.implementation.CompanyImpl;

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
}
