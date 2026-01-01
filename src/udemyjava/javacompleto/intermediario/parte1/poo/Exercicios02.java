package udemyjava.javacompleto.intermediario.parte1.poo;

import udemyjava.javacompleto.intermediario.parte1.util.CurrencyConverter;
import java.util.Scanner;

public class Exercicios02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price? ");
        CurrencyConverter.dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.dollarsWillBeBought = sc.nextDouble();
        double reais = CurrencyConverter.paidInReais();
        System.out.printf("Amount to be paid in reais = R$ %.2f", reais);
        sc.close();

    }

}
