package com.leena.OCPByKathy.Thread1030.threadInstantiate;

public class MyRunnable implements Runnable {


    @Override
    public void run() {
        System.out.println("I am in Runnable implementation");
    }

    // Using lambda function

    Runnable r = () -> {
        for (int x = 0; x <= 3; x++)
            System.out.println("I am in Runnable implementation" + x);
    };
}
