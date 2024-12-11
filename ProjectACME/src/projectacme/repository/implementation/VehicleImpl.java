package projectacme.repository.implementation;

import projectacme.model.ConnectionData;
import projectacme.model.Enum.VehicleEnum;
import projectacme.model.Vehicle;
import projectacme.repository.dao.VehicleDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VehicleImpl implements VehicleDao {
    @Override
    public void addVehicle(Vehicle vehicle) {
        String sql = "INSERT INTO Vehicle(plate, type, idIndividual) VALUES (?, ?, ?);";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, vehicle.getPlate());
            statement.setString(2, vehicle.getType().toString());
            statement.setString(3, vehicle.getIdIndividual());
            statement.executeUpdate();
            System.out.println("Added: " + vehicle.getPlate());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Vehicle getVehicleByPlate(String plate) {
        String sql = "SELECT * FROM Vehicle WHERE plate = ?;";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
             PreparedStatement statement = connection.prepareStatement(sql);
        )
        {
            statement.setString(1, plate);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Vehicle(resultSet.getString("plate"), VehicleEnum.valueOf(resultSet.getString("type")), resultSet.getString("idIndividual"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Vehicle> getVehicles() {
        String sql = "SELECT * FROM Vehicle;";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
             PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            ResultSet resultSet = statement.executeQuery();
            List<Vehicle> vehicles = new ArrayList<>();
            while (resultSet.next()) {
                Vehicle vehicle = new Vehicle(resultSet.getString("plate"), VehicleEnum.valueOf(resultSet.getString("type")), resultSet.getString("idIndividual"));
                vehicles.add(vehicle);
            }
            System.out.println("Found All Successfully");
            return vehicles;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void updateVehicle(Vehicle vehicle, VehicleEnum type) {
        String sql = "UPDATE Vehicle SET type = ? WHERE plate = ?;";
        try (java.sql.Connection connection = ConnectionData.getConnectionDatabase();
             PreparedStatement statement = connection.prepareStatement(sql);)
        {
            statement.setString(1, type.toString());
            statement.setString(2, vehicle.getPlate());
            statement.executeUpdate();
            System.out.println("Updated Successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
