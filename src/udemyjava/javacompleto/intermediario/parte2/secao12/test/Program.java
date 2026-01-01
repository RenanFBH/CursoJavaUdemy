package udemyjava.javacompleto.intermediario.parte2.secao12.test;

import udemyjava.javacompleto.intermediario.parte2.secao12.entities.Order;
import udemyjava.javacompleto.intermediario.parte2.secao12.entities.enums.OrderStatus;

import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {
        LocalDateTime d1 = LocalDateTime.parse("2007-09-28T18:30:00");
        Order order = new Order(1090, d1, OrderStatus.PENDING_PAYMENT);
        System.out.println(order);
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);
    }
}
