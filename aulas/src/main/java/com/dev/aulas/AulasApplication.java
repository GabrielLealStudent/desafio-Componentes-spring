package com.dev.aulas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.dev.services.Order;
import com.dev.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.dev"})
public class AulasApplication implements CommandLineRunner {

	private OrderService orderService;

	public AulasApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(AulasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(2282, 800.00, 10.0);

		System.out.println("Pedido Código: " + order.code);
		System.out.println("Valor Total: " + orderService.total(order));
	}

}
