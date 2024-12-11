package projectacme.repository.dao;

import projectacme.util.Enum.AccessType;
import projectacme.model.AccessLog;

import java.sql.Timestamp;
import java.util.List;

public interface AccessLogDao {
    void addAccessLog(AccessLog accessLog);
    AccessLog getAccessLogById(int id);
    List<AccessLog> getAllAccessLog();
    void updateAccessLog(AccessLog accessLog, AccessType type, Timestamp datetime, String idAccessSubject, int idScanner, String idAccessSubjectLogger);
}
