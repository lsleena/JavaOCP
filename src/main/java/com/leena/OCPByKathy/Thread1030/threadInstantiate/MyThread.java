package com.leena.OCPByKathy.Thread1030.threadInstantiate;

public class MyThread extends Thread{

    public void run() {

        System.out.println("Running important job of MyThread");
    }

    public void run(String s) {

        System.out.println("Running Overloaded job of MyThread" + s );
    }
}
