package com.leena.OCPByKathy.Thread1030.multipleThreads;

public class ManyNames {

    public static void main(String[] args) {

        Runnable nr = () -> {

            for (int x = 0; x <= 3; x++) {

                System.out.println("Run By " +
                        Thread.currentThread().getName() + " x is " + x);

            }
            System.out.println("***********************");

            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        };

        Thread one = new Thread(nr);
        Thread two = new Thread(nr);
        Thread three = new Thread(nr);

        one.setName("Leena");
        one.start();

        two.setName("Navya");
        two.start();

        three.setName("Jiya");
        three.start();
    }
}
