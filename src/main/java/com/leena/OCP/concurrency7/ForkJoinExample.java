package com.leena.OCP.concurrency7;

import java.util.*;
import java.util.concurrent.*;


class WeighAnimalAction extends RecursiveAction {

    private int start;
    private int end;
    private Double[] weights;

    public WeighAnimalAction(Double[] weights, int start, int end) {

        this.weights = weights;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (end - start <= 3)
            for (int i = start; i < end; i++) {
                weights[i] = (double) new Random().nextInt(100);
                System.out.println("Animal Weighed: " + i);
            }
        else {
            int middle = start + ((end - start) / 2);
            System.out.println("[start=" + start + ",middle=" + middle + ",end=" + end + "]");
            invokeAll(new WeighAnimalAction(weights, start, middle),
                    new WeighAnimalAction(weights, middle, end));
        }
    }
}

public class ForkJoinExample {

    public static void main(String[] args) {

        Double[] weights = new Double[10];

        ForkJoinTask<?> task = new WeighAnimalAction(weights, 0, weights.length);

        ForkJoinPool pool = new ForkJoinPool();

        pool.invoke(task);


        System.out.println();

        System.out.println("Weights: ");

        Arrays.asList(weights).stream().forEach(
                d -> System.out.println(d.intValue() + " "));

    }
}
