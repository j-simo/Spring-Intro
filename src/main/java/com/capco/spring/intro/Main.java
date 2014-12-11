package com.capco.spring.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capco.spring.intro.entity.Customer;
import com.capco.spring.intro.service.CustomerService;

@Configuration
public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		// - Create application context
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService customerService = context.getBean(CustomerService.class);
		CustomerService customerService2 = context.getBean(CustomerService.class);
		for (Customer c : customerService.getAllCustomers()) {
			System.out.println(c);
		}
		Customer customer1 = context.getBean(Customer.class);
		Customer customer2 = context.getBean(Customer.class);
		System.out.println(customer1.equals(customer2));
	}

}
