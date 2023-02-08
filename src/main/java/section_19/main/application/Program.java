package section_19.main.application;

import section_19.main.entities.Product;

import java.util.HashSet;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 900.00));
        set.add(new Product("Notebook", 1200.00));
        set.add(new Product("Table", 400.00));

        Product product = new Product("Notebook", 1200.00);

        System.out.println(set.contains(product));
    }
}
