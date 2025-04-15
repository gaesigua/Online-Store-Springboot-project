package com.gasigwatin.Online_Store_Springboot.project;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Amount : " + amount);
    }
}
