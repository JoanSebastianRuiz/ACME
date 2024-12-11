package projectacme.repository.dao;

import projectacme.model.Enum.VehicleEnum;
import projectacme.model.Vehicle;

import java.util.List;

public interface VehicleDao {
    void addVehicle(Vehicle vehicle);
    Vehicle getVehicleByPlate(String plate);
    List<Vehicle> getVehicles();
    void updateVehicle(Vehicle vehicle, VehicleEnum type);
}
