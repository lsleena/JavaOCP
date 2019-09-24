package com.leena.OCP.DateStringAndLocalization5;

import java.time.*;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class ZooOpen {

    public static void main(String[] args) {

        Locale ch = new Locale.Builder().setLanguage("zh").setRegion("CN").build();
        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");
        printProperties(us);
        System.out.println();
         printProperties(france);

         Locale l = Locale.CHINA;
        }

       public static void printProperties(Locale locale) {
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
      System.out.println(rb.getString("hello"));
       System.out.println(rb.getString("open"));

        Locale fr = new Locale("fr", "FR");

        Locale us = new Locale("en", "US");
           ResourceBundle rb1 = ResourceBundle.getBundle("Zoo", us);
           Set<String> keys = rb1.keySet();
           keys.stream().map(k -> k + "  ** " + rb1.getString(k))
                   .forEach(System.out::println);
        Properties props = new Properties();
        rb.keySet().stream()
                .forEach(k -> props.put(k, rb.getString(k)));

        ResourceBundle rb2 = ResourceBundle.getBundle("Zoo", fr);
        Set<String> keys1 = rb2.keySet();
        keys1.stream().map(k -> k + "  == " + rb2.getString(k))
                .forEach(System.out::println);
    }
}
