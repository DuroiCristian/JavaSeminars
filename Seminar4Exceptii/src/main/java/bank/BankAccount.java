package bank;

import exceptions.InsufficientFundsException;
import exceptions.InvalidAmountException;

public class BankAccount {

    protected String owner;
    protected double balance;

    public BankAccount() {
    }

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be positive");
        }

        balance += amount;
        System.out.println(amount + " deposited");
    }

    public void withdraw(double amount)
            throws InvalidAmountException, InsufficientFundsException {

        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be positive");
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Not enough money");
        }

        balance -= amount;
        System.out.println(amount + " withdrawn");
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}