package com.leena.OCA;


    @FunctionalInterface
    interface IFuncInt {
        int func(int num1, int num2);
        public String toString();
    }

public class LambdaVarDemo {

        public static void main(String[] args){
            LambdaVarDemo lambdaDemo = new LambdaVarDemo();
            lambdaDemo.getResult();
        }

        public void getResult(){
            IFuncInt funcInt = (num1, num2) -> {
                System.out.println("calling toString " + this.toString());
                return num1 + num2;
            };
            System.out.println("Result is " + funcInt.func(6, 7));
        }

        @Override
        public String toString() {
            System.out.println("in class LambdaVarDemo toString()" );
            return super.toString();
        }

    }