package day9.q2;

import javax.naming.InsufficientResourcesException;

public class SavingAccount {
    int accountNumber;
    double balance;

public void deposit(double amount){
balance = amount;
}

public double withdraw(double amount) throws InsufficientResourcesException{
    if(amount>balance){

        InsufficientResourcesException If = new InsufficientResourcesException("Insufficient Amount in the Account");
        throw If;
    }
    return amount;
}
}

