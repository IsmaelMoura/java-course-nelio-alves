/**
 * A dona de um pensionato possui dez quartos para alugar para estudantes,
 * sendo esses quartos identificados pelos números 0 a 9.
 *
 * Fazer um programa que inicie com todos os dez quartos vazios, e depois
 * leia uma quantidade N representando o número de estudantes que vão
 * alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
 * N estudantes. Para cada registro de aluguel, informar o nome e email do
 * estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
 * que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
 * um relatório de todas ocupações do pensionato, por ordem de quarto.
 */

package section_10.exercises.vetores.pensionato.application;

import section_10.exercises.vetores.pensionato.entities.Rent;

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
