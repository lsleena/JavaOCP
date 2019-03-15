package com.leena.OCA;

import java.time.LocalTime;
import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList arr = new ArrayList();

        ArrayList arrList = new ArrayList(5);

        ArrayList list = new ArrayList();

        list.add("hawk"); // [hawk]
        list.add(Boolean.TRUE); // [hawk, true]
        System.out.println(list);

        ArrayList<String> safer = new ArrayList<String>();
        safer.add("sparrow");
        //  safer.add(Boolean.TRUE);// won't compile

        List<String> birds = new ArrayList<String>();
        birds.add("hawk"); // [hawk]
        birds.add(1, "robin"); // [hawk, robin]
        birds.add(0, "blue jay"); // [blue jay, hawk, robin]
        birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
        System.out.println(birds); // [blue jay, cardinal, hawk, robin]

        System.out.println(birds.remove("cardinal"));
        System.out.println(birds.remove("parrot"));
        System.out.println(birds.remove("hawk"));
        birds.remove("cardinal");
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());
        birds.add("hawk");
        birds.add("hawk");


        Set<Integer> j = new HashSet<Integer>();
        Map<Integer, String> mp = new Hashtable<Integer, String>();
        mp.put(9, "leena");
        System.out.println(mp);
        j.add(9);
        j.add(9);
        System.out.println(j);

        System.out.println(Boolean.valueOf("FALSE"));


        //array n arraylist conversion

        List<String> lists = new ArrayList();
        lists.add("hawk");
        lists.add("robin");
        Object[] objectArray = lists.toArray();
        System.out.println(objectArray.length); // 2
        String[] stringArray = lists.toArray(new String[0]);
        System.out.println(stringArray.length);

    }
}
