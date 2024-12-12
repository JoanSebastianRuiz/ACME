package projectacme.model;

import projectacme.util.Enum.AccessType;

import java.sql.Timestamp;

public class AccessLog {
    private final int id; // * Autoincrement
    private final AccessType type;
    private final Timestamp datetime;
    private final String idAccessSubject;
    private final int idScanner;
    private final String idAccessSubjectLogger;

    private AccessLog(Builder builder){
        this.id = builder.id;
        this.type = builder.type;
        this.datetime = builder.datetime;
        this.idAccessSubject = builder.idAccessSubject;
        this.idScanner = builder.idScanner;
        this.idAccessSubjectLogger = builder.idAccessSubjectLogger;
    }

    public int getId() {
        return id;
    }

    public AccessType getType() {
        return type;
    }

    public Timestamp getDatetime() {
        return datetime;
    }

    public String getIdAccessSubject() {
        return idAccessSubject;
    }

    public int getIdScanner() {
        return idScanner;
    }

    public String getIdAccessSubjectLogger() {
        return idAccessSubjectLogger;
    }

    public static class Builder{
        private int id; // * Autoincrement, optional
        private final AccessType type; // * required
        private final Timestamp datetime; // * required
        private final String idAccessSubject; // * required
        private int idScanner; // * optional
        private String idAccessSubjectLogger; // * optional

        // * Methods to optional fields

        public Builder(AccessType type, Timestamp datetime, String idAccessSubject){
            this.type=type;
            this.datetime=datetime;
            this.idAccessSubject=idAccessSubject;
        }

        public Builder setId(int id){
            this.id=id;
            return this;
        }

        public Builder setIdScanner(int idScanner){
            this.idScanner=idScanner;
            return this;
        }

        public Builder setIdAccessSubjectLogger(String idAccessSubjectLogger){
            this.idAccessSubjectLogger=idAccessSubjectLogger;
            return this;
        }

        // * Method to build AccessLog object
        public AccessLog build(){
            return new AccessLog(this);
        }
    }
}
