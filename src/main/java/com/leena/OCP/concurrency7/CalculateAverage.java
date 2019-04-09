package com.leena.OCP.concurrency7;

public class CalculateAverage implements Runnable {


    private double[] scores;

    public CalculateAverage(double[] scores) {

        this.scores = scores;
    }

    @Override
    public void run () {

        int  i = 0;
        while (i <= 9) {

            System.out.println(i++);
        }
    }

    public static void main(String[] args) {

        double[] num = {1.3,4.5};
     //   new CalculateAverage(num).run();
        (new Thread(new CalculateAverage(num))).start();
        new Thread(new ReadInventoryThread()).start();
    }
}

class ReadInventoryThread extends Thread {

    public void run() {

        System.out.println("Printing zoo inventory");
    }
}