package JAVA13;

import java.time.LocalDate;

/**
 * introduced a yield keyword to return value from switch expression
 * similar to break
 */
public class SwitchExpressionEnhancementExample {
    public static void main(String[] args) {
        //print quater for month
        var month = "JAN";
        //return value
        var quarter = switch (month) {
            case "JAN", "FEB", "MAR" -> {
                var isLeapYear = LocalDate.now().isLeapYear();
                yield (isLeapYear) ? "FIRST QUARTER -- LEAP YEAR" : "FIRST QUARTER";
            }
            case "APR", "MAY", "JUN" -> "SECOND QUARTER";
            case "JUL", "AUG", "SEP" -> "THIRD QUARTER";
            case "OCT", "NOV", "DEC" -> "FOURTH QUARTER";
            default -> "UNKNOWN QUARTER";
        };
        System.out.println("quarter = " + quarter);
    }
}
