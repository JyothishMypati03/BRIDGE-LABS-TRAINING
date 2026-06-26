package com.bridge.stockaccountmanagement;

public class Stock {

    // Instance variables
    private String stockName;
    private int numberOfShares;
    private double sharePrice;

    // Constructor
    public Stock(String stockName, int numberOfShares, double sharePrice) {

        this.stockName = stockName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    // Method to calculate stock value
    public double calculateStockValue() {

        return numberOfShares * sharePrice;
    }

    // Getters
    public String getStockName() {
        return stockName;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public double getSharePrice() {

        return sharePrice;
    }
}