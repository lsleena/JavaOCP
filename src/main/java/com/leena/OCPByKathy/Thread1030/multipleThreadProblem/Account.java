package com.leena.OCPByKathy.Thread1030.multipleThreadProblem;

public class Account {

    public int balance  = 50;

    public int getBalance() {

        return balance;
    }

    public void withdraw(int amount) {

        balance = balance - amount;
    }


}
