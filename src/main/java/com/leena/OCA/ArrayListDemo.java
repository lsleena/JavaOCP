package com.leena.OCA;

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
    }
}
