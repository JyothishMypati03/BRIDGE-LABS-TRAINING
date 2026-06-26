package com.bridge.commercial;

import java.time.LocalDateTime;

public class CompanyShares {

    // Instance variables
    private String stockSymbol;
    private int numberOfShares;
    private LocalDateTime transactionDateTime;

    // Constructor
    public CompanyShares(String stockSymbol, int numberOfShares) {

        this.stockSymbol = stockSymbol;
        this.numberOfShares = numberOfShares;
        this.transactionDateTime = LocalDateTime.now();
    }

    // Getter for stock symbol
    public String getStockSymbol() {
        return stockSymbol;
    }

    // Getter for number of shares
    public int getNumberOfShares() {
        return numberOfShares;
    }

    // Setter for number of shares
    public void setNumberOfShares(int numberOfShares) {

        this.numberOfShares = numberOfShares;
        this.transactionDateTime = LocalDateTime.now();
    }

    // Getter for transaction date and time
    public LocalDateTime getTransactionDateTime() {
        return transactionDateTime;
    }

    // Update transaction date and time
    public void updateTransactionTime() {
        this.transactionDateTime = LocalDateTime.now();
    }

    // Display share details
    @Override
    public String toString() {

        return "Stock Symbol       : " + stockSymbol +
                "\nNumber of Shares  : " + numberOfShares +
                "\nTransaction Time  : " + transactionDateTime;
    }
}