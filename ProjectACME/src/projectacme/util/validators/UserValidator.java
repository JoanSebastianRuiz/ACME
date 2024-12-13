package projectacme.util.validators;

public class UserValidator {
    public static boolean UserIdValidator(String id){
        String idTrim = id.trim();
        return StringValidator.StringLengthLessThanValidator(idTrim,10) && NumberValidator.isNumeric(idTrim);
    }
}
