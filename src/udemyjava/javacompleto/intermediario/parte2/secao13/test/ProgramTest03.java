package udemyjava.javacompleto.intermediario.parte2.secao13.test;

import udemyjava.javacompleto.intermediario.parte2.secao13.entities.Account;
import udemyjava.javacompleto.intermediario.parte2.secao13.entities.SavingsAccount;

public class ProgramTest03 {
    public static void main(String[] args) {
        Account x = new Account(1, "Teste1", 1000);
        Account y = new SavingsAccount(2, "Teste2", 1000, 0.01);
        x.withdraw(50);
        y.withdraw(50);
        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
