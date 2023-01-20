/**
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
 * N funcionários. Não deve haver repetição de id.
 * <p>
 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
 * Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
 * mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
 * conforme exemplos.
 * <p>
 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
 * ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
 * aumento por porcentagem dada.
 */

package section_10.exercises.vetores.exercicio_de_fixacao_2.application;

import org.jetbrains.annotations.NotNull;
import section_10.exercises.vetores.exercicio_de_fixacao_2.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee #" + (i + 1));
            System.out.print("Id: ");
            int id = sc.nextInt();

            while (hasId(employees, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine().trim();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));

            sc.nextLine();
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee result = employees
                .stream()
                .filter(employee -> id == employee.getId())
                .findFirst()
                .orElse(null);

        if (result == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            result.increaseSalary(percentage);
        }


        System.out.println("\nList of employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        sc.close();
    }

    public static boolean hasId(@NotNull List<Employee> list, int id) {
        Employee emp = list.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
