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

public class RunTimePolyDemo {

    public static void main(String[] args) {

        Circles circle = new Circles(2);

        circle.area();

        Square square = new Square(5.0);

        square.area();

    }
}
