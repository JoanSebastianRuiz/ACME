package projectacme.model;

import projectacme.util.Enum.AccessType;

import java.sql.Timestamp;

public class AccessLog {
    private int id; // * Autoincrement
    private AccessType type;
    private Timestamp datetime;
    private String idAccessSubject;
    private Integer idScanner;
    private String idAccessSubjectLogger;

    //Constructor to register
    public AccessLog(AccessType type, Timestamp datetime, String idAccessSubject, Integer idScanner, String idAccessSubjectLogger) {
        this.type = type;
        this.datetime = datetime;
        this.idAccessSubject = idAccessSubject;
        this.idScanner = idScanner==null ? 0 : idScanner;
        this.idAccessSubjectLogger = idAccessSubjectLogger;
    }

    //Constructor to get
    public AccessLog(int id, AccessType type, Timestamp datetime, String idAccessSubject, Integer idScanner, String idAccessSubjectLogger) {
        this.id = id;
        this.type = type;
        this.datetime = datetime;
        this.idAccessSubject = idAccessSubject;
        this.idScanner = idScanner;
        this.idAccessSubjectLogger = idAccessSubjectLogger;
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

    public String getIdAccessSubject() {
        return idAccessSubject;
    }

    public void setIdAccessSubject(String idAccessSubject) {
        this.idAccessSubject = idAccessSubject;
    }

    public Integer getIdScanner() {
        return idScanner;
    }

    public void setIdScanner(Integer idScanner) {
        this.idScanner = idScanner;
    }

    public String getIdAccessSubjectLogger() {
        return idAccessSubjectLogger;
    }

    public void setIdAccessSubjectLogger(String idAccessSubjectLogger) {
        this.idAccessSubjectLogger = idAccessSubjectLogger;
    }
}
