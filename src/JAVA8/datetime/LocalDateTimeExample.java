package JAVA8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        //of
        localDateTime = LocalDateTime.of(2020, 1, 26, 12, 12);
        System.out.println("localDateTime = " + localDateTime);

        localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.NOON);
        System.out.println("localDateTime = " + localDateTime);
        localDateTime = LocalDateTime.now();

        System.out.println("------------------------");
        //get methods
        System.out.println("localDateTime.getHour() = " + localDateTime.getHour());
        System.out.println("localDateTime.getMinute() = " + localDateTime.getMinute());
        System.out.println("localDateTime.getYear() = " + localDateTime.getYear());
        System.out.println("localDateTime.getDayOfWeek() = " + localDateTime.getDayOfWeek());

        System.out.println("localDateTime.get(ChronoField.MONTH_OF_YEAR) = " + localDateTime.get(ChronoField.MONTH_OF_YEAR));

        //Modifiing Example
        System.out.println("localDateTime.plusDays(3) = " + localDateTime.plusDays(3));
        System.out.println("localDateTime.minusHours(3) = " + localDateTime.minusHours(3));
        System.out.println("localDateTime.with(ChronoField.HOUR_OF_DAY, 3) = " + localDateTime.with(ChronoField.HOUR_OF_DAY, 3));

    }
}
