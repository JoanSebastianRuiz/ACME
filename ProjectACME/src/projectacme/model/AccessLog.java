package projectacme.model;

import projectacme.model.Enum.AccessType;

import java.sql.Date;
import java.sql.Timestamp;

public class AccessLog {
    private int id; // * Autoincrement
    private AccessType type;
    private Timestamp datetime;
    private String idIndividual;
    private String idUser;

    public AccessLog(AccessType type, Timestamp datetime, String idIndividual, String idUser) {
        this.type = type;
        this.datetime = datetime;
        this.idIndividual = idIndividual;
        this.idUser = idUser;
    }

    public AccessLog(int id, AccessType type, Timestamp datetime, String idIndividual, String idUser) {
        this.id = id;
        this.type = type;
        this.datetime = datetime;
        this.idIndividual = idIndividual;
        this.idUser = idUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AccessType getType() {
        return type;
    }

    public void setType(AccessType type) {
        this.type = type;
    }

    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
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
