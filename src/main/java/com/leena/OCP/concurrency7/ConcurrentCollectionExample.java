package com.leena.OCP.concurrency7;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentCollectionExample {

 /*

  private Map<String, Object> foodData = new HashMap<String, Object>();

    public synchronized void put(String key, Object value) {

        foodData.put(key, value);
    }


     public synchronized Object get(String key) {

        return foodData.get(key);
    }
   */

    private Map<String,Object> foodData = new ConcurrentHashMap<String,Object>();

    public  void put(String key, Object value) {

        foodData.put(key, value);
    }

    public  Object get(String key) {

        return foodData.get(key);
    }

    public static void main(String[] args) {

        ConcurrentCollectionExample example = new ConcurrentCollectionExample();

        example.put("name", 1);

        System.out.println(example.get("name"));


        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Leena",6);
        map.put("JIya",2);
        System.out.println(map.get("Leena"));

        Queue<String> queue = new ConcurrentLinkedQueue();

        queue.offer("Leena");
        System.out.println("Peek: "+queue.peek());
        System.out.println("Poll : "+queue.poll());

        System.out.println(queue.peek());
        queue.offer("Lna");

        System.out.println(queue.offer("HI")+ " \n" + queue.peek());
        System.out.println(queue.offer("***Leena")+ " \n" + queue.peek());

        Deque<Integer> deque = new ConcurrentLinkedDeque<>();
        deque.offer(45);

        deque.push(67);
        deque.push(90);
//        System.out.println(deque.getFirst());
        System.out.println(deque.peek());
        System.out.println(deque.poll());
        System.out.println(deque.peek());
        System.out.println(deque.pop());
        System.out.println(deque.peek());
        System.out.println(deque);

    }
}
/*
public class ZooManager {

private Map<String,Object> foodData = new ConcurrentHashMap<String,Object>();

public void put(String key, String value) {
foodData.put(key, value);
}

public Object get(String key) {
return foodData.get(key);
}

}
 */