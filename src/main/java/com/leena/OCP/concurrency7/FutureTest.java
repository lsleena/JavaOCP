package com.leena.OCP.concurrency7;

import java.util.concurrent.*;

public class FutureTest {

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService service = null;
        System.out.println(FutureTest.counter);

        try {

            service = Executors.newSingleThreadExecutor();

            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 500; i++) FutureTest.counter++;
            });

            result.get(10, TimeUnit.SECONDS);
            System.out.println("Reached");

        } catch (TimeoutException e) {

            System.out.println("Not reached in Time!!");
        } finally {

            if (service != null) service.shutdown();
        }

      //  Future<?> future = service.submit( () -> System.out.println("Inside submit"));
    }
}

@FunctionalInterface
interface Callable<V> {

    V call() throws Exception;
}

