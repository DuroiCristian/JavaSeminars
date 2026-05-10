package bank;

import exceptions.InsufficientFundsException;
import exceptions.InvalidAmountException;

public class BankApp {

    public static void main(String[] args) {

        BankAccount b1 =
                new BankAccount("Cristi", 1000);

        SavingsAccount s1 =
                new SavingsAccount("Alex", 2000, 0.10);

        try {

            b1.deposit(500);
            b1.withdraw(200);

            System.out.println(b1);

            s1.addInterest();
            s1.withdraw(300);

            System.out.println(s1);

            b1.withdraw(5000);

        } catch (InvalidAmountException e) {

            System.out.println(e.getMessage());

        } catch (InsufficientFundsException e) {

            System.out.println(e.getMessage());
        }
    }
}