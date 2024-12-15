package projectacme.repository.implementation;

import projectacme.util.ConnectionData;
import projectacme.repository.dao.ReportManagerDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportManagerImpl implements ReportManagerDAO {
    @Override
    public List<Map<String,Object>> getInformationAccessSubjects(){
        String sql= """
                SELECT a.id, a.name, a.phone, a.emailAddress, a.role, a.state, a.idCompany, c.name as nameCompany
                FROM accesssubject a
                LEFT JOIN company c ON c.id=a.idCompany;""";
        ArrayList<Map<String,Object>> accessSubjects = new ArrayList<>();

        try(Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement stmt = connection.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                HashMap<String, Object> map = new HashMap<>();
                map.put("Document", rs.getString("id"));
                map.put("Person", rs.getString("name"));
                map.put("Phone", rs.getString("phone"));
                map.put("Email Address", rs.getString("emailAddress"));
                map.put("Role", rs.getString("role"));
                map.put("State", rs.getString("state"));
                map.put("Company", rs.getString("nameCompany"));
                map.put("idCompany", rs.getInt("idCompany"));
                accessSubjects.add(map);
            }
            return accessSubjects;
        } catch (Exception e) {
            throw new RuntimeException("Error getting information AccesSubjects ", e);
        }
    }

    @Override
    public List<Map<String, Object>> getInformationVehicles() {
        String sql= """
                SELECT v.plate, v.type, a.id, a.name, c.name as nameCompany, a.idCompany
                FROM Vehicle v
                JOIN AccessSubject a ON v.idAccessSubject=a.id
                JOIN Company c ON c.id=a.idCompany;""";
        ArrayList<Map<String,Object>> accessSubjects = new ArrayList<>();

        try(Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement stmt = connection.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                HashMap<String, Object> map = new HashMap<>();
                map.put("Plate", rs.getString("plate"));
                map.put("Type Vehicle", rs.getString("type"));
                map.put("Document", rs.getString("id"));
                map.put("Full name", rs.getString("name"));
                map.put("Company", rs.getString("nameCompany"));
                map.put("idCompany", rs.getInt("idCompany"));
                accessSubjects.add(map);
            }
            return accessSubjects;
        } catch (Exception e) {
            throw new RuntimeException("Error getting information Vehicles", e);
        }
    }

    @Override
    public List<Map<String, Object>> getInformationAnnotations() {
        String sql= """
                SELECT n.id, n.datetime, n.suspended, n.reason, n.state, n.idAccessSubject, a.name AS nameSubject, a2.name AS nameLogger
                FROM Annotation n
                JOIN accesssubject a ON a.id = n.idAccessSubject
                JOIN accesssubject a2 ON a2.id = n.idAccessSubjectLogger;""";
        ArrayList<Map<String,Object>> accessSubjects = new ArrayList<>();

        try(Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement stmt = connection.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                HashMap<String, Object> map = new HashMap<>();
                map.put("Identifer", rs.getInt("id"));
                map.put("Date", rs.getTimestamp("datetime"));
                map.put("Suspended", rs.getBoolean("suspended"));
                map.put("Reason", rs.getString("reason"));
                map.put("State", rs.getString("state"));
                map.put("Document", rs.getString("idAccessSubject"));
                map.put("Person", rs.getString("nameSubject"));
                map.put("Security Guard", rs.getString("nameLogger"));
                accessSubjects.add(map);
            }
            return accessSubjects;
        } catch (Exception e) {
            throw new RuntimeException("Error getting information Annotation", e);
        }
    }

    @Override
    public List<Map<String, Object>> getInformationJustifications() {
        String sql= """
                SELECT j.id, j.datetime, j.reason, a.name AS nameLogger, j.idAccessSubjectLogger, j.idAnnotation
                FROM Justification j
                JOIN AccessSubject a ON a.id = j.idAccessSubjectLogger;""";
        ArrayList<Map<String,Object>> accessSubjects = new ArrayList<>();

        try(Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement stmt = connection.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                HashMap<String, Object> map = new HashMap<>();
                map.put("Identifer", rs.getInt("id"));
                map.put("Date", rs.getTimestamp("datetime"));
                map.put("Reason", rs.getString("reason"));
                map.put("Identifer Annotation", rs.getInt("idAnnotation"));
                map.put("idAccessSubjectLogger", rs.getString("idAccessSubjectLogger"));
                map.put("Security Guard", rs.getString("nameLogger"));
                accessSubjects.add(map);
            }
            return accessSubjects;
        } catch (Exception e) {
            throw new RuntimeException("Error getting information Justification", e);
        }
    }

    @Override
    public List<Map<String, Object>> getInformationCompanies() {
        String sql= "SELECT * FROM Company;";
        ArrayList<Map<String,Object>> accessSubjects = new ArrayList<>();

        try(Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement stmt = connection.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                HashMap<String, Object> map = new HashMap<>();
                map.put("id", rs.getInt("id"));
                map.put("Company", rs.getString("name"));
                map.put("Phone", rs.getString("phone"));
                accessSubjects.add(map);
            }
            return accessSubjects;
        } catch (Exception e) {
            throw new RuntimeException("Error getting information Company", e);
        }
    }

    @Override
    public List<Map<String, Object>> getInformationAccessLogs() {
        String sql= """
                SELECT a.type, a.datetime, a.idAccessSubject, ac.name as nameSubject, a.idScanner, ac2.name as nameLogger, ac.idCompany, c.name as nameCompany
                FROM accesslog a
                LEFT JOIN accesssubject ac ON ac.id=a.idAccessSubject
                LEFT JOIN accesssubject ac2 ON ac2.id=a.idAccessSubjectLogger
                LEFT JOIN Company c ON ac.idCompany=c.id;""";

        ArrayList<Map<String,Object>> accessSubjects = new ArrayList<>();

        try(Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement stmt = connection.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                HashMap<String, Object> map = new HashMap<>();
                map.put("Type Access", rs.getString("type"));
                map.put("Date", rs.getTimestamp("datetime"));
                map.put("Document", rs.getString("idAccessSubject"));
                map.put("Person", rs.getString("nameSubject"));
                map.put("idScanner", rs.getInt("idScanner"));
                map.put("Logger", rs.getString("nameLogger"));
                map.put("idCompany", rs.getInt("idCompany"));
                map.put("Company", rs.getString("nameCompany"));

                accessSubjects.add(map);
            }
            return accessSubjects;
        } catch (Exception e) {
            throw new RuntimeException("Error getting information Company", e);
        }
    }
}
