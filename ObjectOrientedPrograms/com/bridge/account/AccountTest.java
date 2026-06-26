package com.bridge.account;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read account details
        System.out.print("Enter Account Holder Name : ");
        String name = scanner.nextLine();

        System.out.print("Enter Initial Balance : ");
        double balance = scanner.nextDouble();

        // Create Account object
        Account account = new Account(name, balance);

        // Display account details
        System.out.println("\nAccount Holder : " + account.getAccountHolder());
        System.out.println("Current Balance : " + account.getBalance());

        // Read debit amount
        System.out.print("\nEnter Amount to Withdraw : ");
        double amount = scanner.nextDouble();

        // Debit amount
        account.debit(amount);

        // Display updated balance
        System.out.println("Available Balance : " + account.getBalance());

        scanner.close();
    }
}