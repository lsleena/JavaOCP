package com.leena.OCP.DateStringAndLocalization5;

import java.time.*;

public class ZonedTimeExample {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2016, Month.MARCH,13);

        LocalTime  localTime = LocalTime.of(1,30);

        ZoneId zoneId = ZoneId.of("US/Eastern");

        ZonedDateTime dateTime1 = ZonedDateTime.of(date,localTime,zoneId);

        System.out.println("\n" + dateTime1 + "\n");

        dateTime1 = dateTime1.plusHours(1);
        System.out.println(dateTime1); // 2016–03–13T03:30–04:00[US/Eastern]

        LocalDate date1 = LocalDate.of(2016, Month.NOVEMBER, 6);
        LocalTime time = LocalTime.of(1, 30);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime = ZonedDateTime.of(date1, time, zone);
        System.out.println(dateTime); // 2016–11–06T01:30–04:00[US/Eastern]
        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime); // 2016–11–06T01:30–05:00[US/Eastern]
        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime); // 2016–11–06T02:30–05:00[US/Eastern]


        LocalDate dte = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime tme = LocalTime.of(2, 30);
        ZoneId zne = ZoneId.of("US/Eastern");
        ZonedDateTime dateTime2 = ZonedDateTime.of(dte, tme, zne);
        System.out.println();
        System.out.println(dateTime2); // 2016–03–13T03:30–04:00[US/Eastern]

    }
}
