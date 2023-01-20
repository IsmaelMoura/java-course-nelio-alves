/*
* Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
* devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
* da pessoa mais velha.
*/

package section_10.exercises.vetores.mais_velho.application;

import section_10.exercises.vetores.mais_velho.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Person[] person;
        String name;
        int age, index = 0, maxAge = Integer.MIN_VALUE;

        System.out.print("Quantas pessoas você vai digitar? ");
        person = new Person[sc.nextInt()];
        sc.nextLine();

        for (int i = 0; i < person.length; i++) {
            System.out.printf("Dados da %da pessoa", i + 1);
            System.out.print("\nNome: ");
            name = sc.nextLine();
            System.out.print("Idade: ");
            age = sc.nextInt();

            person[i] = new Person(name, age);

            sc.nextLine();
        }

        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() > maxAge) {
                maxAge = person[i].getAge();
                index = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + person[index].getName());

        sc.close();
    }
}
