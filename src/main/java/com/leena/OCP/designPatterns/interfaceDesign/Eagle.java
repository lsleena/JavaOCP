package com.leena.OCP.designPatterns.interfaceDesign;

interface Fly {

    public int getWingsSpan() throws Exception;

    public static final int MAx_SPEED = 100;

    public default void land() {

        System.out.println("Animal is Landing");
    }

    public static double calculateSpeed(float distance, double time) {

        return distance / time;
    }

}


public class Eagle implements Fly {

    public int getWingsSpan() {

        return 15;
    }

    public void land() {

        System.out.println("Eagle is fast");
    }

    public static double calculateSpeed(float distance, double time) {

        return distance / time;
    }

    public static void main(String[] args) {

        Eagle eagle = new Eagle();
        System.out.println(Fly.calculateSpeed(9, 8.9));
        System.out.println("\nFly.MAx_SPEED");

    }
}

