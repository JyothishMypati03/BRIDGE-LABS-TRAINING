##  Account Debit Operation

### Description

This use case enhances the `Account` class by adding a `debit()` method that withdraws money from an account. The method ensures that the withdrawal amount does not exceed the available balance. If the debit amount is greater than the account balance, the transaction is cancelled and an appropriate message is displayed.

### Objectives

* Create an `Account` class with account details.
* Implement a `debit()` method to withdraw money.
* Prevent withdrawals when the debit amount exceeds the account balance.
* Display the updated account balance after each transaction.
* Test the `debit()` method using the `AccountTest` class.

### Assumptions

* Each account has:

    * Account Holder Name
    * Account Balance
* The withdrawal amount cannot exceed the available balance.
* The account balance remains unchanged if the debit amount is greater than the available balance.

### Algorithm

1. Create an `Account` class with account holder name and balance.
2. Create a constructor to initialize the account details.
3. Create a `debit()` method.
4. Compare the debit amount with the available balance.
5. If the debit amount is less than or equal to the balance:

    * Deduct the amount from the balance.
6. Otherwise:

    * Display the message **"Debit amount exceeded account balance."**
    * Keep the balance unchanged.
7. Create an `AccountTest` class.
8. Read account details and debit amount from the user.
9. Call the `debit()` method and display the updated balance.

### Classes Used

```java
Account
AccountTest
```

### Important Methods

```java
public void debit(double amount)

public double getBalance()
```

### Benefits

* Demonstrates encapsulation using classes and objects.
* Prevents invalid withdrawal transactions.
* Protects the account from overdrawing.
* Improves code readability and maintainability.
* Follows object-oriented programming principles.

### Sample Output

```text
Enter Account Holder Name : Jyothish
Enter Initial Balance : 10000

Account Holder : Jyothish
Current Balance : 10000.0

Enter Amount to Withdraw : 2500

Amount Debited Successfully.
Available Balance : 7500.0
```

### Sample Output (Insufficient Balance)

```text
Enter Account Holder Name : Jyothish
Enter Initial Balance : 10000

Account Holder : Jyothish
Current Balance : 10000.0

Enter Amount to Withdraw : 15000

Debit amount exceeded account balance.
Available Balance : 10000.0
```
