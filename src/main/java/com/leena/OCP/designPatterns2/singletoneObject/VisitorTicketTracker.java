package com.leena.OCP.designPatterns2.singletoneObject;


/*
Applying Lazy Instantiation to Singletons
The VisitorTicketTracker class, though, does not create the singleton object
when the class is loaded but rather the first time it is requested by a client.
 */
public class VisitorTicketTracker {

/*
    private static VisitorTicketTracker instance;

    public static synchronized  VisitorTicketTracker getInstance() {

        if(instance == null) {
            instance = new VisitorTicketTracker(); // not thread safe so putting synchronized so only one thread will be allowed in the method at a time
        }
        return  instance;
    }
*/

// Singletons with Double‐Checked Locking

    private static volatile VisitorTicketTracker instance;
    public static VisitorTicketTracker getInstance() {
        if(instance == null) {
            synchronized(VisitorTicketTracker.class) {
                if(instance == null) {
                    instance = new VisitorTicketTracker();
                }
            }
        }
        return instance;
    }
}
