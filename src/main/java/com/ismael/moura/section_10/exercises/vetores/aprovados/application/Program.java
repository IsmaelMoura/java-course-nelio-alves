/**
 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
 * no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
 * os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
 * igual a 6.0 (seis).
 */

package com.ismael.moura.section_10.exercises.vetores.aprovados.application;

import com.ismael.moura.section_10.exercises.vetores.aprovados.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student[] students;
        String name;
        double firstGrade, secondGrade;


        System.out.print("Quantos alunos serão digitados? ");
        students = new Student[sc.nextInt()];
        sc.nextLine();

        for (int i = 0; i < students.length; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
            name = sc.nextLine();
            firstGrade = sc.nextDouble();
            secondGrade = sc.nextDouble();

            students[i] = new Student(name, firstGrade, secondGrade);

            sc.nextLine();
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getAverage() >= 6) {
                System.out.println(students[i].getName());
            }
        }


        sc.close();
    }
}
