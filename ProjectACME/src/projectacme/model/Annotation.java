package projectacme.model;

import projectacme.util.Enum.StateEnum;

import java.sql.Date;
import java.sql.Timestamp;

public class Annotation {
    private int id; // * Autoincrement
    private Timestamp datetime;
    private String reason;
    private Boolean suspended;
    private StateEnum state;
    private String idAccessSubject;
    private String idAccessSubjectLogger;

    public Annotation(Timestamp datetime, String reason, Boolean suspended, StateEnum state, String idAccessSubject, String idAccessSubjectLogger) {
        this.datetime = datetime;
        this.reason = reason;
        this.suspended = suspended;
        this.state = state;
        this.idAccessSubject = idAccessSubject;
        this.idAccessSubjectLogger = idAccessSubjectLogger;
    }

    public Annotation(int id, Timestamp datetime, String reason, Boolean suspended, StateEnum state, String idAccessSubject, String idAccessSubjectLogger) {
        this.id = id;
        this.datetime = datetime;
        this.reason = reason;
        this.suspended = suspended;
        this.state = state;
        this.idAccessSubject = idAccessSubject;
        this.idAccessSubjectLogger = idAccessSubjectLogger;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
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

    public String getIdAccessSubject() {
        return idAccessSubject;
    }

    public void setIdAccessSubject(String idAccessSubject) {
        this.idAccessSubject = idAccessSubject;
    }

    public String getIdAccessSubjectLogger() {
        return idAccessSubjectLogger;
    }

    public void setIdAccessSubjectLogger(String idAccessSubjectLogger) {
        this.idAccessSubjectLogger = idAccessSubjectLogger;
    }
}
