package projectacme.repository.dao;

import projectacme.model.Company;
import java.util.List;

public interface CompanyDao {
    void addCompany(Company company);
    Company getCompanyLogById(int id);
    List<Company> getAllCompanies();
    void updateCompany(Company company, String name, String phone);
}
