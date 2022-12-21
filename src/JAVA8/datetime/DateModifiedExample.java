package JAVA8.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

/**
 * local date is imutiable class so if we dont assign it its value will remain same
 */
public class DateModifiedExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        //4 days from now
        System.out.println("localDate.plusDays(4) = " + localDate.plusDays(4));
        //it is an immutable class
        System.out.println("localDate = " + localDate);

        //back 2 month from now
        System.out.println("localDate.minusMonths(2) = " + localDate.minusMonths(2));
        //plus 3 years
        System.out.println("localDate.plusYears(3) = " + localDate.plusYears(3));
        //with specific year
        System.out.println("localDate.withYear(2035) = " + localDate.withYear(2035));
        //specific year using Chronofield
        System.out.println("localDate.with(ChronoField.YEAR,2000) = " + localDate.with(ChronoField.YEAR,2000));
        //using temperoladjusters
        System.out.println("localDate.with(TemporalAdjusters.lastDayOfMonth()) = " + localDate.with(TemporalAdjusters.lastDayOfMonth()));
    }
}
