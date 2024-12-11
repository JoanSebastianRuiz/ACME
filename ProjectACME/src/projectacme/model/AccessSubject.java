package projectacme.model;

import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.UserRoleEnum;

public class AccessSubject {
    private String id;
    private String name;
    private String phone;
    private String emailAddress;
    private UserRoleEnum role;
    private StateEnum state;
    private String password;
    private int idCompany;

    public AccessSubject(String id, String name, String phone, String emailAddress, UserRoleEnum role, StateEnum state, String password, int idCompany) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.emailAddress = emailAddress;
        this.role = role;
        this.state = state;
        this.password = password;
        this.idCompany = idCompany;
    }

    // * Individual
    public AccessSubject(StateEnum state, UserRoleEnum role, String emailAddress, String phone, String name, String id, int idCompany) {
        this.state = state;
        this.role = role;
        this.emailAddress = emailAddress;
        this.phone = phone;
        this.name = name;
        this.id = id;
        this.idCompany = idCompany;
    }

    // * User

    public AccessSubject(String id, String name, String phone, String emailAddress, UserRoleEnum role, StateEnum state, String password) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.emailAddress = emailAddress;
        this.role = role;
        this.state = state;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }
}
