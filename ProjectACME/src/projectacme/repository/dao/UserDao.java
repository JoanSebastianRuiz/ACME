package projectacme.repository.dao;

import projectacme.model.Enum.StateEnum;
import projectacme.model.Enum.UserRoleEnum;
import projectacme.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    User getUserById(int id);
    List<User> getUsers();
    void updateUser(User user, String id, String password, String name, UserRoleEnum userRoleEnum, StateEnum stateEnum, int idCompany);
    void deleteUser(User user);
    void deleteAllUsers();
    void truncateUser();
}
