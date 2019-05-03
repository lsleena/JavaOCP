package com.leena.OCP.ExceptionAndAssertion6;

//import static com.leena.OCP.ExceptionAndAssertion6.Seasons.SUMMER;


public class Assertion {
/*

    public static void test(Seasons s) {
        switch (s) {
            case SPRING:
            case FALL:
                System.out.println("Shorter hours");
                break;
            case SUMMER:
                System.out.println("Longer hours");
                break;
            default:
                assert false : "Invalid season";
        }
    }
*/
    public static void main(String[] args) {

       int num = -5;
        assert num > 0;
        System.out.println(num);

    //  Assertion.test(WINTER);

        //Assertion.test(Seasons.WINTER);

    }
}
