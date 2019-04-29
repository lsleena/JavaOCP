package com.leena.OCP.DateStringAndLocalization5;

import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ParseExample {

    public static void main(String[] arg) throws ParseException {

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date.getDayOfWeek()); // MONDAY
        System.out.println(date.getMonth()); // JANUARY
        System.out.println(date.getYear()); // 2020
        System.out.println(date.getDayOfYear()); // 20


        NumberFormat nf = NumberFormat.getInstance();
        String one = "456abc";
        String two = "-2.5165x10";
        String three = "x85.3";
        System.out.println(nf.parse(one)); // 456
        System.out.println(nf.parse(two)); // -2.5165
        //System.out.println(nf.parse(three));// throws ParseException

        LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);

        LocalDateTime localDateTime = LocalDateTime.of(date1,time);
        System.out.println();
        System.out.println(date1.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println();
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println();
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        System.out.println();
        System.out.println(dateTimeFormatter.format(localDateTime));


        System.out.println();
      //  System.out.println(dateTimeFormatter.format(time)); exceptions occured


        DateTimeFormatter shortDateTime =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(localDateTime.format(shortDateTime));
        System.out.println(date1.format(shortDateTime));
        System.out.println(time.format(shortDateTime));

    }
}
