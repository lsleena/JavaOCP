package com.leena.OCPByKathy.Thread;

public class MyRunnable implements Runnable{


    @Override
    public void run() {
        System.out.println("I am in Runnable implementation");
    }

    // Using lambda function

    Runnable r = () -> System.out.println("I am in Runnable implementation");
}
