package com.ismael.moura.section_14.exercises.ex02.application;

import com.ismael.moura.section_14.exercises.ex02.entities.ImportedProduct;
import com.ismael.moura.section_14.exercises.ex02.entities.Product;
import com.ismael.moura.section_14.exercises.ex02.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char productType = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            if (productType == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                list.add(new ImportedProduct(name, price, customsFee));
            } else if (productType == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.nextLine());

                list.add(new UsedProduct(name, price, manufactureDate));
            } else {
                list.add(new Product(name, price));
            }
        }

        System.out.println("\nPRICE TAGS: ");
        for (Product product : list) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
