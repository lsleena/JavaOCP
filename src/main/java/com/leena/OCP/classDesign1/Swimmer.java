package com.leena.OCP.classDesign1;

public class Swimmer {

    enum AnimalClasses {
        MAMMAL{
            public boolean hasFins() { return true; }}, FISH {
            public boolean hasFins() { return true; }};
   //     BIRD, REPTILE, AMPHIBIAN, INVERTEBRATE;
        public abstract boolean hasFins();
    }

    public static void main(String[] args) {

        System.out.println(AnimalClasses.FISH);
        System.out.println(AnimalClasses.FISH.ordinal());
        System.out.println(AnimalClasses.FISH.hasFins());
    //    System.out.println(AnimalClasses.BIRD.hasFins());
    }
}