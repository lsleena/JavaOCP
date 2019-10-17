package com.leena.OCPByKathy.Thread1030.DeadLock;

public class DeadLockRisk extends Thread{

    private static class Resource {

        public int value;
    }

    private Resource resourceA = new Resource();
    private Resource resourceB = new Resource();

    public int read() {

        synchronized (resourceA) { //DeadLock happens here
            synchronized (resourceB) {
                System.out.println("A");

                return resourceB.value + resourceA.value;

            }
        }
    }

    public void write(int a, int b) {

        synchronized (resourceA) { //DeadLock happens here

            synchronized (resourceB) {
                System.out.println("B");

                resourceB.value = b;
                resourceA.value = a;

            }
        }
    }


    public static void main(String[] args) {

        DeadLockRisk deadLockRisk = new DeadLockRisk();

        DeadLockRisk deadLockRisk1 = new DeadLockRisk();

        deadLockRisk.write(2,3);

        deadLockRisk1.read();

    }
}
