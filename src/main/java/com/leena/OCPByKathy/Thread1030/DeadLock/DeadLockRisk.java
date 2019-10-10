package com.leena.OCPByKathy.Thread1030.DeadLock;

public class DeadLockRisk {
    private static class Resource {

        public int value;
    }

    private Resource resourceA = new Resource();
    private Resource resourceB = new Resource();

    public int read() {

        synchronized (resourceA) { //DeadLock happens here
            synchronized (resourceB) {
                return resourceB.value + resourceA.value;
            }
        }
    }
    public void write(int a, int b) {

        synchronized (resourceB) { //DeadLock happens here
            synchronized (resourceA) {
                resourceB.value = b;
                resourceA.value = a;

            }
        }
    }


}
