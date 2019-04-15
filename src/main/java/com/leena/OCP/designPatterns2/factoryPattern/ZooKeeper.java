package com.leena.OCP.designPatterns2.factoryPattern;


import java.util.concurrent.ConcurrentSkipListMap;

abstract class Food {

    private int quantity;

    public Food(int quantity) {

        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract void consumed();
}

class Hay extends Food {

    public Hay(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Hay eaten: " + getQuantity());
    }
}

class Pellets extends Food {


    public Pellets(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Pellets eaten: " + getQuantity());

    }
}

class Fish extends Food {

    public Fish(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Fish eaten: " + getQuantity());

    }
}

public class ZooKeeper {

    public static void main(String[] args) {

        final Food food = FoodFactory.getFood("polar bear");

        food.consumed();

    }
}
