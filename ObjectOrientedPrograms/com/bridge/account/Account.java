package com.bridge.account;

public class Account {

    // Instance variables
    private String accountHolder;
    private double balance;

    // Constructor
    public Account(String accountHolder, double balance) {

        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to deposit money
    public void credit(double amount) {

        balance += amount;
    }

    // Method to withdraw money
    public void debit(double amount) {

        if (amount <= balance) {

            balance -= amount;

            System.out.println("Amount Debited Successfully.");
        }
        else {

            System.out.println("Debit amount exceeded account balance.");
        }
    }

    // Getter methods
    public String getAccountHolder() {

        return accountHolder;
    }

    public double getBalance() {

        return balance;
    }
}