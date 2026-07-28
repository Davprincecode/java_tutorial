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
            if (amount >= 1000){
                System.out.println("Successfully deposited: $" + amount);
            }else{
                System.out.println("You can not deposit below $1000");
            }

        }

        // Method 2: Withdraw money (No conditions)
        public void withdraw(double amount) {
            if (amount > 0 && amount <= this.balance){
                balance -= amount;
                System.out.println("Successfully withdrew: $" + amount);
            } else if (amount <= 0) {
                System.out.println("Not allow: $" + amount);
            }else{
                System.out.println("Insufficient Fund: $" + amount);
            }

        }

       public  void balance(){
            System.out.println("Your Balance: $" + " " + this.balance);
       }
 }

