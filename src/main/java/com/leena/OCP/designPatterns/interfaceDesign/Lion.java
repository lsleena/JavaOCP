package com.leena.OCP.designPatterns.interfaceDesign;


interface Walk {

    boolean isQuadraped();
    abstract double getMaxSpeed();
}

interface Run extends Walk {

    public abstract boolean canHuntWhileRunning();
    abstract double getMaxSpeed();
}

public class Lion implements Run {


    @Override
    public boolean isQuadraped() {

        return true;
    }

    @Override
    public boolean canHuntWhileRunning() {

        return true;
    }

    @Override
    public double getMaxSpeed() {

        return 100;
    }
}
