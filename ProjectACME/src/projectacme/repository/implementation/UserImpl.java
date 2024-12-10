package projectacme.repository.implementation;

import projectacme.model.ConnectionData;
import projectacme.model.Enum.StateEnum;
import projectacme.model.Enum.UserRoleEnum;
import projectacme.model.User;
import projectacme.repository.dao.UserDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static projectacme.model.Enum.UserRoleEnum.sudo;
import static projectacme.model.Enum.StateEnum.active;

public class UserImpl implements UserDao {
    @Override
    public void addUser(User user) {
            String sql = "INSERT INTO User(id, password, name, role, state, idCompany) VALUES (?, ?, ?, ?, ?, ?);";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getId());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getName());
            statement.setString(4, user.getRole().toString());
            statement.setString(5, user.getState().toString());
            statement.setInt(6, user.getIdCompany());
            statement.executeUpdate();
            System.out.println("Added: " + user.getName());

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public User getUserById(String id) {
            String sql = "SELECT * FROM User WHERE id = ?;";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement statement = connection.prepareStatement(sql);
        )
        {
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new User(resultSet.getString("id"), resultSet.getString("password"), resultSet.getString("name"), UserRoleEnum.valueOf(resultSet.getString("role")), StateEnum.valueOf(resultSet.getString("state")), resultSet.getInt("idCompany"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<User> getUsers() {
            String sql = "SELECT * FROM User;";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            ResultSet resultSet = statement.executeQuery();
            List<User> users = new ArrayList<>();
            while (resultSet.next()) {
                User user = new User(resultSet.getString("id"), resultSet.getString("password"), resultSet.getString("name"), UserRoleEnum.valueOf(resultSet.getString("role")), StateEnum.valueOf(resultSet.getString("state")), resultSet.getInt("idCompany"));
                users.add(user);
            }
            System.out.println("Found All Successfully");
            return users;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void updateUser(User user, String password, String name, UserRoleEnum userRoleEnum, StateEnum stateEnum, int idCompany) {
        String sql = "UPDATE User SET password = ?, name = ?, role = ?, state = ?, idCompany = ? WHERE id = ?;";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
             PreparedStatement statement = connection.prepareStatement(sql);)
        {
            statement.setString(1, password);
            statement.setString(2, name);
            statement.setString(3, userRoleEnum.toString());
            statement.setString(4, stateEnum.toString());
            statement.setInt(5, idCompany);
            statement.setString(6, user.getId());
            statement.executeUpdate();
            System.out.println("Updated Successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
