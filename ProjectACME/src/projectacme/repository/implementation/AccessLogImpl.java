package projectacme.repository.implementation;

import projectacme.model.AccessLog;
import projectacme.model.ConnectionData;
import projectacme.model.Enum.AccessType;
import projectacme.repository.dao.AccessLogDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccessLogImpl implements AccessLogDao {
    @Override
    public void addAccessLog(AccessLog accessLog) {
        String sql = "INSERT INTO AccessLog(type,datetime,idIndividual,idUser) VALUES(?,?,?,?);";

        try(Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement stmt = connection.prepareStatement(sql);){
            stmt.setString(1,accessLog.getType().name());
            stmt.setString(2,accessLog.getDatetime().toString());
            stmt.setString(3,accessLog.getIdIndividual());
            stmt.setString(4,accessLog.getIdUser());
            stmt.executeUpdate();
            System.out.println("Added new AcessLog");

        } catch (SQLException e){
            throw new RuntimeException("Error inserting AccessLog into the database", e);
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
                return new AccessLog(rs.getInt("id"), AccessType.valueOf(rs.getString("type")), rs.getTimestamp("datetime"), rs.getString("idIndividual"), rs.getString("idUser"));
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
                accessLogs.add(new AccessLog(rs.getInt("id"), AccessType.valueOf(rs.getString("type")), rs.getTimestamp("datetime"), rs.getString("idIndividual"), rs.getString("idUser")));
            }
            return  accessLogs;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateAccessLog(AccessLog accessLog, AccessType type, Timestamp datetime, String idIndividual, String idUser) {
        String sql = "UPDATE AccessLog SET "

    }
}
