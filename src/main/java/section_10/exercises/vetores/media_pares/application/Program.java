/*
* Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
* aritmética somente dos números pares lidos, com 1 casa decimal. Se nenhum número par for
* digitado, mostrar a mensagem "NENHUM NÚMERO PAR"
*/
package section_10.exercises.vetores.media_pares.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numbers;
        int evenNumbersCount = 0;
        double evenNumbers = 0.0;

        System.out.print("Quantos elementos vão ter o vetor? ");
        numbers = new int[sc.nextInt()];
        sc.nextLine();

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers += numbers[i];
                evenNumbersCount++;
            }
        }

        if (evenNumbersCount != 0) {
            System.out.printf("MÉDIA DOS PARES = %.1f", (evenNumbers / evenNumbersCount));
        } else {
            System.out.println("NENHUM NÚMERO PAR");
        }

        sc.close();
    }
}
