package Day_14;

abstract class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String name, double balance) {
        this.accountHolder = name;
        this.balance = balance;
    }

    abstract void calculateInterest();

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Savings Interest: " + interest);
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    void calculateInterest() {
        System.out.println("No interest for Current Account");
    }
}

public class Bank {
    public static void main(String[] args) {

    }
}