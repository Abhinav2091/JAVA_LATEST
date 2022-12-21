package JAVA8.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * useful for generating timestamp for machine time
 */
public class InstantExample {
    public static void main(String[] args) {
        Instant instant =Instant.now();
        System.out.println("instant = " + instant);
        System.out.println("instant.getNano() = " + instant.getNano());

        Instant instant1 = Instant.now().plusSeconds(3600);
        Duration duration =Duration.between(instant,instant1);
        System.out.println("duration.toSeconds() = " + duration.toSeconds());

        //creating local datetime using instant
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println("localDateTime = " + localDateTime);

    }
}
