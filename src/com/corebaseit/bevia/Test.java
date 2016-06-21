package com.corebaseit.bevia;

/**
 * By Vincent Bevia 2016
 * Source:
 */

public class Test {

    public static void main(String[] args) {


        // use of polymorphism:
        Account account1 = new SavingsAccountImplementation();
        account1.deposit(150);

        Account account2 = new DepositAccountImplementation();
        account2.deposit(500);

        account1.withdraw(25);
        account2.withdraw(450);

        double calculateInterestAccount1 = account1.calculateInterest(100.0);
        double calculateInterestAccount2 = account2.calculateInterest(100.0);

        System.out.println("Savings interest rate: " + calculateInterestAccount1 + "%");
        System.out.println("Deposit interest rate: " + calculateInterestAccount2 + "%");

        System.out.println("Savings return calculation: " + account1.calculateInterest(125) + "$");

    }

    /**
     * Output:
     *
     depositing 150.0
     depositing 500.0
     withdrawing  25.0
     withdrawing  450.0
     Savings interest rate: 3.0%
     Deposit interest rate: 5.0%
     Savings return calculation: 3.75$
     *
     */
}
