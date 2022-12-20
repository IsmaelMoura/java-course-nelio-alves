/**
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
 * tela todos os números pares, e também a quantidade de números pares.
 */

package com.ismael.moura.section_10.exercises.vetores.numeros_pares.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numbers;
        int evenNumbers = 0;

        System.out.print("Quantos número você vai digitar? ");
        numbers = new int[sc.nextInt()];
        sc.nextLine();

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nNÚMERO PARES:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.printf("%d  ", numbers[i]);
                evenNumbers++;
            }
        }

        System.out.print("\n\nQUANTIDADE DE PARES = " + evenNumbers);


        sc.close();
    }
}
