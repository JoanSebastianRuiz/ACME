package projectacme.repository.implementation;

import projectacme.model.ConnectionData;
import projectacme.model.Justification;
import projectacme.repository.dao.JustificationDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JustificationImpl implements JustificationDao{
    @Override
    public void addJustification(Justification justification) {
        String sql = "INSERT INTO Justification(datetime, reason, idAccessSubjectLogger, idAnnotation) VALUES (?, ?, ?, ?);";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, justification.getDatetime().toString());
            statement.setString(2, justification.getReason());
            statement.setString(3, justification.getIdAccessSubjectLogger());
            statement.setString(4, justification.getIdAnnotation());
            statement.executeUpdate();
            System.out.println("Added - Justification Id: " + justification.getIdAnnotation());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Justification getJustificationLogById(int id) {
        String sql = "SELECT * FROM Justification WHERE id = ?;";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
             PreparedStatement statement = connection.prepareStatement(sql);
        )
        {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Justification(resultSet.getTimestamp("datetime"), resultSet.getString("reason"), resultSet.getString("idAccessSubjectLogger"), resultSet.getString("idAnnotation"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Justification> getAllJustifications() {
        String sql = "SELECT * FROM Justification;";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
             PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            ResultSet resultSet = statement.executeQuery();
            List<Justification> justifications = new ArrayList<>();
            while (resultSet.next()) {
                Justification justification = new Justification(resultSet.getTimestamp("datetime"), resultSet.getString("reason"), resultSet.getString("idAccessSubjectLogger"), resultSet.getString("idAnnotation"));
                justifications.add(justification);
            }
            System.out.println("Found All Successfully");
            return justifications;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void updateJustification(Justification justification, Timestamp datetime, String reason) {
        String sql = "UPDATE Justification SET datetime = ?, reason= ? WHERE id = ?;";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
             PreparedStatement statement = connection.prepareStatement(sql);)
        {
            statement.setString(1, datetime.toString());
            statement.setString(2, reason);
            statement.setString(3, justification.getIdAnnotation());
            statement.executeUpdate();
            System.out.println("Updated Successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
