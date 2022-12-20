package com.ismael.moura;

import com.ismael.moura.entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter account holder: ");
        String holder = scanner.nextLine();


        System.out.print("Is there an initial deposit (y/n)? ");
        char response = scanner.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scanner.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        account.deposit(scanner.nextDouble());

        System.out.print("Updated account data: ");
        System.out.print(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        account.withdraw(scanner.nextDouble());

        System.out.print("Updated account data: ");
        System.out.print(account);

        scanner.close();
    }
}