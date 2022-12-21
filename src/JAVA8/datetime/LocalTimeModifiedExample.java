package JAVA8.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeModifiedExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        //plus 2 hour
        System.out.println("localTime.plusHours(2) = " + localTime.plusHours(2));
        //minus 22 min
        System.out.println("localTime.minusMinutes(2) = " + localTime.minusMinutes(2));
        //minus sec
        System.out.println("localTime.minusSeconds(33) = " + localTime.minusSeconds(33));
        //add nanos
        System.out.println("localTime.plusNanos(34343) = " + localTime.plusNanos(34343));

        //using ChronoUnit
        System.out.println("localTime.minus(3, ChronoUnit.HOURS) = " + localTime.minus(3, ChronoUnit.HOURS));
        
        //midnight time
        System.out.println("localTime.with(LocalTime.MIDNIGHT) = " + localTime.with(LocalTime.MIDNIGHT));
        System.out.println("localTime.with(ChronoField.HOUR_OF_DAY, 4) = " + localTime.with(ChronoField.HOUR_OF_DAY, 4));
    }
}
