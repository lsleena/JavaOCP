package com.leena.OCP.designPatterns2.interfaceDesign;


interface Walk {

    boolean isQuadraped();
    abstract double getMaxSpeed();
}

interface Run extends Walk {

    public abstract boolean canHuntWhileRunning();
    abstract double getMaxSpeed();
}

interface Hunt { }

class Tiger implements Walk, Hunt {

    @Override
    public boolean isQuadraped() {

        return true;
    }

    @Override
    public double getMaxSpeed() {
        return 0;
    }

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
