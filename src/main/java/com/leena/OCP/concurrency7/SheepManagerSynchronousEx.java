package com.leena.OCP.concurrency7;

/*
Thread Pool and synchronising data access
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManagerSynchronousEx {

    private int sheepCount = 0;

    private void incrementAndReport () {

        System.out.println(++sheepCount + " ");
    }

    public static void main(String[] args) {

        ExecutorService service = null;
        try {

            service = Executors.newFixedThreadPool(20);

            SheepManagerSynchronousEx manager = new SheepManagerSynchronousEx();

            for (int i=0; i<10; i++)
            {
                service.submit(() -> manager.incrementAndReport());
            }
        }
        finally {

            if(service != null) service.shutdown();
        }
    }


}
