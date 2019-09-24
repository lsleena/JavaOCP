package com.leena.OCP;

public class WhizLabRunnable implements Runnable{
    public static void main(String[] args) {

    WhizLabRunnable test1 = new WhizLabRunnable();

    Thread t = new Thread(test1);

    t.setName("a1");
    t.start();

        System.out.println(Thread.currentThread().getName()+ "");

        try {
            t.join();

        }catch(Exception e)
        {
            System.out.println(Thread.currentThread().getName());

        }

    }

    @Override
    public void run() {
        //System.out.println("ENtering runnable run method");
        System.out.println(Thread.currentThread().getName()+"");
      //  System.out.println("Exiting runnable run method");

    }
}
