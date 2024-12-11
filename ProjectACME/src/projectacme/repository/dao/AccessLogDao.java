package projectacme.repository.dao;

import projectacme.model.Enum.AccessType;
import projectacme.model.AccessLog;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public interface AccessLogDao {
    void addAccessLog(AccessLog accessLog);
    AccessLog getAccessLogById(int id);
    List<AccessLog> getAllAccessLog();
    void updateAccessLog(AccessLog accessLog, AccessType type, Timestamp datetime);
}
