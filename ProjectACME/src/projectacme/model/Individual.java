package projectacme.model;

import projectacme.model.Enum.IndividualRoleEnum;
import projectacme.model.Enum.StateEnum;

public class Individual {
    private String id;
    private String name;
    private IndividualRoleEnum role;
    private StateEnum state;
    private String phone;
    private String emailAddress;
    private int idCompany;

    public Individual(String id, String name, IndividualRoleEnum role, StateEnum state, String phone, String emailAddress, int idCompany) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.state = state;
        this.phone = phone;
        this.emailAddress = emailAddress;
        this.idCompany = idCompany;
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

    public IndividualRoleEnum getRole() {
        return role;
    }

    public void setRole(IndividualRoleEnum role) {
        this.role = role;
    }

    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
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

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }
}
