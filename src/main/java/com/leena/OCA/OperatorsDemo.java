package com.leena.OCA;

public class OperatorsDemo {

    public static void main(String[] args) {

     //If two values have different data types, Java will automatically promote one of the valuesto the larger of the two data types.
        short x = 14;
        float y = 13;
        double z = 30;

        System.out.println(x*y/z);

        System.out.println("*****************");
        //Logical Complement and Negation Operators

        boolean x1 = false;
        System.out.println(x1);
        x1 = !x1;
        System.out.println(x1);

        System.out.println("*****************");

        double x2 = 1.21;
        System.out.println(x2); // 1.21
        x2 = -x2;
        System.out.println(x2); // -1.21
        x2 = -x2;
        System.out.println(x2); // 1.21

        System.out.println("*****************");

        int counter = 0;
        System.out.println(counter);
        System.out.println(++counter);
        System.out.println(counter);
        System.out.println(counter--);
        System.out.println(counter);

         x = 3;
         y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);

        System.out.println("********Casting Primitive Values*********");
         x = (int)9.0;
        System.out.println(x);
        short y1 = (short)1921222;
        System.out.println(y1);
        System.out.print(2147483647+1); // -2147483648 overflow wraps to next negative value

        System.out.println("********Inclusive / Exclusive OR*********");
        int i = 1,j=9;
        System.out.println((true^false) );
        System.out.println(true|true);
        System.out.println(true^true);// false


        System.out.println("********Equality operator*********");

        System.out.println("5 == 5.00 is  :"+(5 == 5.00));// returns true since the left side is promoted to a double

        String str1 = new String("Test");
        String str2 = new String("Test");

        System.out.println(str1 + " == " + str2 + " - " + (str1 == str2));

        System.out.println(str1 + ".equals(" + str2 + ") - " + str1.equals(str2));

    }
}
