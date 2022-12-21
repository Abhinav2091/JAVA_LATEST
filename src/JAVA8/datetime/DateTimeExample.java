package JAVA8.datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

/**
 * tradional date time was not thread safe so user faces concurrancy problems there
 */
public class DateTimeExample {
    public static void main(String[] args) {
        // by old tradional mannner
        System.out.println("##########################");
        Date dateObject = new Date();
        SimpleDateFormat simpleDateFormatDate = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormatDate.format(dateObject));
        SimpleDateFormat simpleDateFormatTime = new SimpleDateFormat("HH:mm:ss");
        System.out.println(simpleDateFormatTime.format(dateObject));
        System.out.println(Calendar.getInstance().getTime());

        // USING JAVA 8 DATE TIME API
        System.out.println("##########################");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
