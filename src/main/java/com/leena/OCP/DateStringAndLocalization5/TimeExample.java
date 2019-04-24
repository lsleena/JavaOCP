package com.leena.OCP.DateStringAndLocalization5;


import com.sun.corba.se.impl.protocol.giopmsgheaders.LocateReplyMessage_1_0;

import java.time.*;

public class TimeExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2012, Month.JANUARY, 12);

        Month month = Month.JANUARY;

        LocalTime localTime1 = LocalTime.of(12,12);

        System.out.println(localTime1);

        LocalTime localTime2 = LocalTime.of(1,2,2);
        System.out.println(localTime2);


        LocalTime localTime3 = LocalTime.of(1,2,3,4);
        System.out.println(localTime3);




        System.out.println(month);
        System.out.println(localDate.getMonth());

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
    }
}
