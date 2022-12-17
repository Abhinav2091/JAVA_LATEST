package com.modernjava.lambda.realexample;

@FunctionalInterface
public interface AccountFactory {
    BankAccount getBankDetails(int id, double balance, String accountName);

}
