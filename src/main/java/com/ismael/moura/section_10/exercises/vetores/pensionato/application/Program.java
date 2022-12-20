package com.ismael.moura.section_10.exercises.vetores.pensionato.application;

import com.ismael.moura.section_10.exercises.vetores.pensionato.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] rents = new Rent[10];
        String name;
        String email;
        int roomNumber;


        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nRent #:" + (i + 1));
            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Email: ");
            email = sc.nextLine();

            System.out.print("Room: ");
            roomNumber = sc.nextInt();

            rents[roomNumber] = new Rent(name, email);

            sc.nextLine();
        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < rents.length; i++) {
            if (rents[i] != null) {
                System.out.println(i + ": " + rents[i]);
            }
        }

        sc.close();
    }
}
