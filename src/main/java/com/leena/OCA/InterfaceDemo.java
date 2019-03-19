package com.leena.OCA;

interface Vehicle {

    void changeGear(int a);

    void speedUp(int a);

    void applyBrakes(int a);


    static void  start(){
        System.out.println("In static start method");
    }



    default void  stop(){
        System.out.println("In default stop method");
    }

}

class Bicycle implements Vehicle {

    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {

        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {

        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}

class Bike implements Vehicle {

    int speed;
    int gear;

    // to change gear
    @Override
    public void changeGear(int newGear) {

        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {

        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

}

class InterfaceDemo {

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        Vehicle.start();

        System.out.println("Bicycle present state :");
        bicycle.printStates();

        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.println("Bike present state :");
        bike.printStates();

        Vehicle defaultCall = new Bicycle();
        defaultCall.stop();
    }
}