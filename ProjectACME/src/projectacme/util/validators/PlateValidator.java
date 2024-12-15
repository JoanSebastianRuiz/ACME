package projectacme.util.validators;

import projectacme.model.Vehicle;
import projectacme.repository.implementation.VehicleImpl;

public class PlateValidator {
    private static VehicleImpl vehicleImpl = new VehicleImpl();

    public static boolean plateCarValidator(String plate) {
        return plate.matches("^[A-Z]{3}\\d{3}$");
    }

    public static boolean plateMotorcycleValidator(String plate) {
        return plate.matches("^[A-Z]{3}\\d{2}[A-Z]$");
    }

    public static boolean plateExist(String plate){
        Vehicle vehicle = vehicleImpl.getVehicleByPlate(plate);
        return vehicle!=null;
    }
}
