package projectacme.model;

import projectacme.model.Enum.VehicleEnum;

public class Vehicle {
    private String plate;
    private VehicleEnum type;
    private String idIndividual;

    public Vehicle(String plate, VehicleEnum type, String idIndividual) {
        this.plate = plate;
        this.type = type;
        this.idIndividual = idIndividual;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public VehicleEnum getType() {
        return type;
    }

    public void setType(VehicleEnum type) {
        this.type = type;
    }

    public String getIdIndividual() {
        return idIndividual;
    }

    public void setIdIndividual(String idIndividual) {
        this.idIndividual = idIndividual;
    }
}
