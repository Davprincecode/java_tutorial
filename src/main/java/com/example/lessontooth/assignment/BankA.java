package com.example.lessontooth.assignment;

public class BankA {

        String accountNumber;
        double balance;

        public BankA (String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        // Method 1: Deposit money (No conditions)
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        }

        // Method 2: Withdraw money (No conditions)
        public void withdraw(double amount) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
}
}

