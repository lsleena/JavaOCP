package com.leena.OCPByKathy.Thread1030.RaceCondition;

import java.util.HashSet;
import java.util.Set;

public class Show {

    private static volatile Show INSTANCE;
    private Set<String> availableSeats;

    public static synchronized Show getINSTANCE() {

        if (INSTANCE == null) {
            INSTANCE = new Show();
        }
        return INSTANCE;
    }

    private Show() {

        availableSeats = new HashSet<String>();
        availableSeats.add("1A");
        availableSeats.add("1B");

    }

    public  boolean bookSeat(String seat) {
      //  System.out.println("Entering Booking Window of 2 tickets: ");
        return availableSeats.remove(seat);
    }

}
