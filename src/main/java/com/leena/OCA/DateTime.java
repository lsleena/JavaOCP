package com.leena.OCA;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.*;

public class DateTime {

    public static void main(String[] args) {


        LocalTime time = LocalTime.of(6, 15); // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200);

        LocalTime time1 = LocalTime.of(6, 15);
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);

        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date);
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusWeeks(1);

        System.out.println(date);
        date = date.plusMonths(1);
        System.out.println(date);
        date = date.plusYears(5);
        System.out.println(date);

        LocalDate dat = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime tim = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date2, tim)
                .minusDays(1).minusHours(10).minusSeconds(30);

        System.out.println(dateTime);

        Period annually = Period.ofYears(1);
        Period quarterly = Period.ofMonths(3);

        Period everyThreeWeeks = Period.ofWeeks(3);
        Period everyOtherDay = Period.ofDays(2);
        Period everyYearAndAWeek = Period.of(1, 0, 7);

        date = LocalDate.of(2015, 1, 20);
        time = LocalTime.of(6, 15);
        dateTime = LocalDateTime.of(date, time);
        Period period = Period.ofMonths(1);
        System.out.println(date.plus(period));
        System.out.println(dateTime.plus(period));
        System.out.println(time.plus(period)); // UnsupportedTemporalTypeException
    }
}