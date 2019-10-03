package com.leena.OCPByKathy.Thread1030.multipleThreadProblem;

public class AccountDanger implements Runnable {

    private Account account = new Account();

    public static void main(String[] args) {

        AccountDanger accountDanger = new AccountDanger();

        Thread t1 = new Thread(accountDanger);

        Thread t2 = new Thread(accountDanger);

        t1.setName("fred");

        t2.setName("lucy");


    }

    @Override
    public void run() {

    }
}
