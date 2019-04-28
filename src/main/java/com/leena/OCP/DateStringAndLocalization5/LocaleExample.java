package com.leena.OCP.DateStringAndLocalization5;

import java.util.Locale;

public class LocaleExample {


    public static void main(String[] arg) {

        Locale locale = Locale.getDefault();

        System.out.println(locale);

        System.out.println();

        System.out.println(Locale.GERMAN); // de
        System.out.println(Locale.GERMANY); // de_DE

        System.out.println();

        System.out.println(new Locale("fr")); // fr
        System.out.println(new Locale("hi", "IN")); // hi_IN

        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();


        System.out.println();

        System.out.println(l1+"\n"+l2);



    }
 }
