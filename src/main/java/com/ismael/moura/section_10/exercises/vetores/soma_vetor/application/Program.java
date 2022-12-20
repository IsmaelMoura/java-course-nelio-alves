/**
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
 * - Imprimir todos os elementos do vetor
 * - Mostrar na tela a soma e a média dos elementos do vetor
 */

package com.ismael.moura.section_10.exercises.vetores.soma_vetor.application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        double[] numbers = new double[sc.nextInt()];
        sc.nextLine();

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextDouble();
        }

        System.out.print("VALORES = " + Arrays.toString(numbers));

        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println();
        System.out.printf("SOMA: %.2f%n", sum);
        System.out.printf("MÉIDA: %.2f", sum / numbers.length);

        sc.close();
    }
}
