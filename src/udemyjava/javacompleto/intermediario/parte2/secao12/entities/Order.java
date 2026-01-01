package udemyjava.javacompleto.intermediario.parte2.secao12.entities;

import udemyjava.javacompleto.intermediario.parte2.secao12.entities.enums.OrderStatus;

import java.time.LocalDateTime;

public class Order {

    private Integer id;
    private LocalDateTime moment;
    private OrderStatus orderStatus;

    public Order(Integer id, LocalDateTime moment, OrderStatus orderStatus) {
        this.id = id;
        this.moment = moment;
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", orderStatus=" + orderStatus +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
