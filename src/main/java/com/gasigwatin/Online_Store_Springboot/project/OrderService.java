package com.gasigwatin.Online_Store_Springboot.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private PaymentService paymentService;

//    @Autowired (this is usually used when you have more than one constructor, but since we only have one constructor, we don't need to use it)

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {

       paymentService.processPayment(20);

    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
