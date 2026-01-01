package udemyjava.javacompleto.basico;

import java.util.Locale;
import java.util.Scanner;

public class Aula02 {

    public static void main(String[] args) {

        int hora;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que horas são? ");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia");
        } else if (hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("boa noite");
        }

        Locale.setDefault(Locale.US);
        int minutos;
        double preco = 50;
        System.out.print("Digite a quantidade de minutos: ");
        minutos = sc.nextInt();
        if (minutos > 100) {
            preco += (minutos - 100) * 2;
        }
        System.out.printf("\nConta: R$%.2f", preco);

        int dia;
        System.out.print("Digite o dia: ");
        dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }

        double precoProduto, descontoProduto, precoFinalProduto;
        precoProduto = 500;
        descontoProduto = precoProduto > 500 ? precoProduto * 0.15 : precoProduto * 0.05;
        precoFinalProduto = precoProduto - descontoProduto;
        System.out.printf("O preço final do produto é R$%.2f, com R$%.2f de desconto", precoFinalProduto, descontoProduto);

        sc.close();
    }

}