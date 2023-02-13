package section_20.main.application;

import section_20.main.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        List<String> names = list.stream().map(product -> product.getName().toUpperCase()).toList();

        names.forEach(System.out::println);
    }
}
