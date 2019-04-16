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


class WeighAnimalTask extends RecursiveTask<Double> {

    private int start;
    private int end;
    private Double[] weights;

    public WeighAnimalTask(Double[] weights, int start, int end) {

        this.weights = weights;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Double compute() {
        if (end - start <= 3) {
            double sum = 0;


            for (int i = start; i < end; i++) {
                weights[i] = (double) new Random().nextInt(100);
                System.out.println("Animal Weighed: " + i);
                sum += weights[i];

            }
            return sum;
        } else {
            int middle = start + ((end - start) / 2);
            System.out.println("[start=" + start + ",middle=" + middle + ",end=" + end + "]");

            RecursiveTask<Double> otherTask = new WeighAnimalTask(weights, start, middle);
            otherTask.fork();

            return new WeighAnimalTask(weights, middle, end).compute() + otherTask.join();
            /*

        RecursiveTask<Double> otherTask = new WeighAnimalTask(weights,start,middle);
        Double otherResult = otherTask.fork().join();
        return new WeighAnimalTask(weights,,end).compute() + otherResult;

             */
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
        System.out.println("\nEntering Join/Fork Action Example: \n");

        System.out.println("Weights: ");

        Arrays.asList(weights).stream().forEach(
                d -> System.out.print(d.intValue() + " "));

        System.out.println("\n\nEntering Join/Fork Task Example: \n");

        ForkJoinTask<Double> task1 = new WeighAnimalTask(weights,0,weights.length);
        ForkJoinPool pool1  = new ForkJoinPool();
        Double sum = pool1.invoke(task1);
        System.out.println("Sum: "+ sum);

    }
}
