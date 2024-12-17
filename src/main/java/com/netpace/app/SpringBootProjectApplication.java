package com.netpace.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootProjectApplication.class, args);

		Chai chai1 = context.getBean(Chai.class);
		System.out.println(chai1);
	}

}
