package section_18.exercises.ex01.model.services;

import section_18.exercises.ex01.model.entities.CarRental;
import section_18.exercises.ex01.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private final Double pricePerHour;
    private final Double pricePerDay;

    private final TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;
        double days = hours / 24.0;

        double basicPayment = hours <= 12.0 ? pricePerHour * Math.ceil(hours) : pricePerDay * Math.ceil(days);
        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
