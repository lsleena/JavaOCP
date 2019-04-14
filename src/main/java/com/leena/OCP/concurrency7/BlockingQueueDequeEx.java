package com.leena.OCP.concurrency7;

import java.util.concurrent.*;

public class BlockingQueueDequeEx {

    public static void main(String[] args) {

        try {


            BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

            blockingQueue.offer(23);
            blockingQueue.offer(4, 4, TimeUnit.MINUTES);
            blockingQueue.offer(47,100,TimeUnit.MICROSECONDS);
            blockingQueue.offer(99);

            System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
            System.out.println(blockingQueue);


            BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();
            blockingDeque.offer(93);
            blockingDeque.offerFirst(44, 4, TimeUnit.MINUTES);
            blockingDeque.offerLast(77,100,TimeUnit.MICROSECONDS);
            blockingDeque.offer(19);

            System.out.println(blockingDeque.poll());
            System.out.println(blockingDeque.pollFirst(2,TimeUnit.MICROSECONDS));
            System.out.println(blockingDeque.pollLast(1, TimeUnit.SECONDS));


        } catch (InterruptedException e) {
        }
    }
}
