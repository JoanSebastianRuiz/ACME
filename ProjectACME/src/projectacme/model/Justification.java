package projectacme.model;

import java.sql.Timestamp;

public class Justification {
    private int id; // * Autoincrement
    private Timestamp datetime;
    private String reason;
    private String idAccessSubjectLogger;
    private String idAnnotation;

    public Justification(Timestamp datetime, String reason, String idAccessSubjectLogger, String idAnnotation) {
        this.datetime = datetime;
        this.reason = reason;
        this.idAccessSubjectLogger = idAccessSubjectLogger;
        this.idAnnotation = idAnnotation;
    }

    public Justification(int id, Timestamp datetime, String reason, String idAccessSubjectLogger, String idAnnotation) {
        this.id = id;
        this.datetime = datetime;
        this.reason = reason;
        this.idAccessSubjectLogger = idAccessSubjectLogger;
        this.idAnnotation = idAnnotation;
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

    public String getIdAccessSubjectLogger() {
        return idAccessSubjectLogger;
    }

    public void setIdAccessSubjectLogger(String idAccessSubjectLogger) {
        this.idAccessSubjectLogger = idAccessSubjectLogger;
    }

    public String getIdAnnotation() {
        return idAnnotation;
    }

    public void setIdAnnotation(String idAnnotation) {
        this.idAnnotation = idAnnotation;
    }
}
