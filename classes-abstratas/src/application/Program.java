package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

      List<Account> accountList = new ArrayList<>();

      accountList.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
      accountList.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
      accountList.add(new SavingsAccount(1004, "Bob", 300.00, 0.01));
      accountList.add(new BusinessAccount(1005, "Ana", 500.00, 500.00));

      double sum = 0.0;

        for (Account acc : accountList) {
            sum += acc.getBalance();
        }
        System.out.println("Total balance: " + String.format("%.2f", sum));

        for (Account acc : accountList) {
            acc.deposit(10.00);
            System.out.println("Updated balance for account: " + acc.getNumber() + " = " + acc.getBalance());
        }


    }
}
