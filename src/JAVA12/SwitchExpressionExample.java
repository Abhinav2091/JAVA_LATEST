package JAVA12;

/**
 * these are Switch expression not switch statements
 *
 * we can also perform action instead of return values
 */
public class SwitchExpressionExample {
    public static void main(String[] args) {
        //print quater for month
        var month="JAN";
        //return value
        var quarter = switch(month){
            case "JAN","FEB","MAR" ->"FIRST QUARTER";
            case "APR","MAY","JUN" ->"SECOND QUARTER";
            case "JUL","AUG","SEP" ->"THIRD QUARTER";
            case "OCT","NOV","DEC" ->"FOURTH QUARTER";
            default -> "UNKNOWN QUARTER";
        };
        System.out.println("quarter = " + quarter);
        
        //perform action inside switch expression
        switch(month){
            case "JAN","FEB","MAR" -> System.out.println("first quarter");
            case "APR","MAY","JUN" ->System.out.println("second quarter");
            case "JUL","AUG","SEP" ->System.out.println("third quarter");
            case "OCT","NOV","DEC" ->System.out.println("fourth quarter");
            default -> System.out.println("unknown quarter");
        };
    }
}
