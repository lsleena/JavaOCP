package com.leena.OCP.GenericsNCollections3.Collections.methodExamples;

import java.util.ArrayList;
import java.util.*;

public class App {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        System.out.println(list.add("Hello"));

        System.out.println(list.add("Hello"));

        Set<String> set = new HashSet<>();

        System.out.println();

        System.out.println(set.add("Hello"));

        System.out.println("Duplicate in SET: " + set.add("Hello"));

        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println("\nIs empty: " + birds.isEmpty());

        System.out.println(birds.remove("Cardinal"));
        System.out.println(birds.remove("hawk"));

        birds.clear();
        System.out.println("\nIs empty: " + birds.isEmpty() + "\n");

        Set<Integer> sets = new HashSet<>();
        boolean b1 = sets.add(2);
        boolean b2 = sets.add(66);
        boolean b3 = sets.add(66);

        for (Integer integer: sets) System.out.print(integer + "  ");


        System.out.println("\nTesting NavigableSet:");

        NavigableSet<Integer> set1 =  new TreeSet<>();
        for(int i = 0; i <= 20; i++) set1.add(i);
        System.out.println(set1);

        System.out.println(set1.lower(3));

        System.out.println(set1.floor(5));
        System.out.println(set1.ceiling(10));
        System.out.println(set1.higher(16));





        System.out.println("\nTesting Queue:\n");

        Queue<Integer> queue = new ArrayDeque<>();

        System.out.println(queue.offer(10) + "  Queue:  " + queue);

        System.out.println(queue.offer(4) + "  Queue:  " + queue);



        System.out.println(queue.peek() + "  Queue:  " + queue);

        System.out.println(queue.poll() + "  Queue:  " + queue);
        System.out.println(queue.peek());
        System.out.println(queue.offer(22) + "  Queue:  " + queue);

        System.out.println(queue.offer(34) + "  Queue:  " + queue);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(4);

        System.out.println(stack.peek());

        Map<Integer,String> map1 = new HashMap<>();

        map1.put(1,"Leena");

        System.out.println("\nTesting Map using HashMap:\n");

        System.out.println(map1);

        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");

        System.out.println("Map before No Leaf:\n " + map);
        map.put("giraffe", "no leaf");
        String food = map.get("koala"); // bamboo
        for (String key: map.keySet())
            System.out.print(key + ","); // koala,giraffe,lion,

        System.out.println("Map After Leaf:\n " + map);

        System.out.println("\nTesting Map using TreeMap:\n");


        Map<String, String>  map2 = new TreeMap<>();

        map2.put("hoala", "bamboo");
        map2.put("jion", "meat");
        map2.put("qiraffe", "leaf");

        System.out.println("Map before No Leaf:\n " + map);
        map2.put("giraffe", "no leaf");
        String food1 = map2.get("koala"); // bamboo
        for (String key: map2.keySet())
            System.out.print(key + ",\n");

        Map<String, String> map3 = new TreeMap<>();
        map3.put("zoala", "bamboo");
        map3.put("lion", "meat");
        map3.put("giraffe", "leaf");
        String food2 = map3.get("koala"); // bamboo
        System.out.println();
        for (String key: map3.keySet())
            System.out.print(key + "    ,    "); // giraffe,koala,lion,



    }

}
