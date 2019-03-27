package com.leena.OCP.designPatterns2.singletoneObject;


/*
Applying Lazy Instantiation to Singletons
The VisitorTicketTracker class, though, does not create the singleton object
when the class is loaded but rather the first time it is requested by a client.
 */
public class VisitorTicketTracker {

    private static VisitorTicketTracker instance;

    public static VisitorTicketTracker getInstance() {

        if(instance == null) {
            instance = new VisitorTicketTracker();
        }
        return  instance;
    }
}
