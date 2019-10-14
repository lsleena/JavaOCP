package com.leena.OCPByKathy.Thread1030.RaceCondition;

import java.util.HashSet;
import java.util.Set;

public class Show {

    private static volatile Show INSTANCE;
    private Set<String> avialableSeats;

    public static synchronized Show getINSTANCE() {

        if (INSTANCE == null) {
            INSTANCE = new Show();
        }
        return INSTANCE;
    }

    private Show() {

        avialableSeats = new HashSet<String>();
        avialableSeats.add("1A");
        avialableSeats.add("1B");

    }

    public boolean bookSeat(String seat) {
        System.out.println("Entering Booking Window of 2 tickets: ");
        return avialableSeats.remove(seat);
    }

}
