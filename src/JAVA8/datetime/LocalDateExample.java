package JAVA8.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        
        //using day of year
        // it will return 67 day of year 2018
        localDate = LocalDate.ofYearDay(2018,67);
        System.out.println("localDate = " + localDate);

        //using specfic day month and year
        localDate = LocalDate.of(2020,10,27);
        System.out.println("localDate = " + localDate);

        localDate = LocalDate.now();

        System.out.println("-------------------------");
        //get methods
        System.out.println("localDate.getMonth() = "+localDate.getMonth());
        System.out.println("localDate.getMonthValue() = "+localDate.getMonthValue());
        System.out.println("localDate.getDayOfWeek() = " + localDate.getDayOfWeek());
        System.out.println("localDate.getDayOfYear() = " + localDate.getDayOfYear());
        System.out.println("localDate.get(ChronoField.MONTH_OF_YEAR) = " + localDate.get(ChronoField.MONTH_OF_YEAR));

    }
}
