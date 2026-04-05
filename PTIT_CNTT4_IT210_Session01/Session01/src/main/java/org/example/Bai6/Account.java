package org.example.Bai6;

public class Account {
    private String username;
    private double balance;

    public Account(String username, double balance) {
        this.username = username;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public double getBalance() {
        return balance;
    }
}
