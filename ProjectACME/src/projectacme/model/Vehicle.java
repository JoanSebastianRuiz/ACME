package projectacme.model;

import projectacme.util.Enum.VehicleEnum;

public class Vehicle {
    private String plate;
    private VehicleEnum type;
    private String idAccessSubject;

    public Vehicle(String plate, VehicleEnum type, String idAccessSubject) {
        this.plate = plate;
        this.type = type;
        this.idAccessSubject = idAccessSubject;
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

    public String getIdAccessSubject() {
        return idAccessSubject;
    }

    public void setIdAccessSubject(String idAccessSubject) {
        this.idAccessSubject = idAccessSubject;
    }
}
