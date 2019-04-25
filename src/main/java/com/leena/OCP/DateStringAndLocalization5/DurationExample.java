package com.leena.OCP.DateStringAndLocalization5;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationExample {

    public static void main(String[] arg) {

        Duration duration = Duration.ofDays(24);

        Duration duration1 = Duration.ofSeconds(3600);

        System.out.println(duration1);

        System.out.println(duration);

        Duration daily = Duration.of(1, ChronoUnit.DAYS);


    }
}
