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
            System.out.println((++sheepCount) + " ");
        }
    }

    public static void main(String[] args) {

        ExecutorService service = null;
        try {

            service = Executors.newFixedThreadPool(20);

            AtomicClassTest manager = new AtomicClassTest();

            for (int i=0; i<10; i++)
            {
                synchronized (manager) {
                    service.submit(() -> manager.incrementAndReport());
                }
            }
        }
        finally {

            if(service != null) service.shutdown();
        }
    }


}
