package com.bridge.commercial;

import java.util.Scanner;

public class CommercialDriver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read customer details
        System.out.print("Enter Customer Name : ");
        String customerName = scanner.nextLine();

        System.out.print("Enter Initial Balance : ");
        double balance = scanner.nextDouble();

        // Create StockAccount object
        StockAccount account = new StockAccount(customerName, balance);

        int choice;

        do {

            System.out.println("\n========== STOCK ACCOUNT MENU ==========");
            System.out.println("1. Buy Shares");
            System.out.println("2. Sell Shares");
            System.out.println("3. Display Portfolio");
            System.out.println("4. Display Balance");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice : ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Stock Symbol : ");
                    String buySymbol = scanner.next();

                    System.out.print("Enter Number of Shares : ");
                    int buyShares = scanner.nextInt();

                    System.out.print("Enter Share Price : ");
                    double buyPrice = scanner.nextDouble();

                    account.buy(buySymbol, buyShares, buyPrice);
                    break;

                case 2:

                    System.out.print("Enter Stock Symbol : ");
                    String sellSymbol = scanner.next();

                    System.out.print("Enter Number of Shares : ");
                    int sellShares = scanner.nextInt();

                    System.out.print("Enter Share Price : ");
                    double sellPrice = scanner.nextDouble();

                    account.sell(sellSymbol, sellShares, sellPrice);
                    break;

                case 3:

                    account.displayPortfolio();
                    break;

                case 4:

                    System.out.println("Available Balance : " + account.getBalance());
                    break;

                case 5:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

    }
}