package projectacme.repository.implementation;

import projectacme.model.ConnectionData;
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
                map.put("id", rs.getString("id"));
                map.put("name", rs.getString("name"));
                map.put("phone", rs.getString("phone"));
                map.put("emailAddress", rs.getString("emailAddress"));
                map.put("role", rs.getString("role"));
                map.put("state", rs.getString("state"));
                map.put("nameCompany", rs.getString("nameCompany"));
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
                map.put("plate", rs.getString("plate"));
                map.put("type", rs.getString("type"));
                map.put("id", rs.getString("id"));
                map.put("name", rs.getString("name"));
                map.put("nameCompany", rs.getString("nameCompany"));
                map.put("idCompany", rs.getInt("idCompany"));
                accessSubjects.add(map);
            }
            return accessSubjects;
        } catch (Exception e) {
            throw new RuntimeException("Error getting information Vehicles", e);
        }
    }
}
