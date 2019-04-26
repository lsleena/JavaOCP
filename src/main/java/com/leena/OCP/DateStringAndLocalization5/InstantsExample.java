package com.leena.OCP.DateStringAndLocalization5;

import com.sun.jmx.snmp.SnmpPduTrap;

import java.time.*;

public class InstantsExample {

    public static void main(String[] arg) {

        Instant now = Instant.now();

        System.out.println(now);

        Instant later = Instant.now();

        System.out.println(later);

        Duration duration = Duration.between(now,later);

        System.out.println(duration.toMillis());

        LocalDate date = LocalDate.of(2015, 5, 25);
        LocalTime time = LocalTime.of(11, 55, 00);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
        Instant instant = zonedDateTime.toInstant(); // 2015–05–25T15:55:00Z
        System.out.println(zonedDateTime); // 2015–05–25T11:55–04:00[US/Eastern]
        System.out.println(instant); // 2015–05–25T15:55:00Z

    }
}