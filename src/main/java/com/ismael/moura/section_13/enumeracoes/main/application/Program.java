package com.ismael.moura.section_13.enumeracoes.main.application;

import com.ismael.moura.section_13.enumeracoes.main.entities.Order;
import com.ismael.moura.section_13.enumeracoes.main.entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        // converter String para o tipo enum
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
