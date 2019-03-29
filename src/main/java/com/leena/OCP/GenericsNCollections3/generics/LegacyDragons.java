package com.leena.OCP.GenericsNCollections3.generics;

import java.util.*;


/*

Legacy code
 */

class Dragon {}

class Unicorn {}


public class LegacyDragons {

    private static void printDragons(List<Dragon> dragons) {

        for (Dragon dragon : dragons){ //.Unicorn cannot be cast to com.leena.OCP.GenericsNCollections3.generics.Dragon

            System.out.println(dragon);
        }
    }

    public static void main(String[] args) {

     List unicorns = new ArrayList();

     unicorns.add(new Unicorn());

     printDragons(unicorns);
    }
}
