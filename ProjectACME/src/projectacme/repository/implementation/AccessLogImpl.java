package projectacme.repository.implementation;

import projectacme.events.Observer;
import projectacme.events.Subject;
import projectacme.model.AccessLog;
import projectacme.model.ConnectionData;
import projectacme.util.Enum.AccessType;
import projectacme.repository.dao.AccessLogDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccessLogImpl implements AccessLogDao, Subject{
    private final List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers){
            observer.update(message);
        }
    }

    @Override
    public void addAccessLog(AccessLog accessLog) {
        String sql = "INSERT INTO AccessLog(type,datetime,idAccessSubject,idScanner,idAccessSubjectLogger) VALUES(?,?,?,?,?);";
        try(Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement stmt = connection.prepareStatement(sql);){
            stmt.setString(1,accessLog.getType().name());
            stmt.setTimestamp(2,accessLog.getDatetime());
            stmt.setString(3,accessLog.getIdAccessSubject());
            stmt.setInt(4,accessLog.getIdScanner());
            stmt.setString(5,accessLog.getIdAccessSubjectLogger());
            stmt.executeUpdate();
            System.out.println("Added new AccessLog");
            notifyObservers("New AccessLog added: " + accessLog.getId());

        } catch (SQLException e){
            throw new RuntimeException("Error inserting AccessLog", e);
        }
    }

    @Override
    public AccessLog getAccessLogById(int id) {
        String sql = "SELECT * FROM AccessLog WHERE id=?";
        try(Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getString("idScanner")!=null ?
                        new AccessLog.Builder(AccessType.valueOf(rs.getString("type")), rs.getTimestamp("datetime"), rs.getString("idAccessSubject"))
                                .setId(rs.getInt("id"))
                                .setIdScanner(rs.getInt("idScanner"))
                                .build():
                        new AccessLog.Builder(AccessType.valueOf(rs.getString("type")), rs.getTimestamp("datetime"), rs.getString("idAccessSubject"))
                                .setId(rs.getInt("id"))
                                .setIdAccessSubjectLogger("idAccessSubjectLogger")
                                .build();
            } else{
                return null;
            }

        } catch (SQLException e){
            throw new RuntimeException("Error getting AccessLog",e);
        }
    }

    @Override
    public List<AccessLog> getAllAccessLog() {
        String sql = "SELECT * FROM AccessLog;";
        try(Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement stmt = connection.prepareStatement(sql)){
            ResultSet rs =stmt.executeQuery();
            ArrayList<AccessLog> accessLogs = new ArrayList<>();

            while (rs.next()){
                accessLogs.add(rs.getString("idScanner")!=null ?
                        new AccessLog.Builder(AccessType.valueOf(rs.getString("type")), rs.getTimestamp("datetime"), rs.getString("idAccessSubject"))
                                .setId(rs.getInt("id"))
                                .setIdScanner(rs.getInt("idScanner"))
                                .build():
                        new AccessLog.Builder(AccessType.valueOf(rs.getString("type")), rs.getTimestamp("datetime"), rs.getString("idAccessSubject"))
                                .setId(rs.getInt("id"))
                                .setIdAccessSubjectLogger("idAccessSubjectLogger")
                                .build());
            }
            System.out.println("Found All AccessLogs Successfully");
            return  accessLogs;

        } catch (SQLException e) {
            throw new RuntimeException("Error getting AccessLogs",e);
        }
    }

    @Override
    public void updateAccessLog(AccessLog accessLog, AccessType type, Timestamp datetime, String idAccessSubject, int idScanner, String idAccessSubjectLogger) {
        String sql = "UPDATE AccessLog SET type=?, datetime=?, idAccessSubject=?, idScanner=?, idAccessSubjectLogger=? WHERE id=?";
        try(Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, type.name());
            stmt.setTimestamp(2, datetime);
            stmt.setString(3, idAccessSubject);
            stmt.setInt(4, idScanner);
            stmt.setString(5, idAccessSubjectLogger);
            stmt.setInt(6, accessLog.getId());
            stmt.executeUpdate();
            System.out.println("Updated AccessLog Successfully");

        } catch (SQLException e) {
            throw new RuntimeException("Error updating AccessLog",e);
        }

    }
}
