package projectacme.repository.implementation;

import projectacme.model.Company;
import projectacme.util.ConnectionData;
import projectacme.repository.dao.CompanyDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CompanyImpl implements CompanyDao {
    @Override
    public void addCompany(Company company) {
        String sql = "INSERT INTO Company(name,phone) VALUES(?,?);";

        try(Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, company.getName());
            stmt.setString(2, company.getPhone());
            stmt.executeUpdate();
            System.out.println("Added new Company");
        } catch (SQLException e) {
            throw new RuntimeException("Error inserting Company", e);
        }
    }

    @Override
    public Company getCompanyLogById(int id) {
        String sql = "SELECT * FROM Company WHERE id=?";

        try(Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return new Company(rs.getInt("id"), rs.getString("name"), rs.getString("phone"));
            } else{
                return null;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error getting Company",e);
        }
    }

    @Override
    public List<Company> getAllCompanies() {
        String sql = "SELECT * FROM Company";
        ArrayList<Company> companies = new ArrayList<>();

        try(Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement stmt = connection.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                companies.add(new Company(rs.getInt("id"),rs.getString("name"),rs.getString("phone")));
            }
            System.out.println("Found All Companies Successfully");
            return companies;
        } catch (SQLException e) {
            throw new RuntimeException("Error getting Companies", e);
        }
    }

    @Override
    public void updateCompany(Company company, String name, String phone) {
        String sql = "UPDATE Company SET name=?, phone=? WHERE id=?;";

        try(Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, name);
            stmt.setString(2, phone);
            stmt.setInt(3, company.getId());

        } catch (SQLException e) {
            throw new RuntimeException("Error updating Companies", e);
        }
    }

}
