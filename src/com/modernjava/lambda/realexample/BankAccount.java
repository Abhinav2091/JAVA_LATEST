package com.modernjava.lambda.realexample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiFunction;

public class BankAccount {

    private int id;
    private double balance;
    private String accountName;
    final Lock lock = new ReentrantLock();

    public BankAccount() {
    }

    public BankAccount(int id, double balance, String accountName) {
        this.id = id;
        this.balance = balance;
        this.accountName = accountName;
    }

    BiFunction<Double, Double, Double> biFunctionAdd = Double::sum;
    BiFunction<Double, Double, Double> biFunctionSubtract = (x, y) -> x - y;

    public boolean withDrawMoney(double amount) throws InterruptedException {
        if (this.lock.tryLock()) {
            Thread.sleep(100);
            balance = biFunctionSubtract.apply(balance, amount);
            this.lock.unlock();
            return true;
        }
        return false;

    }

    public boolean depositMoney(double amount) throws InterruptedException {
        if (this.lock.tryLock()) {
            Thread.sleep(100);
            balance = biFunctionAdd.apply(balance, amount);
            this.lock.unlock();
            return true;
        }
        return false;

    }

    public boolean transferMoney(BankAccount to, double amount) throws InterruptedException {
        if (withDrawMoney(amount)) {
            System.out.println("withdrawing amount :" + amount + " from :" + getAccountName());
            if (to.depositMoney(amount)) {
                System.out.println("Depositing amount :" + amount + " to :" + to.getAccountName());
                return true;
            } else {
                System.out.println("Failed to transfer amount:" + amount + " from :" + getAccountName() + " to :" + to.getAccountName());
                //this loop will try to deposit back/refund the money until it is successfull
                while (!depositMoney(amount))
                    continue;
            }

        }
        return false;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}
