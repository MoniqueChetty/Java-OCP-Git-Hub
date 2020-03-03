package com.example;

public abstract class Account {

    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": current balance is " + balance;
    }

}
