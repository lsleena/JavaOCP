package com.leena.OCP.DateStringAndLocalization5;

import java.text.*;
import java.util.*;

public class FOrmatNumbers {
    public static void main(String[] args) throws ParseException {

        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;
        NumberFormat us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth));
        NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(g.format(attendeesPerMonth));
        NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth));


        NumberFormat num = NumberFormat.getInstance(Locale.ITALIAN);
        NumberFormat en = NumberFormat.getInstance(Locale.US);

        String s = "40.99";
        System.out.println();
        System.out.println(num.parse(s));
        System.out.println(en.parse(s));


    }
}