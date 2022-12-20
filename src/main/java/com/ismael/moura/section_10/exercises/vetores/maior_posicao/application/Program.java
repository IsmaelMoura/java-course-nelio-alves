package com.ismael.moura.section_10.exercises.vetores.maior_posicao.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] numbers;
        double max = Double.MIN_VALUE;
        int index = 0;

        System.out.print("Quanto números você vai digitar? ");
        numbers = new double[sc.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextDouble();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                index = i;
            }
        }

        System.out.println("\nMAIOR VALOR " + max);
        System.out.println("POSICAO DO MAIOR VALOR = " + index);

        sc.close();
    }
}
