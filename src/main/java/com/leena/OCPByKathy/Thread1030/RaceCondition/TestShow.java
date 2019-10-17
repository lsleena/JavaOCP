package com.leena.OCPByKathy.Thread1030.RaceCondition;

public class TestShow {

    public static void main(String[] args) {
        TestShow testThreads = new TestShow();
        testThreads.go();
    }

    public void go () {

        Thread getSeat1 = new Thread(() ->
        {
            ticketAgentsBooks("1A");
            ticketAgentsBooks("1B");
        });


        Thread getSeat2 = new Thread(() ->
        {
            ticketAgentsBooks("1A");
            ticketAgentsBooks("1B");
        });

        getSeat1.start();
        getSeat2.start();
    }

    public synchronized void ticketAgentsBooks(String seats) {


        Show show = Show.getINSTANCE();

        System.out.println(Thread.currentThread().getName() + " : " +
        show.bookSeat(seats));
    }
}
