package projectacme.util.validators;

public class PhoneValidator {
    public static boolean phoneValidator(String phone) {
        String phoneTrim = phone.trim();
        return (phoneTrim.length() == 10 && NumberValidator.isNumeric(phoneTrim));
    }
}
