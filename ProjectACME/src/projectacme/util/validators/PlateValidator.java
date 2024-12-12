package projectacme.util.validators;

public class PlateValidator {
    public static boolean plateCarValidator(String plate) {
        return plate.matches("^[A-Z]{3}\\d{3}$");
    }

    public static boolean plateMotorcycleValidator(String plate) {
        return plate.matches("^[A-Z]{3}\\d{2}[A-Z]$");
    }
}
