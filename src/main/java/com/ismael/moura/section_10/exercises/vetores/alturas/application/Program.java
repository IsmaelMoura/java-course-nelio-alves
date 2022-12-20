package com.ismael.moura.section_10.exercises.vetores.alturas.application;

import com.ismael.moura.section_10.exercises.vetores.alturas.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double totalHeight = 0.0;
        int peopleUnder16Counter = 0;

        System.out.print("Quantas pessoas serão digitas? ");
        Person[] people = new Person[sc.nextInt()];
        sc.nextLine();

        for (int i = 0; i < people.length; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            String name = sc.next();

            System.out.print("Idade: ");
            int age = sc.nextInt();

            System.out.print("Altura: ");
            double height = sc.nextDouble();

            people[i] = new Person(name, age, height);

            sc.nextLine();
        }

        String[] peopleUnder16Names = new String[people.length];

        for (int i = 0; i < people.length; i++) {
            totalHeight += people[i].getHeight();

            if (people[i].getAge() < 16)   {
                peopleUnder16Counter++;
                peopleUnder16Names[i] = people[i].getName();
            }
        }

        double heightAverage = totalHeight / people.length;
        double under16Percentage = ((double) peopleUnder16Counter / people.length) * 100.0;

        System.out.println();
        System.out.printf("Altura média: %.2f\n", heightAverage);
        System.out.println("Pessoas com menos de 16 anos: " + under16Percentage + "%");

        for (int i = 0; i < peopleUnder16Names.length; i++) {
            if (peopleUnder16Names[i] != null) {
                System.out.println(peopleUnder16Names[i]);
            }
        }

    }
}
