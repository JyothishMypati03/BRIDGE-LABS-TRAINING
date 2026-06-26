package com.bridge.stockaccountmanagement;

import java.util.Scanner;

public class StockReport {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StockPortfolio portfolio = new StockPortfolio();

        // Read number of stocks
        System.out.print("Enter Number of Stocks : ");
        int n = scanner.nextInt();

        // Read stock details
        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter Details of Stock " + i);

            System.out.print("Stock Name : ");
            String stockName = scanner.next();

            System.out.print("Number of Shares : ");
            int numberOfShares = scanner.nextInt();

            System.out.print("Share Price : ");
            double sharePrice = scanner.nextDouble();

            Stock stock = new Stock(stockName, numberOfShares, sharePrice);

            portfolio.addStock(stock);
        }

        // Print report
        portfolio.printReport();
    }
}