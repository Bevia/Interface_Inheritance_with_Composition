package com.corebaseit.bevia;

/**
 * Created by vbevia on 21/06/16.
 */
public class SavingsAccountImplementation implements Account{

    //Compose helper class via composition:
    AccountHelper accountHelper = new AccountHelperImplementation();

    @Override
    public double calculateInterest(double amount) {
        return amount * 0.03; //calculate interest for saving account
    }

    @Override
    public void deposit(double amount) {

        accountHelper.deposit(amount);//Code reuse via composition

    }

    @Override
    public void withdraw(double amount) {

        accountHelper.withdraw(amount);//Code reuse via composition

    }
}
