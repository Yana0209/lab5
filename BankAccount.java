package org.example;

public class BankAccount {
    private int accountNumber;
    private String accountName;
    private double balance;


    public BankAccount(int accountNumber, String accountName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new NegativeAmountException("Deposit amount should be positive.");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new NegativeAmountException("Withdrawal amount should be positive.");
        }
        if (amount > this.balance) {
            throw new InsufficientFundsException("Insufficient funds.");
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountSummary() {
        return "Account Number: " + accountNumber + "\nAccount Name: " + accountName + "\nBalance: " + balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

