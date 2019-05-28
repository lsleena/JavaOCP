package com.leena.OCP.DateStringAndLocalization5;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationExample {

    public static void main(String[] arg) {

        Duration duration = Duration.ofDays(24);

        System.out.println(duration);

        Duration duration1 = Duration.ofSeconds(3600);


        System.out.println(duration1);

        System.out.println(duration);

        System.out.println(Duration.ofDays(2));

        System.out.println(Duration.ofDays(365));

        Duration daly = Duration.of(1, ChronoUnit.DAYS);


        Duration daily = Duration.of(1, ChronoUnit.DAYS);
        System.out.println(daily);

        Duration hourly = Duration.of(1, ChronoUnit.HOURS);
        System.out.println(hourly);
        Duration everyMinute = Duration.of(1, ChronoUnit.MINUTES);
        System.out.println(everyMinute);
        Duration everyTenSeconds = Duration.of(10, ChronoUnit.SECONDS);
        System.out.println(everyTenSeconds);


        Duration everyMilli = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println(everyMilli);
        Duration everyNano = Duration.of(1, ChronoUnit.NANOS);
        System.out.println(everyNano);


        LocalDate date = LocalDate.of(2015, 5, 25);
        Period period = Period.ofDays(1);
        Duration days = Duration.ofDays(1);
        System.out.println(days);
        System.out.println(date.plus(period)); // 2015–05–26


        LocalDate d = LocalDate.of(2015, 5, 25);
        LocalTime time = LocalTime.of(11, 55, 00);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(d, time, zone);
        Instant instant = zonedDateTime.toInstant(); // 2015–05–25T15:55:00Z        System.out.println(instant); // 2015–05–25T15:55:00Z
        System.out.println(date.plus(days)); // Unsupported unit: Seconds




    }
}
