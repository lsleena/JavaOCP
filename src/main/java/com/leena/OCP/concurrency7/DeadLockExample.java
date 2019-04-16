package com.leena.OCP.concurrency7;

import java.util.concurrent.*;


class Food {}

class Water {}

public class DeadLockExample {

    public void eatAndDrink(Food food, Water water) {

        synchronized (food){

            System.out.println("GOt Food");

            move();

            synchronized (water) {

                System.out.println("Got Water");
            }
        }
    }


    public void drinkAndEat(Food food, Water water) {

        synchronized (water){
            System.out.println("GOt water");

            move();

            synchronized (food) {

                System.out.println("Got food");
            }
        }
    }

    private void move() {

        try {
            Thread.sleep(100);

        } catch (InterruptedException e) {

        }
    }


    public static void main(String[] args) {

        //create participants and resources

        DeadLockExample foxy = new DeadLockExample();

        DeadLockExample tails = new DeadLockExample();

        Water water = new Water();

        Food food = new Food();

        //process data

        ExecutorService service = null;
        try {

            service = Executors.newScheduledThreadPool(10);
            service.submit(() -> foxy.eatAndDrink(food, water));
            service.submit(() -> tails.drinkAndEat(food, water));

        } finally {

            if (service != null) service.shutdown();
        }

    }
}