//Write a Java program to implement a Bank Account Management System.

//Create a class named BankAccount with the following data members: accountNumber, accountHolderName and balance.

//Create a parameterized constructor to initialize all the account details.

//Implement the following methods:

//deposit(double amount) - Adds the given amount to the balance.
//withdraw(double amount) - Withdraws money only if sufficient balance is available.
//checkBalance() - Returns the current balance.
//displayAccount() - Displays account details and balance.
//In the main() method, read the account details and initial balance. Create an object using the parameterized constructor. Perform one deposit and one withdrawal operation and display the final account details.

//Use separate methods for each operation. Do not perform all the calculations directly inside the main() method.
//code:--

import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    // Fixed constructor name to match the class
    public BankAccount(String accNum, String name, double initialBalance) {
        accountNumber = accNum;
        accountHolderName = name;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

// If this is in a file named Main.java, make this class public instead.
public class Main { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accNum = in.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = in.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = in.nextDouble();

        // Correctly creates the BankAccount object
        BankAccount account = new BankAccount(accNum, name, initialBalance);

        System.out.print("Enter amount to deposit: ");
        double depAmount = in.nextDouble();
        account.deposit(depAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = in.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("\n--- Final Account Details ---");
        account.displayAccount();

        in.close();
    }
}
