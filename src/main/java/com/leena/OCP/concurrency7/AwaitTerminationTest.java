package com.leena.OCP.concurrency7;

import java.util.concurrent.*;

public class AwaitTerminationTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = null;

        try {

            service = Executors.newSingleThreadExecutor();

            Future<Integer> result = service.submit(() -> 30+11);

            // We can now retrieve and print the output of the Callable results, 41 in this example.

            System.out.println(result.get());

        } finally {

            if (service != null) service.shutdown();

        }


        if (service != null) {


            if (service.isTerminated())
                System.out.println("All tasks  finished");
            else
                System.out.println("Atleast one task is still running");


            service.awaitTermination(1, TimeUnit.MINUTES);

        }

        if (service != null) {

            service.awaitTermination(1, TimeUnit.MINUTES);

            if (service.isTerminated())
                System.out.println("Tasks are finished");
            else
                System.out.println("Atleast one task is still running");
        }


    }
}
