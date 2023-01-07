package com.ismael.moura.section_13.enumeracoes.exercises.ex03.model.entities;

import com.ismael.moura.section_13.enumeracoes.main.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private final Date moment = new Date();
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
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

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder()
                .append("Order moment: ")
                .append(sdf.format(moment))
                .append('\n')
                .append("Order status: ")
                .append(status)
                .append('\n')
                .append(client)
                .append('\n')
                .append("Order items: ")
                .append('\n');
        for (OrderItem item : items) {
            stringBuilder.append(item)
                    .append('\n');
        }
        stringBuilder
                .append("Total price: $")
                .append(String.format("%.2f", total()));
        return stringBuilder.toString();
    }
}