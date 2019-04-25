package com.leena.OCP.DateStringAndLocalization5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class PeriodExample {
    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period1) { // uses the generic period

        LocalDate upTo = start;
        while (upTo.isBefore(end))
        {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period1); // adds the period
        }
    }

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2018, Month.APRIL, 30);

        LocalDate localDate1 = LocalDate.of(2019, 04, 9);

        Period period = Period.ofMonths(3);

        Period annually = Period.ofYears(1); // every 1 year
        Period quarterly = Period.ofMonths(3); // every 3 months
        Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
        Period everyOtherDay = Period.ofDays(2); // every 2 days
        Period everyYearAndAWeek = Period.of(1, 0, 7);

        System.out.println(annually + "\n"+ quarterly);
        System.out.println(period);
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period1 = Period.ofMonths(1); // create a period
        performAnimalEnrichment(start, end, period1);
    }


}