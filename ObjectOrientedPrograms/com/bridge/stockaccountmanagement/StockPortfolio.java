package com.bridge.stockaccountmanagement;

import java.util.ArrayList;

public class StockPortfolio {

    // Store list of stocks
    private ArrayList<Stock> stocks = new ArrayList<>();

    // Add stock
    public void addStock(Stock stock) {

        stocks.add(stock);
    }

    // Print stock report
    public void printReport() {

        double totalPortfolioValue = 0;

        System.out.println("\n========== STOCK REPORT ==========");

        for (Stock stock : stocks) {

            double stockValue = stock.calculateStockValue();

            System.out.println("--------------------------------");
            System.out.println("Stock Name      : " + stock.getStockName());
            System.out.println("No. of Shares   : " + stock.getNumberOfShares());
            System.out.println("Share Price     : " + stock.getSharePrice());
            System.out.println("Stock Value     : " + stockValue);

            totalPortfolioValue += stockValue;
        }

        System.out.println("--------------------------------");
        System.out.println("Total Stock Value : " + totalPortfolioValue);
    }
}