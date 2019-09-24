package com.leena.OCPByKathy.Thread1030;

public class TestThreads {

    public static void main(String[] args) {

    MyThread myThread = new MyThread();
    myThread.start();
    myThread.run("\n\nIts Overloaded\n\n");

    MyRunnable runnable = new MyRunnable();

    runnable.run();


    }
}