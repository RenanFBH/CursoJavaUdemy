package udemyjava.javacompleto.intermediario.parte2.exercicios.secao13.test;

import udemyjava.javacompleto.intermediario.parte2.exercicios.secao13.entities.ImportedProduct;
import udemyjava.javacompleto.intermediario.parte2.exercicios.secao13.entities.Product;
import udemyjava.javacompleto.intermediario.parte2.exercicios.secao13.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProductTest01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        writeProducts(input, products);
        readProducts(products);

        input.close();

    }

    public static void writeProducts(Scanner input, List<Product> products) {

        System.out.print("Enter the number of products: ");
        int qtyProducts = input.nextInt();
        for (int i = 1; i <= qtyProducts; i++) {
            System.out.print("\nProduct #" + i + " data:\n");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = input.next().charAt(0);
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Price: ");
            double price = input.nextDouble();
            switch (type) {
                case 'c':
                    Product product = new Product(name, price);
                    products.add(product);
                    break;
                case 'u' :
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    input.nextLine();
                    String manufactureDate = input.nextLine();
                    LocalDate date = LocalDate.parse(manufactureDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    UsedProduct usedProduct = new UsedProduct(name, price, date);
                    products.add(usedProduct);
                    break;
                case 'i':
                    System.out.print("Customs fee: ");
                    double customsFee = input.nextDouble();
                    ImportedProduct importedProduct = new ImportedProduct(name, price, customsFee);
                    products.add(importedProduct);
                    break;
                default:
                    System.out.println("Tipo inválido");
                    break;
            }
        }

    }

    public static void readProducts(List<Product> products) {

        System.out.print("\nPRICE TAGS:\n");
        for(Product product : products) {
            System.out.println(product.priceTag());
        }

    }

}
