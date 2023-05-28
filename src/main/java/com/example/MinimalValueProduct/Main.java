package com.example.MinimalValueProduct;

import com.example.MinimalValueProduct.customer.Customer;
import com.example.MinimalValueProduct.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.List;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}



	@Bean
	CommandLineRunner runner(CustomerRepository customerRepository) {
		return args -> {
			Customer alex = new Customer(
					"Jeden",
					"jeden@gmail.com",
					true,false
			);

			Customer jamila = new Customer(
					"Drugi",
					"drugi@gmail.com",
					false,true
			);

			List<Customer> customers = List.of(alex, jamila);
			customerRepository.saveAll(customers);
		};
	}


}
