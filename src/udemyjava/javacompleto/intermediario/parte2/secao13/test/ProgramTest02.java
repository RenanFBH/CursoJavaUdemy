package udemyjava.javacompleto.intermediario.parte2.secao13.test;

import udemyjava.javacompleto.intermediario.parte2.secao13.entities.Account;
import udemyjava.javacompleto.intermediario.parte2.secao13.entities.BusinessAccount;
import udemyjava.javacompleto.intermediario.parte2.secao13.entities.SavingsAccount;

public class ProgramTest02 {
    public static void main(String[] args) {

        //Account account1 = new Account(1, "Teste1", 1000);
        //account1.withdraw(200);
        //System.out.println(account1.getBalance());

        Account account2 = new SavingsAccount(2, "Teste2", 1000, 0.01);
        account2.withdraw(200);
        System.out.println(account2.getBalance());

        Account account3 = new BusinessAccount(3, "Teste3", 1000, 500);
        account3.withdraw(200);
        System.out.println(account3.getBalance());


    }
}
