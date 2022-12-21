package JAVA8.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneExample {
    public static void main(String[] args) {
        //get all zone ids available
        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        System.out.println("--------------------");
        System.out.println("Europe/Jersey :date Time = " + ZonedDateTime.now(ZoneId.of("Europe/Jersey")));

        System.out.println("--------------------");
        //add zone id to time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        ZonedDateTime zonedDateTime =localDateTime.atZone(ZoneId.of("Australia/Melbourne"));
        System.out.println("zonedDateTime = " + zonedDateTime);
        //add zoneOffset
        System.out.println("localDateTime.atZone(ZoneOffset.ofHours(-10)) = " + localDateTime.atZone(ZoneOffset.ofHours(-10)));

    }
}
