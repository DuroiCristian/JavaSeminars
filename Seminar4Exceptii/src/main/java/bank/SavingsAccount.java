package bank;

import exceptions.InsufficientFundsException;
import exceptions.InvalidAmountException;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(String owner,
                          double balance,
                          double interestRate) {

        super(owner, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {

        balance += balance * interestRate;
        System.out.println("Interest added");
    }

    @Override
    public void withdraw(double amount)
            throws InvalidAmountException, InsufficientFundsException {

        System.out.println("Savings account withdrawal");

        super.withdraw(amount);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}