package com.leena.OCP.concurrency7;

import java.util.concurrent.*;

/*
1. schedule(Callable<V> callable,
long delay, TimeUnit unit)
2. schedule(Runnable command,
long delay, TimeUnit unit)
3. scheduleAtFixedRate(Runnable
command, long initialDelay,
long period, TimeUnit unit)
4. scheduleAtFixedDelay(Runnable
command, long initialDelay,
long delay, TimeUnit unit)
 */

public class ExecutorSchedularTest {


    public static void main(String[] args){


        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Runnable task1 = () -> System.out.println("Hello Zoo");
        Callable<String> task2 = () -> "Monkey";

        Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
        Future<?> result2 = service.schedule((Runnable) task2, 8, TimeUnit.MINUTES);

        ScheduledExecutorService servie = Executors.newScheduledThreadPool(10);
        Runnable command = null;
        servie.scheduleAtFixedRate(command,3,1,TimeUnit.MINUTES);
    }
}
