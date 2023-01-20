package section_17.exercise.application;

import section_17.exercise.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        File sourceFile = new File(sc.nextLine().trim());
        String targetPath = sourceFile.getParent() + "\\out";
        File targetFile = new File(targetPath + "\\summary.csv");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile))) {
            String readLine = bufferedReader.readLine();
            List<String> sourceList = new ArrayList<>();
            List<Product> products = new ArrayList<>();


            while (readLine != null) {
                sourceList.add(readLine);
                readLine = bufferedReader.readLine();
            }

            for (String line : sourceList) {
                String[] fields = line.split(",");

                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                products.add(new Product(name, price, quantity));
            }

            new File(targetPath).mkdir();

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile))) {
                for (Product product : products) {
                    bufferedWriter.write(product.getName() + "," + product.total());
                    bufferedWriter.newLine();
                }
                System.out.println(targetFile.getName() + " was created successfully! Path: " + targetFile);
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        sc.close();
    }
}
