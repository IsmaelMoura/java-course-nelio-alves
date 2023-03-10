package section_14.exercises.ex04.application;

import section_14.exercises.ex04.entities.Company;
import section_14.exercises.ex04.entities.Individual;
import section_14.exercises.ex04.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char taxPayerType = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (taxPayerType == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println("\nTAXES PAID:");
        double totalTaxes = 0.0;
        for (TaxPayer taxPayer : list) {
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
            totalTaxes += taxPayer.tax();
        }

        System.out.printf("\nTOTAL TAXES: $ %.2f", totalTaxes);

        sc.close();
    }
}
