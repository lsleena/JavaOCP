package com.leena.OCPByKathy.Thread1030.threadInstantiate;

import com.leena.OCPByKathy.Thread1030.threadInstantiate.MyThread;

public class TestThreads {

    public static void main(String[] args) {

    MyThread myThread = new MyThread();
    myThread.start();
    myThread.run("\n\nIts Overloaded\n\n");


        Runnable r = () -> {
            for (int x = 0; x <= 6; x++)
                System.out.println("I am in Runnable implementation  " + x);
            System.out.println("\n\n");

        };

        Thread foo = new Thread(r);
        Thread bar = new Thread(r);

//        r.run();

        foo.start();

        bar.start();

    }
}