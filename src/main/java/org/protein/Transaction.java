package org.protein;

public class Transaction {
    private double amount;
    private int transactionType; // 0: Transfer, 1: Withdrawal, 2: Deposit
    private int customerProfile; // 0: Regular, 1: High-value
    private boolean isFraud; // True for fraud, false otherwise (for training data)

    public Transaction(double amount, int transactionType, int customerProfile, boolean isFraud) {
        this.amount = amount;
        this.transactionType = transactionType;
        this.customerProfile = customerProfile;
        this.isFraud = isFraud;
    }

    public double getAmount() {
        return amount;
    }

    public int getTransactionType() {
        return transactionType;
    }

    public int getCustomerProfile() {
        return customerProfile;
    }

    public boolean isFraud() {
        return isFraud;
    }
}
