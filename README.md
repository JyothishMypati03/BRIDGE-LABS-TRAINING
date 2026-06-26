## UC1 - Stock Account Management

### Description

This use case implements a Stock Account Management program that reads stock details such as stock name, number of shares, and share price. It calculates the value of each stock and the total value of all stocks in the portfolio, then displays a stock report.

### Objectives

* Read stock details from the user.
* Calculate the value of each stock.
* Calculate the total value of all stocks.
* Store stock details using a `Stock` class.
* Manage multiple stocks using a `StockPortfolio` class.

### Assumptions

* The user enters the number of stocks.
* Each stock has:

    * Stock Name
    * Number of Shares
    * Share Price
* Stock Value = Number of Shares × Share Price

### Algorithm

1. Create a `Stock` class to store stock details.
2. Create a `StockPortfolio` class to maintain a list of stocks.
3. Read the number of stocks from the user.
4. For each stock:

    * Read the stock name.
    * Read the number of shares.
    * Read the share price.
    * Add the stock to the portfolio.
5. Calculate the value of each stock.
6. Calculate the total value of all stocks.
7. Display the stock report.

### Classes Used

```java
Stock
StockPortfolio
StockReport
```

### Important Methods

```java
public double calculateStockValue()

public void addStock(Stock stock)

public void printReport()
```

### Benefits

* Demonstrates object-oriented programming using classes and objects.
* Organizes stock information efficiently.
* Calculates individual stock values and total portfolio value.
* Makes the application easy to maintain and extend.
* Supports managing multiple stocks.

### Sample Output

```text
Enter Number of Stocks : 2

Enter Details of Stock 1
Stock Name : TCS
Number of Shares : 100
Share Price : 3500

Enter Details of Stock 2
Stock Name : Infosys
Number of Shares : 50
Share Price : 1600

========== STOCK REPORT ==========
--------------------------------
Stock Name      : TCS
No. of Shares   : 100
Share Price     : 3500.0
Stock Value     : 350000.0
--------------------------------
Stock Name      : Infosys
No. of Shares   : 50
Share Price     : 1600.0
Stock Value     : 80000.0
--------------------------------
Total Stock Value : 430000.0
```

**Note:** The total stock value is calculated by summing the values of all individual stocks entered by the user.
