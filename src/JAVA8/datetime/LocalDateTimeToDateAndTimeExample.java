package JAVA8.datetime;

import java.time.LocalDateTime;

public class LocalDateTimeToDateAndTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("localDateTime.toLocalDate() = " + localDateTime.toLocalDate());
        System.out.println("localDateTime.toLocalTime() = " + localDateTime.toLocalTime());
    }
}
