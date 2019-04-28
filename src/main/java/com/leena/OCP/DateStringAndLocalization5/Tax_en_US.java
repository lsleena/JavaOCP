package com.leena.OCP.DateStringAndLocalization5;

import java.util.*;

public class Tax_en_US extends ListResourceBundle {
    protected Object[][] getContents() {
        return new Object[][]{{"tax", new UsTaxCode()}};
    }

    public static void main(String[] args) {
      //  ResourceBundle rb = ResourceBundle.getBundle(
        //        "resourcebundles.Tax", Locale.US);
        //System.out.println(rb.getObject("tax"));


        Locale us = new Locale("en", "US");
        ResourceBundle rb1 = ResourceBundle.getBundle("Zoo", us);
        Set<String> keys = rb1.keySet();
        keys.stream().map(k -> k + " " + rb1.getString(k))
                .forEach(System.out::println);
    }

    private class UsTaxCode {
    }
}