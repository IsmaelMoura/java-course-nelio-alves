/**
 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
 * que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
 * de homens.
 */

package com.ismael.moura.section_10.exercises.vetores.dados_pessoas.application;

import com.ismael.moura.section_10.exercises.vetores.dados_pessoas.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Person[] persons;
        char gender;
        double height;
        double maxHeight = Double.MIN_VALUE;
        double minHeight = Double.MAX_VALUE;
        double totalFemaleHeight = 0.0;
        double averageFemaleHeight;
        int minHeightIndex = 0, maxHeightIndex = 0, isFemaleCounter = 0, isMaleCounter = 0;

        System.out.print("Quantas pessoas serão digitadas: ");
        persons = new Person[sc.nextInt()];
        sc.nextLine();

        for (int i = 0; i < persons.length; i++) {
            System.out.printf("\nAltura da %da pessoa: ", i + 1);
            height = sc.nextDouble();
            sc.nextLine();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            gender = sc.next().toUpperCase().charAt(0);

            persons[i] = new Person(height, gender);

            sc.nextLine();
        }

        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getHeight() > maxHeight) {
                maxHeight = persons[i].getHeight();
                maxHeightIndex = i;
            }

            if (persons[i].getHeight() < minHeight) {
                minHeight = persons[i].getHeight();
                minHeightIndex = i;
            }

            if (persons[i].getGender() == 'F') {
                totalFemaleHeight += persons[i].getHeight();
                isFemaleCounter++;
            } else if (persons[i].getGender() == 'M') {
                isMaleCounter++;
            }
        }

        averageFemaleHeight = (totalFemaleHeight > 0) ? (totalFemaleHeight / (double) isFemaleCounter) : 0;

        System.out.printf("\nMENOR ALTURA = %.2f", persons[minHeightIndex].getHeight());
        System.out.printf("\nMAIOR ALTURA = %.2f", persons[maxHeightIndex].getHeight());
        System.out.printf("\nMÉDIA DAS ALTURAS DAS MULHERES = %.2f", averageFemaleHeight);
        System.out.print("\nNÚMERO DE HOMENS = " + isMaleCounter);

        sc.close();
    }
}
