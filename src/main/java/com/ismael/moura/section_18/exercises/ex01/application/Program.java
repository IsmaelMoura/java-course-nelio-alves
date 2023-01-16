package com.ismael.moura.section_18.exercises.ex01.application;

import com.ismael.moura.section_18.exercises.ex01.model.entities.CarRental;
import com.ismael.moura.section_18.exercises.ex01.model.entities.Vehicle;
import com.ismael.moura.section_18.exercises.ex01.model.services.BrazilTaxService;
import com.ismael.moura.section_18.exercises.ex01.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data: ");
        System.out.print("Car model: ");
        String carModel = sc.nextLine().trim();

        System.out.print("Pickup (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine().trim(), dateFormatter);

        System.out.print("Return (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine().trim(), dateFormatter);

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();

        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println("\nINVOICE: ");
        System.out.println("Basic payment: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

        sc.close();
    }
}
