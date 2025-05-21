package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finterface.Valuable;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pamela", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "456", 1500);

        double result = account1.deposit(100);
        System.out.println(result);
//        account2.deposit(100)
    }
}
