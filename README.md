##  Commercial Data Processing

### Description

This use case implements a **Stock Account Management System** that can be used by a financial institution to maintain customer stock information. The application allows customers to buy and sell company shares while maintaining the transaction date and time for every operation. The `StockAccount` class manages a list of `CompanyShares` objects and updates the portfolio whenever a transaction is performed.

### Objectives

* Create a Stock Account for a customer.
* Buy company shares.
* Sell company shares.
* Maintain a list of company shares.
* Record the date and time of every transaction.
* Display the customer's stock portfolio.

### Assumptions

* Each customer has:

    * Customer Name
    * Account Balance
* Each company share contains:

    * Stock Symbol
    * Number of Shares
    * Transaction Date and Time
* Shares can be purchased only if sufficient balance is available.
* Shares can be sold only if enough shares are owned.

### Algorithm

1. Create a `CompanyShares` class to store stock details.
2. Create a `StockAccount` class to maintain customer information.
3. Store company shares using an `ArrayList`.
4. Create a `buy()` method:

    * Check whether sufficient balance is available.
    * If the stock already exists, update the number of shares.
    * Otherwise, create a new `CompanyShares` object.
    * Update the transaction date and time.
5. Create a `sell()` method:

    * Check whether the customer owns the stock.
    * Verify that sufficient shares are available.
    * Reduce the number of shares.
    * Update the account balance.
    * Update the transaction date and time.
6. Display the complete stock portfolio.
7. Provide a menu-driven program to perform buy, sell, and display operations.

### Classes Used

```java
CompanyShares
StockAccount
CommercialDriver
```

### Important Methods

```java
public void buy(String stockSymbol, int numberOfShares, double sharePrice)

public void sell(String stockSymbol, int numberOfShares, double sharePrice)

public void displayPortfolio()
```

### Benefits

* Demonstrates object-oriented programming using classes and objects.
* Maintains customer stock information efficiently.
* Supports buying and selling company shares.
* Records the latest transaction date and time.
* Makes the application easy to extend and maintain.

### Sample Output

```text
Enter Customer Name : Jyothish
Enter Initial Balance : 100000

========== STOCK ACCOUNT MENU ==========
1. Buy Shares
2. Sell Shares
3. Display Portfolio
4. Display Balance
5. Exit

Enter Your Choice : 1

Enter Stock Symbol : TCS
Enter Number of Shares : 20
Enter Share Price : 3500

Shares purchased successfully.

========== STOCK ACCOUNT ==========
Customer Name : Jyothish
Balance       : 30000.0

------ COMPANY SHARES ------
----------------------------
Stock Symbol       : TCS
Number of Shares   : 20
Transaction Time   : 2026-06-26T11:15:42
----------------------------
```

**Note:** The transaction date and time are updated automatically whenever shares are bought or sold. The program prevents buying shares without sufficient balance and selling more shares than are available.
