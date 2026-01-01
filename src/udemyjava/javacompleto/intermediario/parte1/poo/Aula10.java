package udemyjava.javacompleto.intermediario.parte1.poo;

import java.util.Scanner;
import udemyjava.javacompleto.intermediario.parte1.entities.Product;


public class Aula10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite os dados do produto (nome, preço e quantidade): ");
        String name = sc.next();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();
        Product p1 = new Product(name, price);
        System.out.printf("\nName: %s%nPrice: R$ %.2f%nQuantity in stock: %d", p1.getName(), p1.getPrice(), p1.getQuantity());
        System.out.print("\n\nQual o número de produtos que devem ser adicionados no estoque? ");
        p1.addProducts(sc.nextInt());
        System.out.println("\nProduct data: " + p1);
        System.out.print("\nQual o número de produtos que devem ser removidos? ");
        p1.removeProducts(sc.nextInt());
        System.out.println("\nProduct data: " + p1);
        sc.close();

    }

}
