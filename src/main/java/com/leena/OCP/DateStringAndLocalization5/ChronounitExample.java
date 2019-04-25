package com.leena.OCP.DateStringAndLocalization5;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class ChronounitExample {

    public static void main(String[] args) {

        LocalTime one = LocalTime.of(5, 15);
        LocalTime two = LocalTime.of(6, 30);
        LocalDate date = LocalDate.of(2016, 1, 20);

        LocalDate date1 = LocalDate.of(2017, 1, 20);

        System.out.println(ChronoUnit.HOURS.between(one, two)); // 1
        System.out.println(ChronoUnit.MINUTES.between(one, two)); // 75

        System.out.println(ChronoUnit.DAYS.between(date, date1)); // DateTimeException

      //  System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException


        LocalDate date2 = LocalDate.of(2013,1,20);

        LocalTime time = LocalTime.of(23,4);

        LocalDateTime dateTime = LocalDateTime.of(date2, time);

        Duration duration = Duration.ofHours(2);

        System.out.println(dateTime);

        System.out.println(dateTime.plus(duration));

     //   System.out.println(date2.plus(duration));

        System.out.println(time.plus(duration));

        LocalDate date3 = LocalDate.of(2015, 5, 25);
        Period period = Period.ofDays(1);
        Duration days = Duration.ofDays(1);
        System.out.println(date3.plus(period)); // 2015–05–26

        System.out.println(days.toString()); // Unsupported unit: Seconds

    System.out.println(date3.plus(days)); // Unsupported unit: Seconds

    }
}
