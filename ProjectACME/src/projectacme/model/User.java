package projectacme.model;

import projectacme.model.Enum.StateEnum;
import projectacme.model.Enum.UserRoleEnum;

public class User {
    private String id;
    private String password;
    private String name;
    private UserRoleEnum role;
    private StateEnum state;
    private int idCompany;

    public User(String id, String password, String name, UserRoleEnum role, StateEnum state, int idCompany) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.role = role;
        this.state = state;
        this.idCompany = idCompany;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRoleEnum getRole() {
        return role;
    }

    public void setRole(UserRoleEnum role) {
        this.role = role;
    }

    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }
}
