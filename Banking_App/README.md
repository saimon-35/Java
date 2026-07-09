# 🏦 Mini Banking Application

A simple **console-based banking application** built using **Java**, **JDBC**, and **MySQL**. This project demonstrates CRUD operations, database connectivity, transaction management, and basic banking functionalities.

## 📌 Features

-  Create a new bank account
-  Secure user login
-  View account balance
-  Transfer money between accounts
-  Database transaction support (Commit & Rollback)
-  Uses PreparedStatement to prevent SQL Injection
-  Menu-driven console interface

---

## 🛠️ Technologies Used

- Java
- JDBC
- MySQL
- Eclipse IDE
- MySQL Connector/J

---

## 📁 Project Structure

```
MiniBankingApp/
│
├── src/
│   └── banking/
│       ├── Bank.java
│       ├── BankManagement.java
│       └── Connection.java
│
├── lib/
│   └── mysql-connector-j.jar
│
├── README.md
└── .gitignore
```

---

## 🗄️ Database Schema

Create the database:

```sql
CREATE DATABASE BANK;
USE BANK;
```

Create the customer table:

```sql
CREATE TABLE customer (
    ac_no INT NOT NULL AUTO_INCREMENT,
    cname VARCHAR(45) UNIQUE NOT NULL,
    balance INT DEFAULT 1000,
    pass_code INT NOT NULL,
    PRIMARY KEY (ac_no)
);
```

---

## ⚙️ Installation

### 1. Clone the repository

```bash
git clone https://github.com/saimon35/MiniBankingApp.git
```

### 2. Import into Eclipse

- File → Import → Existing Java Project
- Select the project folder

### 3. Add MySQL JDBC Driver

Download the MySQL Connector/J JAR and add it to your project's Build Path.

### 4. Configure Database Connection

Update the database credentials in `Connection.java`.

```java
String url = "jdbc:mysql://localhost:3306/BANK";
String user = "root";
String password = "your_password";
```

### 5. Run the Project

Run `Bank.java`.

---

## 🚀 Application Workflow

```
Welcome to InBank

1. Create Account
2. Login
3. Exit
```

After login:

```
1. Transfer Money
2. View Balance
3. Logout
```

---

## 📸 Sample Output

```
Welcome to InBank

1) Create Account
2) Login Account
3) Exit

Enter Choice: 2

Enter Username: saimon
Enter Password: ****

Hello, saimon!

1) Transfer Money
2) View Balance
3) Logout
```

---

## 🔒 Transaction Handling

Money transfers are executed inside a database transaction.

- Auto Commit Disabled
- Commit on Success
- Rollback on Failure

This ensures data consistency during fund transfers.

---

## 📚 Concepts Practiced

- Object-Oriented Programming (OOP)
- JDBC
- MySQL
- PreparedStatement
- Exception Handling
- Transactions
- Console I/O

## 📄 License

This project is intended for educational purposes.
