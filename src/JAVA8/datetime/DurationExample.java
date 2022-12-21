package JAVA8.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.now().plusDays(2);
        
        //find the duration between two in hours and days
        Duration duration = Duration.between(localDateTime,localDateTime1);
        System.out.println("duration.toHours() = " + duration.toHours());
        System.out.println("duration.toDays() = " + duration.toDays());

        //convert hours to minute
        Duration duration1 =Duration.ofHours(3);
        System.out.println("duration1.toMinutes() = " + duration1.toMinutes());

        //works with LocalTime as well
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 =LocalTime.now().minusHours(3);
        Duration duration2 = Duration.between(localTime,localTime1);
        System.out.println("duration2.toMinutes() = " + duration2.toMinutes());

        //does not works with LocalDate will throw exception
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.now().plusDays(3);
        Duration duration3 = Duration.between(localDate,localDate1);
        System.out.println("duration3.toDays() = " + duration3.toDays());

        
        
    }
}
