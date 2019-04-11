package com.leena.OCP.concurrency7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AddData {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = null;

        try {

            service = Executors.newSingleThreadExecutor();

            Future<Integer> result = service.submit(() -> 30+11);

            System.out.println(result.get());

        } finally {

            if (service != null) service.shutdown();

        }

    }
}
