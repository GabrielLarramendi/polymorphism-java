package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        // UPCASTING Account -> BusinessAccount

        Account acc1 = bacc; //BusinessAccount é uma Account, por isso é possível atribui-la a uma
                             //variavel tipo Account;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2; //acc2 é tipo Account, pos isso é necessário fzr o downcast;
        acc4.loan(100.00);

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        // O compilador não sabe que acc3 recebe savingsAccount. O erro só irá aparecer quando rodar o código;
        // Formas de verificar se uma variável é de um tipo

        //                     ||
        //                     ||
        //                     ||
        //                     ||
        //                    \  /
        //                     \/

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
