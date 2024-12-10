package projectacme.repository.dao;

import projectacme.model.Enum.StateEnum;
import projectacme.model.Enum.UserRoleEnum;
import projectacme.model.Enum.VehicleEnum;
import projectacme.model.Vehicle;

import java.util.List;

public interface VehicleDao {
    void addVehicle(Vehicle vehicle);
    Vehicle getVehicleById(int id);
    List<Vehicle> getVehicles();
    void updateVehicle(Vehicle vehicle, String plate, VehicleEnum type, String idIndividual);
    void deleteVehicle(Vehicle vehicle);
    void deleteAllVehicles();
    void truncateVehicle();
}
