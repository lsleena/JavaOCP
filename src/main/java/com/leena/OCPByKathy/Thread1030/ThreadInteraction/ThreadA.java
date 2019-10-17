package com.leena.OCPByKathy.Thread1030.ThreadInteraction;
public class ThreadA {
    public static void main(String[] args) {

        ThreadB threadB = new ThreadB();
        threadB.start();

        System.out.println("Starting Thread A");

        synchronized (threadB) {
            System.out.println("Inside Thread A Synchronized block");

            try {
                System.out.println("Waiting for threadB to complete....");
                threadB.wait();
            } catch (InterruptedException e) {}

            System.out.println("Total is :" + threadB.total);
        }
    }
}


class ThreadB extends Thread {

    int total;

    public void run() {

        System.out.println("Starting Thread B");

        synchronized (this) {
            System.out.println("Inside Thread B Synchronized block");

            for (int i = 0; i < 100;i++)
               total += i;

            notify();
        }
    }
}