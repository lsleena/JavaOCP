package com.leena.OCP.DateStringAndLocalization5;
import java.time.*;

public class PeriodDEmo {

    public static void main(String[] args) {

         LocalDate date = LocalDate.of(2015, 1, 20);
         LocalTime time = LocalTime.of(6, 15);
         LocalDateTime dateTime = LocalDateTime.of(date, time);
         Period period = Period.ofMonths(1);
         System.out.println(date.plus(period)); // 2015–02–20
         System.out.println(dateTime.plus(period)); // 2015–02–20T06:15
         System.out.println(Period.ofWeeks(5));
         System.out.println(time.plus(period)); // Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Months
    }
}
