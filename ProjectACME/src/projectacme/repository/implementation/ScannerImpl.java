package projectacme.repository.implementation;

import projectacme.model.ConnectionData;
import projectacme.model.Enum.ScannerType;
import projectacme.model.Scanner;
import projectacme.repository.dao.ScannerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ScannerImpl implements ScannerDao {
    @Override
    public void addScanner(Scanner scanner) {
        String sql = "INSERT INTO Scanner(type) VALUES(?);";

        try(Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, scanner.getType().name());
            stmt.executeUpdate();
            System.out.println("Added new Scanner");
        } catch (SQLException e) {
            throw new RuntimeException("Error inserting Scanner", e);
        }
    }

    @Override
    public Scanner getScannerById(int id) {
        String sql = "SELECT * FROM Scanner WHERE id=?;";

        try(Connection connection=ConnectionData.getConnectionDatabase();
            PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return new Scanner(rs.getInt("id"), ScannerType.valueOf(rs.getString("type")));
            } else{
                return null;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error getting Scanner", e);
        }
    }

    @Override
    public List<Scanner> getScanners() {
        ArrayList<Scanner> scanners = new ArrayList<>();
        String sql = "SELECT * FROM Scanner;";

        try(Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement stmt = connection.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                scanners.add(new Scanner(rs.getInt("id"),ScannerType.valueOf(rs.getString("type"))));
            }
            System.out.println("Found All Scanners Successfully");
            return  scanners;

        } catch (SQLException e){
            throw new RuntimeException("Error getting Scanners",e);
        }
    }

    @Override
    public void updateScanner(Scanner scanner, ScannerType type) {
        String sql = "UPDATE Scanner SET type=? WHERE id=?;";

        try(Connection connection = ConnectionData.getConnectionDatabase();
            PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1, scanner.getType().name());
            stmt.setInt(2, scanner.getId());
            stmt.executeUpdate();
            System.out.println("Updated Scanner Successfully");

        } catch (SQLException e) {
            throw new RuntimeException("Error updating Scanner", e);
        }
    }
}
