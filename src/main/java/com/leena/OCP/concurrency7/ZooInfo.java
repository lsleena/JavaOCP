package com.leena.OCP.concurrency7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZooInfo {

    public static void main(String[] args) {

        ExecutorService service = null;

        try {

            service = Executors.newSingleThreadExecutor();

            System.out.println("begin");
            service.execute(() -> System.out.println("Zoo inventory"));
            service.execute(() -> {
            for (int i = 0; i < 3; i++)
                System.out.println("Prining food " + i);
        });
            service.execute(() -> System.out.println("Prining zoo inventory")) ;
            System.out.println("end");

        } finally {

            if (service != null) service.shutdown();
        }
    }
}
