package com.leena.OCP.GenericsNCollections3.generics.wildcards;

import java.util.*;

public class UpperBoundWildcard {

    public static double sumOfElements(List<? extends Number> numberList) {

        double num,s = 0.0;


        for (Number n : numberList) {

            System.out.println(n);

            s += n.doubleValue();

        }
        return s;
    }

    public static void printElement(List<Object> list) {

        for (Object element : list) {

            System.out.println(element + "  ");
        }
        System.out.println();

    }

    private void anyFlyer(List<Flyer> flyer) {}

    private void groupOfFlyers(List<? extends Flyer> flyers) {}

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 34, 45);
        List<Number> listDouble = Arrays.asList(1.0, 2.8, 3.9, 3.4, 4.5);


        /*

        Error:(25, 42) java: incompatible types: java.util.List<java.lang.Integer> cannot be converted to java.util.List<java.lang.Number>
        if we have used method as --> public static  double sumOfElements(List<Number> list){ }
        and sumOfElements(list)

         */
        System.out.println("\nInteger sum is: " + sumOfElements(list));

        System.out.println("\nDouble sum is: " + UpperBoundWildcard.sumOfElements(listDouble));

        /*The method printElements(List<Object>) here is not applicable for the arguments (List<Integer>)


         */
        //--------------------------------------------
        /*
        List<Number> n = new ArrayList<Integer>();
        Error:(55, 26) java: incompatible types: java.util.ArrayList<java.lang.Integer> cannot be converted to java.util.List<java.lang.Number>
        */

        List<? extends Bird> birds = new ArrayList<Bird>();
        //birds.add(new Sparrow()); // DOES NOT COMPILE
        //birds.add(new Bird()); // DOES NOT COMPILE


    }
}
 class Bird { }

 class Sparrow extends Bird { }


 interface Flyer { void fly();}

 class HangGlider implements Flyer {

     @Override
     public void fly() {

     }
 }

 class Goose implements Flyer {

     @Override
     public void fly() {

     }
 }