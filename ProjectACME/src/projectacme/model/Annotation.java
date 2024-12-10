package projectacme.model;

import projectacme.model.Enum.StateEnum;

import java.sql.Date;

public class Annotation {
    private int id; // * Autoincrement
    private Date datetime;
    private String reason;
    private Boolean suspended;
    private StateEnum state;
    private String idIndividual;
    private String idUser;

    public Annotation(Date datetime, String reason, Boolean suspended, StateEnum state, String idIndividual, String idUser) {
        this.datetime = datetime;
        this.reason = reason;
        this.suspended = suspended;
        this.state = state;
        this.idIndividual = idIndividual;
        this.idUser = idUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Boolean getSuspended() {
        return suspended;
    }

    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public String getIdIndividual() {
        return idIndividual;
    }

    public void setIdIndividual(String idIndividual) {
        this.idIndividual = idIndividual;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
}
