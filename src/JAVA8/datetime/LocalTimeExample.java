package JAVA8.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        //with hour and minute
        localTime = LocalTime.of(15, 18);
        System.out.println("localTime = " + localTime);
        //with hour minute and sec
        localTime = LocalTime.of(11, 3, 23);
        System.out.println("localTime = " + localTime);
        //with hour minute sec and nano sec
        localTime = LocalTime.of(10, 2, 59, 33333333);
        System.out.println("localTime = " + localTime);

        localTime = LocalTime.now();

        System.out.println("-------------------------");
        //get method
        System.out.println("localTime.getHour() = " + localTime.getHour());
        System.out.println("localTime.getMinute() = " + localTime.getMinute());
        System.out.println("localTime.getSecond() = " + localTime.getSecond());
        System.out.println("localTime.getNano() = " + localTime.getNano());

        //using ChronoFiled
        System.out.println("localTime.get(ChronoField.SECOND_OF_DAY) = " + localTime.get(ChronoField.SECOND_OF_DAY));
        System.out.println("localTime.get(ChronoField.MINUTE_OF_HOUR) = " + localTime.get(ChronoField.MINUTE_OF_HOUR));

    }
}
