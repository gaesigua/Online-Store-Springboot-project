package com.gasigwatin.Online_Store_Springboot.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class OnlineStore {

	public static void main(String[] args) {
//		SpringApplication.run(OnlineStore.class, args);

	var orderService = new OrderService();

    orderService.setPaymentService(new PaypalPaymentService());

	orderService.placeOrder();
	}

}
