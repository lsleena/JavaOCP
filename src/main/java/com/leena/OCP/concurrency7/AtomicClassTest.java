package com.leena.OCP.concurrency7;

/*
Thread Pool and synchronising data access
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClassTest {

    private int sheepCount = 0;

    private void incrementAndReport () {

        synchronized (this) {
            System.out.println((++sheepCount) + " * ");
        }
    }

    private AtomicInteger sheepCount1 = new AtomicInteger(11);

    private void incrementAndReport1() {

        System.out.print(sheepCount1.incrementAndGet()+" ");
    }

    public static void main(String[] args) {

        ExecutorService service = null;
        try {

            service = Executors.newFixedThreadPool(10);

            ExecutorService service1 = Executors.newFixedThreadPool(10);


            AtomicClassTest manager = new AtomicClassTest();

            AtomicClassTest manager1 = new AtomicClassTest();


            for (int i=0; i<10; i++)
            {
                synchronized (manager) {
                    service.submit(() -> manager.incrementAndReport());
                }
            }
            for (int j=10; j<20; j++)
            {
                synchronized (manager1) {
                    service1.submit(() -> manager1.incrementAndReport1());
                }
            }
        }
        finally {

            if(service != null) service.shutdown();
        }
    }


}


