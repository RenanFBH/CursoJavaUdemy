package udemyjava.javacompleto.intermediario.parte1.poo;

import java.util.Locale;
import java.util.Scanner;

import udemyjava.javacompleto.intermediario.parte1.entities.Account;

public class Exercicios03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc1;
        System.out.print("\nInforme o número da conta: ");
        int idAccount = sc.nextInt();
        System.out.print("Informe o nome de usuário: ");
        sc.nextLine();
        String userName = sc.nextLine();
        System.out.print("Deseja informar um depósito inicial? (s/n) ");
        char vResp = sc.next().charAt(0);
        if (vResp == 's') {
            System.out.print("Informe o valor do depósito incial: ");
            double balance = sc.nextDouble();
            acc1 = new Account(idAccount, userName, balance);
        } else {
            acc1 = new Account(idAccount, userName);
        }
        System.out.print(acc1.getdata());
        menu(acc1);
        sc.close();

    }

    public static void menu(Account acc1) {

        Scanner sc = new Scanner(System.in);
        int option = -1;
        while (option != 0) {
            System.out.println("\n\n------------BANCO------------");
            System.out.println("[1] Consultar dados da conta");
            System.out.println("[2] Depositar");
            System.out.println("[3] Sacar");
            System.out.println("[4] Alterar nome de usuário");
            System.out.println("[0] Sair");
            System.out.print("Selecione a opção: ");
            option = sc.nextInt();
            String report;
            double money;
            switch (option) {
                case 1:
                    System.out.println(acc1.getdata());
                    break;
                case 2:
                    System.out.println("\nInsira o depósito: ");
                    money = sc.nextDouble();
                    acc1.addBalance(money);
                    System.out.println(acc1.getdata());
                    break;
                case 3:
                    System.out.println("\nInsira o saque: ");
                    money = sc.nextDouble();
                    acc1.removeBalance(money);
                    System.out.println(acc1.getdata());
                    break;
                case 4:
                    System.out.println("\nInsira o novo nome de usuário: ");
                    String userName = sc.next();
                    acc1.setUserName(userName);
                    System.out.println(acc1.getdata());
                    break;
                case 0:
                    System.out.println("\nAté Breve!");
                    break;
                default:
                    System.out.println("\nValor inválido!");
                    break;

            }

        }
        sc.close();

    }

}
