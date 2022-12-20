/**
 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
 * terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
 * o vetor C gerado.
 */

package com.ismael.moura.section_10.exercises.vetores.soma_vetores.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] vectorA, vectorB, vectorC;

        System.out.print("Quantos valores vai ter cada vetor? ");
        vectorA = new int[sc.nextInt()];
        vectorB = new int[vectorA.length];
        vectorC = new int[vectorA.length];

        sc.nextLine();

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = sc.nextInt();
        }

        sc.nextLine();

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE");
        for (int i = 0; i < vectorB.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
            System.out.println(vectorC[i]);
        }


        sc.close();
    }
}
