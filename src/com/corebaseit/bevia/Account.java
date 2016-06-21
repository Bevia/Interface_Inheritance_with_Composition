package com.corebaseit.bevia;

/**
 * Created by vbevia on 21/06/16.
 */
public interface Account {

    double calculateInterest(double amount);
    void deposit(double amount);
    void withdraw(double amount);
}
