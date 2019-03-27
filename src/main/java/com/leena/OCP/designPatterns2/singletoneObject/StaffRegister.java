package com.leena.OCP.designPatterns2.singletoneObject;

/*
creates a singleton using a static initialization block when
the class is loaded

 */

public class StaffRegister {

    private static final StaffRegister instance;
    static {
        instance = new StaffRegister();
    }

    private StaffRegister() {

    }

    public static StaffRegister getInstance() {

        return instance;
    }
}
