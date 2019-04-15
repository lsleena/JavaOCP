package com.leena.OCP.concurrency7;

import java.util.*;
import java.util.stream.Stream;

class WhaleDataCalculator {

    public int processRecord(int input) {

        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
        return input + 1;
    }

   /* public void processedAllData(List<Integer> data) {

        data.stream().map(a -> processRecord(a)).count();
    } */
    public void processAllData(List<Integer> data) {
        data.parallelStream().map(a -> processRecord(a)).count();
    }
}

public class ParalleStreamExample {

    public static void main(String[] args) {

        Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6,7).stream();

        Stream<Integer> parallelStream = stream.parallel();

        parallelStream.forEach(s -> System.out.print(s + "   "));

        System.out.println("\n");

        Arrays.asList(21,22,23,24,25,6)
                .parallelStream().forEachOrdered(s -> System.out.print(s + "   "));


        WhaleDataCalculator calculator = new WhaleDataCalculator();

        List<Integer> arryList = new ArrayList<>();

        for (int i = 0; i<4000; i++) arryList.add(i);

        Long start = System.currentTimeMillis();

        calculator.processAllData(arryList);
        double time = (System.currentTimeMillis() - start) / 1000.0;

        // Report results
        System.out.println("\nTasks completed in: "+time+" seconds");
    }
}