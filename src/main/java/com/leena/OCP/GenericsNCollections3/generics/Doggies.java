package com.leena.OCP.GenericsNCollections3.generics;

import java.util.*;

public class Doggies {

    List<String> names ;

    public Doggies() {

        names = new ArrayList<>(); // matches static variable declaration
    }

    public void bark() {

        ArrayList<String> list ;
        list = new ArrayList<>(); // matches local variable declaration
    }

    public static void printNames(List list) {

        for(int i = 0; i < list.size(); i++) {
         //   String name = (String) list.get(i); //Exception in thread "main" java.lang.ClassCastException: java.lang.StringBuilder cannot be cast to java.lang.String

            System.out.println(list.get(i));
        }

    }

    public static void main(String[] args) {

        List names = new ArrayList();
        names.add(new StringBuilder(("Hello")));

        List<String> name = new ArrayList<>();

        name.add("Leena");
       // name.add(new StringBuilder("Leena"));

        printNames(names);
    }
}

