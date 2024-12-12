package projectacme.repository.implementation;

import projectacme.model.AccessSubject;
import projectacme.model.ConnectionData;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.AccessSubjectRoleEnum;
import projectacme.repository.dao.AccessSubjectDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccessSubjectImpl implements AccessSubjectDao {
    @Override
    public void addAccessSubject(AccessSubject accessSubject) {
            String sql = "INSERT INTO AccessSubject(id, password, name, role, state, idCompany) VALUES (?, ?, ?, ?, ?, ?);";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, accessSubject.getId());
            statement.setString(2, accessSubject.getPassword());
            statement.setString(3, accessSubject.getName());
            statement.setString(4, accessSubject.getRole().toString());
            statement.setString(5, accessSubject.getState().toString());
            statement.setInt(6, accessSubject.getIdCompany());
            statement.executeUpdate();
            System.out.println("Added: " + accessSubject.getName());

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public AccessSubject getAccessSubjectById(String id) {
            String sql = "SELECT * FROM AccessSubject WHERE id = ?;";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement statement = connection.prepareStatement(sql);
        )
        {
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new AccessSubject(resultSet.getString("id"), resultSet.getString("name"), resultSet.getString("phone"), resultSet.getString("emailAddress"), AccessSubjectRoleEnum.valueOf(resultSet.getString("role")), StateEnum.valueOf(resultSet.getString("state")), resultSet.getString("password"), resultSet.getInt("idCompany"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<AccessSubject> getAccessSubjects() {
            String sql = "SELECT * FROM AccessSubject;";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            ResultSet resultSet = statement.executeQuery();
            List<AccessSubject> accessSubjects = new ArrayList<>();
            while (resultSet.next()) {
                AccessSubject accessSubject = new AccessSubject(resultSet.getString("id"), resultSet.getString("name"), resultSet.getString("phone"), resultSet.getString("emailAddress"), AccessSubjectRoleEnum.valueOf(resultSet.getString("role")), StateEnum.valueOf(resultSet.getString("state")), resultSet.getString("password"), resultSet.getInt("idCompany"));
                accessSubjects.add(accessSubject);
            }
            System.out.println("Found All Successfully");
            return accessSubjects;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void updateAccessSubject(AccessSubject accessSubject, String name, String phone, String emailAddress, AccessSubjectRoleEnum role, StateEnum state, String password) {
        String sql = "UPDATE AccessSubject SET name = ?, phone = ?, emailAddress = ?, role = ?, state = ?, password = ? WHERE id = ?;";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
             PreparedStatement statement = connection.prepareStatement(sql);)
        {
            statement.setString(1, name);
            statement.setString(2, phone);
            statement.setString(3, emailAddress);
            statement.setString(4, role.toString());
            statement.setString(5, state.toString());
            statement.setString(6, password);
            statement.setString(7, accessSubject.getId());
            statement.executeUpdate();
            System.out.println("Updated Successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
