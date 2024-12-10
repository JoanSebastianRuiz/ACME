package projectacme.repository.implementation;

import projectacme.model.ConnectionData;
import projectacme.model.Enum.StateEnum;
import projectacme.model.Enum.UserRoleEnum;
import projectacme.model.User;
import projectacme.repository.dao.UserDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import static projectacme.model.Enum.UserRoleEnum.sudo;
import static projectacme.model.Enum.StateEnum.active;

public class UserImpl implements UserDao {
    @Override
    public void addUser(User user) {
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase()) {
            String sql = "INSERT INTO User(id, password, name, role, state, idCompany) VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user.getId());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getName());
            statement.setString(4, user.getRole().toString());
            statement.setString(5, user.getState().toString());
            statement.setInt(6, user.getIdCompany());
            statement.executeUpdate();
            System.out.println("Added: " + user.getName());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return List.of();
    }

    @Override
    public void updateUser(User user, String id, String password, String name, UserRoleEnum userRoleEnum, StateEnum stateEnum, int idCompany) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void deleteAllUsers() {

    }

    @Override
    public void truncateUser() {

    }

    public static void main(String[] args) {
        UserImpl userImpl = new UserImpl();
        userImpl.addUser(new User("1097494374", "123","Juan", sudo, active, 1));
    }
}
