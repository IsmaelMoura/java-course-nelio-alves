package section_19.main.application;

import section_19.main.entities.Product;

import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {
        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV", 900.00));
        set.add(new Product("Notebook", 1200.00));
        set.add(new Product("Table", 400.00));

        for (Product product : set) {
            System.out.println(product);
        }
    }
}
