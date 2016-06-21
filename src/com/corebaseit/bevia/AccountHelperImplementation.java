package com.corebaseit.bevia;

/**
 * Created by vbevia on 21/06/16.
 */
public class AccountHelperImplementation implements AccountHelper{

    @Override
    public void deposit(double amount) {

        System.out.println("depositing " + amount);

    }

    @Override
    public void withdraw(double amount) {

        System.out.println("withdrawing  " + amount);

    }
}
