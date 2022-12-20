/*
* Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
* mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
* os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
*/

package com.ismael.moura.section_10.exercises.vetores.abaixo_da_media.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] numbers;
        double sum = 0.0, average;

        System.out.print("Quantos elementos vão ter o vetor? ");
        numbers = new double[sc.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextDouble();
        }

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        average = sum / numbers.length;

        System.out.println("\nMÉDIA DO VETOR = " + average);
        System.out.println("Elementos abaixo da média: ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < average) {
                System.out.println(numbers[i]);
            }
        }

        sc.close();
    }
}
