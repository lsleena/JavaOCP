package com.leena.OCPByKathy.Thread1030.multipleThreadProblem;

public class AccountDanger implements Runnable {

    private Account account = new Account();

    public static void main(String[] args) {

        AccountDanger accountDanger = new AccountDanger();

        Thread one = new Thread(accountDanger);

        Thread two = new Thread(accountDanger);

        one.setName("fred");

        two.setName("lucy");
        one.start();
        two.start();


    }

    @Override
    public void run() {

        for (int x = 0; x < 5; x++) {

            makeWithdrawal(10);

            if (account.balance < 0) {

                System.out.println("Account Overdrawn");
            }
        }
    }


    private synchronized void makeWithdrawal(int amt) {

        if (account.getBalance() >= amt) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw ");


            try {
                Thread.sleep(500);

            } catch (InterruptedException Ex) {
            }

            account.withdraw(amt);

            System.out.println(Thread.currentThread().getName() + " completes the withdrawal....");
        } else {

            System.out.println("Not enough money for " + Thread.currentThread().getName() + " to withdraw " + account.getBalance());
        }

    }
}
