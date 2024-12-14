package projectacme.repository.implementation;

import projectacme.model.Annotation;
import projectacme.util.ConnectionData;
import projectacme.repository.dao.AnnotationDao;
import projectacme.util.Enum.StateEnum;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnnotationImpl implements AnnotationDao {
    @Override
    public void addAnnotation(Annotation annotation) {
        String sql = "INSERT INTO Annotation(datetime, reason, suspended, state, idAccessSubject, idAccessSubjectLogger) VALUES (?, ?, ?, ?, ? ,?);";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, annotation.getDatetime().toString());
            statement.setString(2, annotation.getReason());
            statement.setBoolean(3, annotation.getSuspended());
            statement.setString(4, annotation.getState().toString());
            statement.setString(5, annotation.getIdAccessSubject());
            statement.setString(6, annotation.getIdAccessSubjectLogger());
            statement.executeUpdate();
            System.out.println("Added - Annotation Id: " + annotation.getId());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Annotation getAnnotationLogById(int id) {
        String sql = "SELECT * FROM Annotation WHERE id = ?;";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
             PreparedStatement statement = connection.prepareStatement(sql);
        )
        {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Annotation(resultSet.getTimestamp("datetime"), resultSet.getString("reason"),resultSet.getBoolean("suspended"),StateEnum.valueOf(resultSet.getString("state")), resultSet.getString("idAccessSubject"), resultSet.getString("idAccessSubjectLogger"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Annotation> getAllAnnotation() {
        String sql = "SELECT * FROM Annotation;";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
             PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            ResultSet resultSet = statement.executeQuery();
            List<Annotation> annotations = new ArrayList<>();
            while (resultSet.next()) {
                Annotation annotation = new Annotation(resultSet.getInt("id"), resultSet.getTimestamp("datetime"), resultSet.getString("reason"),resultSet.getBoolean("suspended"),StateEnum.valueOf(resultSet.getString("state")), resultSet.getString("idAccessSubject"), resultSet.getString("idAccessSubjectLogger"));
                annotations.add(annotation);
            }
            System.out.println("Found All Successfully");
            return annotations;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return List.of();
    }

    @Override
    public void updateAnnotation(Annotation annotation, Timestamp datetime, String reason, Boolean suspended, StateEnum state) {
        String sql = "UPDATE Annotation SET datetime =?, reason =?, suspended =?, state =? WHERE id =?;";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, datetime.toString());
            statement.setString(2, reason);
            statement.setBoolean(3, suspended);
            statement.setString(4, state.toString());
            statement.setInt(5, annotation.getId());
            statement.executeUpdate();
            System.out.println("Updated - Annotation Id: " + annotation.getId());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
