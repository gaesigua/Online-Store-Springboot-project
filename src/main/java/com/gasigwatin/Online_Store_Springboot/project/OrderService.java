package com.gasigwatin.Online_Store_Springboot.project;

public class OrderService {

    private PaymentService paymentService;

//    public OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder() {

       paymentService.processPayment(20);

    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
