package com.leena.OCP.DateStringAndLocalization5;

import java.time.*;

public class ZonedTimeExample {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2016, Month.MARCH,13);

        LocalTime  localTime = LocalTime.of(1,30);

        ZoneId zoneId = ZoneId.of("US/Eastern");

        ZonedDateTime dateTime = ZonedDateTime.of(date,localTime,zoneId);

        System.out.println("\n" + dateTime + "\n");

        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime); // 2016–03–13T03:30–04:00[US/Eastern]




    }
}
