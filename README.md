# Urooj-Fatima-41
Urooj Fatima Dahri 
Assignment 2:
1.BankAccount Class:
•	Represents a bank account with attributes: accountNumber, accountHolder, and balance.
•	Constructor initializes the account.
•	Getter methods provide access to account details.
•	Methods include deposit to add money, withdraw to subtract money (with checks for sufficient funds), and displayAccountInfo to show account details.
2.	Bank Class:
•	Manages multiple bank accounts using an array (BankAccount[] accounts) with a maximum limit of 10.
•	Constructor initializes the array and total account count.
•	addAccount method adds a new account.
•	findAccount method searches for an account based on the account number.
•	performBankOperations method implements a menu-driven interface for users to:
•	Create a new account.
•	Deposit money into an account.
•	Withdraw money from an account.
•	Display account information.
•	Exit the program.
3.	Main Class (OnlineBankingSystem):
•	Contains the main method, the entry point of the program.
•	Creates an instance of the Bank class.
•	Invokes the performBankOperations method, allowing users to interact with the banking system.
4.	User Interaction:
•	The program uses a Scanner to receive user input for various banking operations.
•	Displays a menu with options for different operations.
5.	Looping:
•	The program runs in a loop until the user chooses to exit.
6.	Error Handling:
•	Checks for invalid choices and provides appropriate messages.
•	Handles cases where an account is not found during deposit, withdrawal, or display operations.
7.	Closing Resources:
•	Closes the Scanner at the end of the program to free up system resources.
This program creates a simple online banking system where users can manage accounts by creating new accounts, depositing and withdrawing money, and viewing account details. If you have specific questions or if there's anything you'd like to modify or add, feel free to ask!
