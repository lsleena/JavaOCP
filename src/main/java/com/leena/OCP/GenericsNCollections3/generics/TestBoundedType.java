package com.leena.OCP.GenericsNCollections3.generics;

/*

Won't compile
The method doubleValue() is undefined for the type T


public class Test<T> {
    T[] numArr;
    Test(T[] numArr){
        this.numArr = numArr;
    }
    public double getAvg(){
        double sum = 0.0;
        for(int i = 0; i < numArr.length; i++){
            sum += numArr[i].doubleValue();
        }
        double avg = sum/numArr.length;
        return avg;
    }
}*/


/*
Compare to above class -- added extends NUmber for doublevalue method
 */

public class TestBoundedType<T extends Number> {

    T[] numArr;
    TestBoundedType(T[] numArr){
        this.numArr = numArr;
    }
    public double getAvg() {

        double sum = 0.0;
        for(int i = 0; i < numArr.length; i++) {

            sum += numArr[i].doubleValue();
        }

        double avg = sum/numArr.length;
        return avg;
    }
}


/*

Multiple Bounds in Java Generics

If one of the bounds is a class, it must be specified first.

 */
class A { }
interface B {  }
interface C { }

class D <T extends A & B & C> { }