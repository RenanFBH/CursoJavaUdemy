package udemyjava.javacompleto.intermediario.parte1.poo;

import udemyjava.javacompleto.intermediario.parte1.entities.Product2;

import java.util.Locale;
import java.util.Scanner;

public class Aula12 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product2[] vect = new Product2[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product2(name, price);
        }
        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;
        System.out.printf("AVERAGE PRICE: %.2f%n", avg);

        sc.close();

    }

}
