package udemyjava.javacompleto.intermediario.parte2.exercicios.secao12.exercicio.test;

import udemyjava.javacompleto.intermediario.parte2.exercicios.secao12.exercicio.entities.Client;
import udemyjava.javacompleto.intermediario.parte2.exercicios.secao12.exercicio.entities.Order;
import udemyjava.javacompleto.intermediario.parte2.exercicios.secao12.exercicio.entities.OrderItem;
import udemyjava.javacompleto.intermediario.parte2.exercicios.secao12.exercicio.entities.Product;
import udemyjava.javacompleto.intermediario.parte2.exercicios.secao12.exercicio.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OrderTest01 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Client client = new Client();
        Product product = new Product();
        Order order = new Order();

        Client(client);
        OrderData(order, client);;
        OrderSumary(order);

        input.close();

    }

    public static void Client(Client client) {

        System.out.print("Enter client data:\n");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(input.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        client.setName(name);
        client.setEmail(email);
        client.setBirthDate(birthDate);

    }

    public static void OrderData(Order order, Client client) {

        System.out.print("\nEnter order data:\n");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(input.nextLine());
        System.out.print("How many items to this order? ");
        int quantityItems = input.nextInt();
        for (int i = 1; i <= quantityItems; i++) {
            System.out.print("Enter #" + i + " item data:\n");
            System.out.print("Product name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Product price: ");
            double price = input.nextDouble();
            System.out.print("Quantity: ");
            int quantity = input.nextInt();
            Product product = new Product(name, price);
            OrderItem orderItem = new OrderItem(product, quantity, price);
            order.addItem(orderItem);
        }
        order.setMoment(LocalDateTime.now());
        order.setStatus(orderStatus);
        order.setClient(client);

    }

    public static void OrderSumary(Order order) {

        System.out.println(order);

    }
}
