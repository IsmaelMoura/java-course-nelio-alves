package com.ismael.moura.section_10.main.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal:");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();

        int negativeNumbers = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    negativeNumbers++;
                }
            }
        }

        System.out.println("Negative numbers = " + negativeNumbers);
        System.out.println("Matriz length = " + matriz.length);
        System.out.println("Columns length = " + matriz[0].length);

        sc.close();
    }
}
