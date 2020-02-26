package com.bkd;

public class Account {
    private float balance = 0;

    public void deposit(float amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(float amount) {
        this.balance = this.balance - amount;
    }

    public float getBalance() {
        return this.balance;
    }
}
