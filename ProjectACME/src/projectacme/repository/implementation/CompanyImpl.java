package projectacme.repository.implementation;

import projectacme.model.Company;
import projectacme.repository.dao.CompanyDao;

import java.util.List;

public class CompanyImpl implements CompanyDao {
    @Override
    public void addCompany(Company company) {

    }

    @Override
    public Company getCompanyLogById(int id) {
        return null;
    }

    @Override
    public List<Company> getAllCompanies() {
        return List.of();
    }

    @Override
    public void updateCompany(Company company, int id, String name, String phone) {

    }
}
