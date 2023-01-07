package pl.camp.it.daty;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Date date = new Date();
        //System.out.println(date);

        LocalDate localDate = LocalDate.of(2020, 10, 15);
        LocalDate currentDate = LocalDate.now();

        System.out.println(localDate);
        System.out.println(currentDate);


        LocalTime localTime = LocalTime.of(15, 30, 15);
        LocalTime currentTime = LocalTime.now();

        System.out.println(localTime);
        System.out.println(currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
        LocalDateTime localDateTime = LocalDateTime.of(2022, 3, 14, 18, 44, 45);
        System.out.println(localDateTime);

        LocalDateTime localDateTime2 = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime2);

        ZoneId zone = ZoneId.of("UTC");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime2, zone);

        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTime2 =
                ZonedDateTime.of(2023, 1, 7,
                        15, 24, 55, 0,
                        ZoneId.of("Asia/Tokyo"));

        ZonedDateTime currentZonedDateTime = ZonedDateTime.now();

        Instant i1 = zonedDateTime2.toInstant();
        Instant i2 = currentZonedDateTime.toInstant();

        Duration przedzialCzasu = Duration.between(i1, i2);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(przedzialCzasu.toHours());

        LocalDateTime localDateTime3 = LocalDateTime.now();
        System.out.println(localDateTime3);
        LocalDateTime dodanyCzas = localDateTime3.plusDays(100);

        System.out.println(dodanyCzas);

        String data = "07/07-2020";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM-yyyy");

        LocalDate ld1 = LocalDate.parse(data, formatter);

        System.out.println(ld1);

        String dataZObiektu = ld1.format(formatter);
        System.out.println(dataZObiektu);

    }
}
