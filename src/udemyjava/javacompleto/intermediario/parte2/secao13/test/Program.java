package udemyjava.javacompleto.intermediario.parte2.secao13.test;

import udemyjava.javacompleto.intermediario.parte2.secao13.entities.Account;
import udemyjava.javacompleto.intermediario.parte2.secao13.entities.BusinessAccount;
import udemyjava.javacompleto.intermediario.parte2.secao13.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {


        /***
         * UPCASTING
         *
         * A variável de referência do tipo superclasse recebe um objeto herdado do tipo subclasse;
         */
        Account account1 = new Account(1, "Teste1", 0);
        BusinessAccount businessAccount = new BusinessAccount(2, "Teste2", 0, 500);
        Account account2 = businessAccount;
        Account account3 = new BusinessAccount(3, "Teste3", 0, 200);
        Account account4 = new SavingsAccount(4, "Teste4", 0, 0.1);

        /***
         * DOWNCASTING
         *
         * O objeto herdado com a variável de referência tipo superclasse retorna para uma variável de referência do tipo subclasse
         */
        BusinessAccount account5 = (BusinessAccount) account3;
        account5.loan(100);
        //BusinessAccount account6 = (BusinessAccount) account4;
        if(account4 instanceof BusinessAccount) {
            BusinessAccount account6 = (BusinessAccount) account4;
            account6.loan(100);
            System.out.println("Empréstimo");
        }
        if(account4 instanceof SavingsAccount) {
            SavingsAccount account7 = (SavingsAccount) account4;
            account7.updateBalance();
            System.out.println("Update!");
        }


    }
}
