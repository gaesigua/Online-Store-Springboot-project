package com.gasigwatin.Online_Store_Springboot.project;

import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {

        System.out.println("PAYPAL");
        System.out.println("Amount: " + amount);

    }
}
