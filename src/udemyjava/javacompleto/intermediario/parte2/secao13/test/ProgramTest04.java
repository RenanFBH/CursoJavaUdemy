package udemyjava.javacompleto.intermediario.parte2.secao13.test;

import udemyjava.javacompleto.intermediario.parte2.secao13.entities.Account;
import udemyjava.javacompleto.intermediario.parte2.secao13.entities.BusinessAccount;
import udemyjava.javacompleto.intermediario.parte2.secao13.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class ProgramTest04 {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1, "Teste1", 500, 0.01));
        list.add(new BusinessAccount(2, "Teste2", 1000, 400));
        list.add(new SavingsAccount(3, "Teste3", 300, 0.01));
        list.add(new BusinessAccount(4, "Teste4", 500, 500));

        double sum = 0;
        for (Account account : list) {
            sum += account.getBalance();
        }

        System.out.printf("Total balance: $%.2f%n", sum);

        for (Account account : list) {
            account.deposit(10);
        }

        for (Account account : list) {
            System.out.printf("Updated balance for account %d, %.2f%n", account.getNumber(), account.getBalance());
        }


    }
}
