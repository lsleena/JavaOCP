package com.leena.OCP.designPatterns2.factoryPattern;

public class FoodFactory {

    public static Food getFood(String animalName) {

        switch(animalName) {

            case "zebra": return new Hay(100);
            case "rabbit": return new Pellets(5);
            case "goat": return new Pellets(40);
            case "polar bear": return new Fish(23);

        }
        throw new UnsupportedOperationException("Unsupported Animal: " + animalName);

    }
}
