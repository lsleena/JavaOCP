package com.leena.OCP.concurrency7;

import java.util.concurrent.ExecutorService;

public class CheckResults {

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = null;
        new Thread(() -> {
            for (int i = 0; i < 500; i++ ) CheckResults.counter++;
        }).start();

        while (CheckResults.counter < 100) {
            System.out.println("Not reached yet");
            Thread.sleep(1000);
        }

        System.out.println("Reached");
        System.out.println("Available Processors:  " + Runtime.getRuntime().availableProcessors());

    }
}
