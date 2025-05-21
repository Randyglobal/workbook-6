package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finterface.Valuable;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pamela", "123", 12500);
//        cannot create an instance of an interface
        Valuable account2 = new BankAccount("Gary", "456", 1500);

        double result = account1.deposit(100);
        String defaultAnswer = account1.payment();
        System.out.println(result);
        System.out.println(defaultAnswer);
//        account2.deposit(100)
    }
}
