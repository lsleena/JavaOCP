package com.leena.OCP.designPatterns2.singletoneObject;


/*
instantiated the singleton object directly in the
defi nition of the instance reference
 */
public class HayStorage {

    private int quantity = 0;
    private HayStorage() { }

    //Singleton in JAVA
    private static final HayStorage instance = new HayStorage();

    public static HayStorage getInstance() {

        return instance;
    }

    public synchronized void addHay(int amount) {

        quantity += amount;
    }

    public synchronized boolean removeHay(int amount) {

        if (quantity < amount) return false;

        quantity -= amount;
        return true;

    }

    public synchronized int getHayQuantity() {

        return quantity;
    }

}

class LlamaTrainer{

    public boolean feedLlamas(int numberOfLlamas) {

        int amountNeeded = 5 * numberOfLlamas;

        HayStorage hayStorage = HayStorage.getInstance();

        if (hayStorage.getHayQuantity() < amountNeeded) {

            hayStorage.addHay(amountNeeded + 10);
        }
        boolean fed = hayStorage.removeHay(amountNeeded);
        if (fed) System.out.println("Llama have been fed");
        return fed;
    }

    public boolean feedGoats(int numberOfLlamas) {

        int amountNeeded = 5 * numberOfLlamas;

        HayStorage hayStorage = HayStorage.getInstance();

        if (hayStorage.getHayQuantity() < amountNeeded) {

            hayStorage.addHay(amountNeeded + 10);
        }
        boolean fed = hayStorage.removeHay(amountNeeded);
        if (fed) System.out.println("Goats have been fed");
        return fed;
    }

    public static void main(String[] args) {
        LlamaTrainer llamaTrainer = new LlamaTrainer();

        llamaTrainer.feedLlamas(13);
        llamaTrainer.feedGoats(20);

    }

}

