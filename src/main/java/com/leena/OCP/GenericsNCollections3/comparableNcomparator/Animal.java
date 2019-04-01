package com.leena.OCP.GenericsNCollections3.comparableNcomparator;


public class Animal implements Comparable<Animal> {

    private int id;

    public int compareTo(Animal a) {

        /*
        Output of below return is :
            a1 == a2: 2
            a1 == a1: 0
            a2 == a1: -2
            a2 == a2: 0

         */
        return a.id - id;


        /*
        return id - a.id;
             a1 == a2: -2
             a1 == a1: 0
             a2 == a1: 2
             a2 == a2: 0
        */
    }

    public static void main(String args[]) {

        Animal a1 = new Animal();
        Animal a2 = new Animal();

        a1.id = 5;
        a2.id = 7;

        System.out.println("a1 == a2: " + a1.compareTo(a2));
        System.out.println("a1 == a1: " + a1.compareTo(a1));
        System.out.println("a2 == a1: " + a2.compareTo(a1));
        System.out.println("a2 == a2: " + a2.compareTo(a2));

        LegacyDuck duck = new LegacyDuck();
        duck.name = "Jiya";
        LegacyDuck duck1 = new LegacyDuck();
        duck1.name = "JIYA"; // compare with Uppercase first
        System.out.println("Inaside Legacy code: \n");
        System.out.println(duck.compareTo(duck1));
        System.out.println(duck1.compareTo(duck1));
        System.out.println(duck.compareTo(duck));
        System.out.println(duck1.compareTo(duck) + "  " + duck.equals(duck1));


    }
}

class LegacyDuck implements Comparable {

     String name;

    @Override
    public int compareTo(Object obj) {

        LegacyDuck d = (LegacyDuck) obj; //cast requires because its a legacy code where no generics has been used
        return name.compareTo(d.name);
    }
}
