package com.ismael.moura.section_18.exercises.ex02.model.services;

public interface OnlinePaymentService {
    double paymentFee(double amount);
    double interest(double amount, int months);
}
