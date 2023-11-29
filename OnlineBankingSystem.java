import java.io.*;
import java.util.Scanner;

// BankAccount class representing a user's bank account
class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor to initialize the bank account
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current balance: $" + balance);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: $" + balance);
    }
}

// Bank class managing multiple bank accounts
class Bank {
    private BankAccount[] accounts;
    private int totalAccounts;

    // Constructor to initialize the bank
    public Bank() {
        accounts = new BankAccount[10]; // Assuming a maximum of 10 accounts
        totalAccounts = 0;
    }

    // Method to add a new account to the bank
    public void addAccount(String accountNumber, String accountHolder, double balance) {
        if (totalAccounts < accounts.length) {
            accounts[totalAccounts] = new BankAccount(accountNumber, accountHolder, balance);
            totalAccounts++;
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Maximum accounts limit reached. Cannot create a new account.");
        }
    }

    // Method to find an account based on the account number
    private BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account != null && account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    // Method to perform banking operations
    public void performBankOperations() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nBank Operations Menu:");
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Display Account Information");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNumber = scanner.next();
                    System.out.print("Enter Account Holder Name: ");
                    String accHolder = scanner.next();
                    System.out.print("Enter Initial Balance: $");
                    double initialBalance = scanner.nextDouble();
                    addAccount(accNumber, accHolder, initialBalance);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    String depositAccNumber = scanner.next();
                    BankAccount depositAccount = findAccount(depositAccNumber);
                    if (depositAccount != null) {
                        System.out.print("Enter Deposit Amount: $");
                        double depositAmount = scanner.nextDouble();
                        depositAccount.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found. Deposit failed.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    String withdrawAccNumber = scanner.next();
                    BankAccount withdrawAccount = findAccount(withdrawAccNumber);
                    if (withdrawAccount != null) {
                        System.out.print("Enter Withdrawal Amount: $");
                        double withdrawAmount = scanner.nextDouble();
                        withdrawAccount.withdraw(withdrawAmount);
                    } else {
System.out.println("Account not found. Withdrawal failed.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    String displayAccNumber = scanner.next();
                    BankAccount displayAccount = findAccount(displayAccNumber);
                    if (displayAccount != null) {
                        displayAccount.displayAccountInfo();
                    } else {
                        System.out.println("Account not found. Display failed.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Bank Operations. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 5);

        scanner.close();
    }
}

// Main class representing the entry point of the program
public class OnlineBankingSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.performBankOperations();
    }
}