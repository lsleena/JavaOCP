package com.leena.OCP.DateStringAndLocalization5;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class DateFormatterExample {


    public static void main(String[] args) {

    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        SimpleDateFormat sf = new
                SimpleDateFormat("hh:mm");
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2015", f);
        LocalTime time = LocalTime.parse("11:22");
        System.out.println(date); // 2015–01–02
        System.out.println(time); // 11:22        // System.out.println(formatter.format(jan3));
}
}