package com.prog.com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@org.springframework.stereotype.Controller
@org.springframework.stereotype.Controller
public class Controller {

	 @RequestMapping("/sayHello")  
	   public ModelAndView sayHello1() {
	      String message = "Spring MVC Hello World Example.";
	      return new ModelAndView("helloWorld", "message", message);  
	   }
	 
	 @RequestMapping("/sayWelcome")  
	   public ModelAndView sayHello() {
	      String message = "Welcome to the world of spring.";
	      return new ModelAndView("welcome", "message", message);  
	   }
}

