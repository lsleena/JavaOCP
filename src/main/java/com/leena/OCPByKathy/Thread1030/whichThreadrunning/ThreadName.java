package com.leena.OCPByKathy.Thread1030.whichThreadrunning;


public class ThreadName {

    public static void main(String[] args) {

        System.out.println("Run by " +
                Thread.currentThread().getName());


        NameRunnable nameRunnable = new NameRunnable();
        Thread t = new Thread(nameRunnable);
        // t.setName("Leena"); -- Prints Run by Thread-0
        t.start();

    }
}

class NameRunnable implements Runnable {

    public void run() {
        System.out.println("NameRunnable is Running");
        System.out.println("Run by " +
                Thread.currentThread().getName());

    }
}
