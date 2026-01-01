package udemyjava.javacompleto.intermediario.parte2.exercicios.secao12.exercicio.entities;

import udemyjava.javacompleto.intermediario.parte2.exercicios.secao12.exercicio.entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order() {
    }

    public Order(LocalDateTime moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nORDER SUMARY:\n");
        sb.append("Order moment: " + this.moment.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n");
        sb.append("Order status: " + this.status + "\n");
        sb.append("Client: " + this.client.getName() + " (" + this.client.getBirthDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ") ");
        sb.append("- " + this.client.getEmail() + "\n");
        sb.append("Order items:\n");
        for(OrderItem item : orderItems) {
            sb.append(item.getProduct().getName() + ", $" + item.getPrice());
            sb.append(", Quantity: " + item.getQuantity());
            sb.append(", Subtotal: $" + item.subTotal() + "\n");
        }
        return sb.toString();
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public double total() {
        return 0.0;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
}
