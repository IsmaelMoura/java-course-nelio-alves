package com.ismael.moura.section_13.enumeracoes.exercises.ex03.application;

import com.ismael.moura.section_13.enumeracoes.exercises.ex03.model.entities.Client;
import com.ismael.moura.section_13.enumeracoes.exercises.ex03.model.entities.Order;
import com.ismael.moura.section_13.enumeracoes.exercises.ex03.model.entities.OrderItem;
import com.ismael.moura.section_13.enumeracoes.exercises.ex03.model.entities.Product;
import com.ismael.moura.section_13.enumeracoes.main.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.nextLine());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String orderStatus = sc.nextLine();
        Order order = new Order(OrderStatus.valueOf(orderStatus), client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" + (i + 1) + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem item =  new OrderItem(quantity, productPrice, product);
            order.addItem(item);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}
