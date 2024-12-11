package projectacme.repository.implementation;

import projectacme.model.AccessLog;
import projectacme.model.Enum.AccessType;
import projectacme.repository.dao.AccessLogDao;

import java.sql.Timestamp;
import java.util.List;

public class AccessLogImpl implements AccessLogDao {
    @Override
    public void addAccessLog(AccessLog accessLog) {

    }

    @Override
    public AccessLog getAccessLogById(int id) {
        return null;
    }

    @Override
    public List<AccessLog> getAllAccessLog() {
        return List.of();
    }

    @Override
    public void updateAccessLog(AccessLog accessLog, AccessType type, Timestamp datetime) {

    }
}
