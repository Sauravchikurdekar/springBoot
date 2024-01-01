package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SeedDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SeedDemoApplication.class, args);
		
		  Employee emp = context.getBean(Employee.class); emp.empMethod();
		  
		  collage c = context.getBean(collage.class); c.collageMethod();
		 
		
		Home h=context.getBean(Home.class);
		h.getnetworkConnection();

	}

}
