package projectacme.model;

import java.sql.Date;

public class Justification {
    private int id; // * Autoincrement
    private Date datetime;
    private String reason;
    private String idUser;
    private String idAnnotation;

    public Justification(Date datetime, String reason, String idUser, String idAnnotation) {
        this.datetime = datetime;
        this.reason = reason;
        this.idUser = idUser;
        this.idAnnotation = idAnnotation;
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

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdAnnotation() {
        return idAnnotation;
    }

    public void setIdAnnotation(String idAnnotation) {
        this.idAnnotation = idAnnotation;
    }
}
