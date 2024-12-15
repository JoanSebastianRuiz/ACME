package projectacme.model;

import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.AccessSubjectRoleEnum;

public class AccessSubject {
    private String id;
    private String name;
    private String phone;
    private String emailAddress;
    private AccessSubjectRoleEnum role;
    private StateEnum state;
    private String password;
    private Integer idCompany;

    public AccessSubject(String id, String name, String phone, String emailAddress, AccessSubjectRoleEnum role, StateEnum state, String password, Integer idCompany) {
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
    public AccessSubject(StateEnum state, AccessSubjectRoleEnum role, String emailAddress, String phone, String name, String id, Integer idCompany) {
        this.state = state;
        this.role = role;
        this.emailAddress = emailAddress;
        this.phone = phone;
        this.name = name;
        this.id = id;
        this.idCompany = idCompany;
    }

    // * User

    public AccessSubject(String id, String name, String phone, String emailAddress, AccessSubjectRoleEnum role, StateEnum state, String password) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.emailAddress = emailAddress;
        this.role = role;
        this.state = state;
        this.password = password;
    }

    @Override
    public String toString() {
        return "AccessSubject{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", role=" + role +
                ", state=" + state +
                ", password='" + password + '\'' +
                ", idCompany=" + idCompany +
                '}';
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

    public AccessSubjectRoleEnum getRole() {
        return role;
    }

    public void setRole(AccessSubjectRoleEnum role) {
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

    public Integer getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Integer idCompany) {
        this.idCompany = idCompany;
    }
}
