package com.leena.OCP.GenericsNCollections3.generics;


class Elephant {

    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Elephant(String speciesName, boolean hopper, boolean swimmer) {

        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }


}

class Zebra {

}



public class Crate<T> {

    private T contents;

    public T emptyCrate() {

        return contents;
    }

    public void packCrate(T contents) {

        this.contents = contents;
    }


    public static void main(String[] args) {

        Elephant elephant = new Elephant("rabbit", true, true);
        Crate<Elephant> crateForElephant = new Crate<>();

        Crate crate = new Crate();
        crateForElephant.packCrate(elephant);
        Elephant inNewHome = crateForElephant.emptyCrate();

        Crate<Zebra> crateForZebra = new Crate<>();
        Zebra zebra = new Zebra();
        crateForZebra.packCrate(zebra);
        Elephant elephant1 = new Elephant("rabbit", true, true);

        Integer numPounds = 15_000;
        System.out.println(numPounds.toString());

        Robot r = (Robot) crate.emptyCrate();

    }
}

class Robot {

}

interface Shippable<T> {

    void ship(T t);
}

class ShippableRobotCrate implements Shippable<Robot> {

    @Override
    public void ship(Robot robot) {

    }
}

class ShippableAbstractCrate implements Shippable {

    @Override
    public void ship(Object o) {

    }
    public static <T> Crate<T> shop(T t) {
        System.out.println("Preparing " + t);
        return new Crate<T>();
    }
}


class ShippableCrate<U> implements Shippable<U> {

    @Override
    public void ship(U u) {

    }
}
