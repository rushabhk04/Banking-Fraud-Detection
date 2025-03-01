package org.protein;

import smile.classification.*;
import smile.data.*;
import smile.data.formula.*;
import smile.validation.*;

import java.util.List;

public class FraudDetectionModel {
    private LogisticRegression model;

    // Train the model using historical transaction data
    public void trainModel(List<Transaction> trainingData) {
        // Prepare the training dataset
        double[][] features = new double[trainingData.size()][3];
        int[] labels = new int[trainingData.size()];

        for (int i = 0; i < trainingData.size(); i++) {
            Transaction tx = trainingData.get(i);
            features[i][0] = tx.getAmount();
            features[i][1] = tx.getTransactionType();
            features[i][2] = tx.getCustomerProfile();
            labels[i] = tx.isFraud() ? 1 : 0;
        }

        // Train a Logistic Regression model
        model = LogisticRegression.fit(features, labels);
    }

    // Predict if a transaction is fraudulent
    public boolean predictFraud(Transaction transaction) {
        double[] features = { transaction.getAmount(), transaction.getTransactionType(), transaction.getCustomerProfile() };
        int prediction = model.predict(features);
        return prediction == 1;
    }
}
