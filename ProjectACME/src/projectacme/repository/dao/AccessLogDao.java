package projectacme.repository.dao;

import projectacme.model.Enum.AccessType;
import projectacme.model.Enum.StateEnum;
import projectacme.model.Enum.UserRoleEnum;
import projectacme.model.AccessLog;

import java.sql.Date;
import java.util.List;

public interface AccessLogDao {
    void addAccessLog(AccessLog accessLog);
    AccessLog getAccessLogById(int id);
    List<AccessLog> getAllAccessLog();
    void updateAccessLog(AccessLog accessLog, AccessType type, Date datetime, String idIndividual, String idUser);
    void deleteAccessLog(AccessLog accessLog);
    void deleteAllAccessLog();
    void truncateAccessLog();
}
