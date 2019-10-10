package com.leena.OCPByKathy.Thread1030.synchronizedCollectionProblem;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NameList {

   //private List<String> names = Collections.synchronizedList(new LinkedList<>());
    private List names = new LinkedList<>();


    public synchronized void addName(String name) {
        names.add(name);
    }

    public synchronized String removeFirst() {

        if (names.size() > 0) {

            return (String) names.remove(0);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        final NameList nl = new NameList();

        nl.addName("Jiya");

        class NameDropper extends Thread {

            public void run() {

                String name = nl.removeFirst();

                System.out.println("Removed " + name);
            }
        }
        Thread t1 = new NameDropper();

        Thread t2 = new NameDropper();

        t1.start();
        t2.start();
    }
}

