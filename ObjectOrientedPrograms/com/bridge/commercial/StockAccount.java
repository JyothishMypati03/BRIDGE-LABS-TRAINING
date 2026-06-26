package com.bridge.commercial;

import java.util.ArrayList;

public class StockAccount {

    // Instance variables
    private String customerName;
    private double balance;

    // List to store company shares
    private ArrayList<CompanyShares> companySharesList = new ArrayList<>();

    // Constructor
    public StockAccount(String customerName, double balance) {

        this.customerName = customerName;
        this.balance = balance;
    }

    // Method to buy shares
    public void buy(String stockSymbol, int numberOfShares, double sharePrice) {

        double totalCost = numberOfShares * sharePrice;

        if (totalCost > balance) {

            System.out.println("Insufficient balance to buy shares.");
            return;
        }

        // Deduct amount from balance
        balance -= totalCost;

        // Check whether stock already exists
        for (CompanyShares company : companySharesList) {

            if (company.getStockSymbol().equalsIgnoreCase(stockSymbol)) {

                company.setNumberOfShares(
                        company.getNumberOfShares() + numberOfShares);

                company.updateTransactionTime();

                System.out.println("Shares purchased successfully.");

                return;
            }
        }

        // Create new company shares object
        companySharesList.add(new CompanyShares(stockSymbol, numberOfShares));

        System.out.println("Shares purchased successfully.");
    }

    // Method to sell shares
    public void sell(String stockSymbol, int numberOfShares, double sharePrice) {

        for (CompanyShares company : companySharesList) {

            if (company.getStockSymbol().equalsIgnoreCase(stockSymbol)) {

                if (company.getNumberOfShares() < numberOfShares) {

                    System.out.println("Not enough shares to sell.");
                    return;
                }

                // Update shares
                company.setNumberOfShares(
                        company.getNumberOfShares() - numberOfShares);

                company.updateTransactionTime();

                // Add amount to balance
                balance += numberOfShares * sharePrice;

                System.out.println("Shares sold successfully.");

                return;
            }
        }

        System.out.println("Stock not found.");
    }

    // Display account details
    public void displayPortfolio() {

        System.out.println("\n========== STOCK ACCOUNT ==========");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Balance       : " + balance);

        System.out.println("\n------ COMPANY SHARES ------");

        if (companySharesList.isEmpty()) {

            System.out.println("No Shares Available.");
        }
        else {

            for (CompanyShares company : companySharesList) {

                System.out.println("----------------------------");
                System.out.println(company);
            }
        }

        System.out.println("----------------------------");
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getter for customer name
    public String getCustomerName() {
        return customerName;
    }
}