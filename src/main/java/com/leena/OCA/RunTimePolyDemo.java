package com.leena.OCA;

class Shapes {
    protected double length;

    Shapes(double length) {
        this.length = length;
    }

    void area() {

    }
}

class Circles extends Shapes {


    Circles(double length) {
        super(length);
    }

    //Overriding the area() method
    void area() {
        System.out.println("\nIn area method of circle");
        System.out.println("Area of cirlce - " + 22 / 7 * length * length);
        ;
    }
}

class Square extends Shapes {

    Square(double length) {
        super(length);
    }

    //Overriding the area() method
    void area() {
        System.out.println("\nIn area method of square");
        System.out.println("Area of square - " + length * length);
    }
}


class Primate {

    public boolean hasHair() {

        return true;
    }
}

interface HasTail {

    public boolean isTailStriped();
}

class Lemur extends Primate implements HasTail {

    public boolean isTailStriped() {

        return false;
    }

    public int age = 10;
}


class RunTimePolyDemo {

    public static void main(String[] args) {

        Circles circle = new Circles(2);

        circle.area();

        Square square = new Square(5.0);

        square.area();

        System.out.println("\nPoly - morphism with lemur object \n");
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        Primate primate = lemur;
        System.out.println(primate.hasHair());

    }
}
