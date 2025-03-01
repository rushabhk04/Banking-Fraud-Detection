# 🏦 AI-Powered Banking Fraud Detection 🚀

A **Java-based banking fraud detection system** using **Machine Learning (Smile Library)**. This project detects fraudulent transactions based on transaction amount, type, and customer profile using **Logistic Regression**.

## 📌 Features
- ✅ Uses **Smile ML Library** for fraud detection
- ✅ Implements **Logistic Regression** for classification
- ✅ Simple **Maven project** structure
- ✅ Easily extendable to **real-time fraud prevention**

## 🛠️ Technologies Used
- **Java 8+**
- **Smile (AI/ML)**
- **Maven**
- **SLF4J & Logback (Logging)**

## 👤 Project Structure
```
AI-Powered-Banking-Fraud-Detection
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── org.protein
│   │   │   │   ├── App.java
│   │   │   │   ├── Transaction.java
│   │   │   │   ├── FraudDetectionModel.java
│   │   ├── resources
│   ├── test
│       ├── java
```

## 🚀 How to Run

### 1️⃣ **Clone the Repository**
```bash
cd AI-Powered-Banking-Fraud-Detection
```

### 2️⃣ **Build the Project**
Ensure you have **Maven** installed, then run:
```bash
mvn clean install
```

### 3️⃣ **Run the Application**
Execute the Java application using:
```bash
mvn exec:java -Dexec.mainClass="org.protein.App"
```

### 4️⃣ **Expected Output**
```
Transaction: 15000.0 is Fraudulent? false
```

## 📊 How It Works
1. The model is trained on **historical transaction data** (fraud & non-fraud cases).
2. Features include **Amount, Transaction Type, and Customer Profile**.
3. The **Logistic Regression model** predicts whether a new transaction is fraudulent.

## 🛠️ Possible Enhancements
- ✅ Add **real-time fraud detection** with **Apache Kafka & Spark Streaming**
- ✅ Use **Deep Learning (TensorFlow, PyTorch)** for improved accuracy
- ✅ Integrate with **Spring Boot REST API**

## 🔧 Dependencies
Ensure these dependencies are added to your `pom.xml`:
```xml

<dependency>
    <groupId>com.github.haifengl</groupId>
    <artifactId>smile-core</artifactId>
    <version>2.6.0</version>
</dependency>
<dependency>
<groupId>com.github.haifengl</groupId>
<artifactId>smile-data</artifactId>
<version>2.6.0</version>
</dependency>
<dependency>
<groupId>ch.qos.logback</groupId>
<artifactId>logback-classic</artifactId>
<version>1.2.11</version>
</dependency>
```