package projectacme.util.validators;

public class StringValidator {
    public static boolean StringLengthLessThanValidator(String string, int lessThan) {
        String stringTrim = string.trim();
        return (stringTrim.length() <= lessThan);
    }

    public static boolean StringLengthExactlyThanValidator(String string, int exact) {
        String stringTrim = string.trim();
        return (stringTrim.length() == exact);
    }
}
