package com.leena.OCP.concurrency7;

import java.util.Deque;
import java.util.Map;
import java.util.Queue;
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

      /*  ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> System.out.println("Hello Zoo");
        Callable<String> task2 = () -> "Monkey";
        Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
    //    Future<?> result2 = service.schedule((Runnable) task2, 8, TimeUnit.MINUTES);
       ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Runnable task1 = () -> System.out.println("Hello Zoo");
        Callable<String> task2 = () -> "Monkey";

        Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
        Future<?> result2 = service.schedule((Runnable) task2, 8, TimeUnit.MINUTES);

        ScheduledExecutorService servie = Executors.newScheduledThreadPool(10);
        Runnable command = null;
        servie.scheduleAtFixedRate(command,3,1,TimeUnit.MINUTES);*/

        Map<String,Integer> map = new ConcurrentHashMap<>();
        map.put("zebra", 52);
        map.put("elephant", 10);
        System.out.println(map.get("elephant"));
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.offer(31);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        Deque<Integer> deque = new ConcurrentLinkedDeque<>();
        deque.offer(10);
        System.out.println("After offer 10  " +deque);

        deque.push(4);
        System.out.println("After push 4    " +deque);

        System.out.println(deque.peek());
        System.out.println("After peek " +deque);

        System.out.println(deque.pop());
        System.out.println("After pop " +deque);

        try {
            BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
            blockingQueue.offer(39);
            blockingQueue.offer(3, 4, TimeUnit.SECONDS);
            System.out.println(blockingQueue);
            System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue);
            System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
// Handle interruption

    }
}}
