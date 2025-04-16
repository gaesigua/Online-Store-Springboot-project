package com.gasigwatin.Online_Store_Springboot.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class OnlineStore {

	public static void main(String[] args) {

		//This run method below returns a method of type ApplicationContext; ApplicationContext is our IOC Container; so let's save it into a ApplicationContext

		ApplicationContext context = SpringApplication.run(OnlineStore.class, args);

		//Within that ApplicationContext, it has a method called getBean, now let's use that method to call our class OrderService, and then save it into a variable
		//this is a preferred method of calling the class, instead of creating an instance of the class (check below below)

		var orderService = context.getBean(OrderService.class);


		//	var orderService = new OrderService();
		//    orderService.setPaymentService(new PaypalPaymentService());
		// 	orderService.placeOrder();
	}

}
