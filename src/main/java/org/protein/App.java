package org.protein;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Step 1: Create training data (historical transactions)
        List<Transaction> trainingData = new ArrayList<>();
        trainingData.add(new Transaction(5000, 0, 0, false)); // Regular transfer, not fraud
        trainingData.add(new Transaction(10000, 1, 0, true)); // Withdrawal, fraud
        trainingData.add(new Transaction(20000, 0, 1, false)); // High-value transfer, not fraud
        trainingData.add(new Transaction(50000, 2, 1, true)); // High-value deposit, fraud

        // Step 2: Train the fraud detection model
        FraudDetectionModel fraudDetection = new FraudDetectionModel();
        fraudDetection.trainModel(trainingData);

        // Step 3: Test the model with a new transaction
        Transaction newTransaction = new Transaction(100000, 0, 0, false); // Test case
        boolean isFraud = fraudDetection.predictFraud(newTransaction);

        // Step 4: Display the result
        System.out.println("Transaction: " + newTransaction.getAmount() + " is Fraudulent? " + isFraud);
    }
}
