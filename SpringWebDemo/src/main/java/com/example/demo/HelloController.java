package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("h")
	@ResponseBody
	
	public String display() {
		return "Hello";
	}
	
	@RequestMapping("m")
	@ResponseBody
	public  String Display() {
		return "Welcome to seed";
	}
	
	@RequestMapping("hello")
	
	public String displayHello() {
		return "Hello";
	}
	
	@RequestMapping("w")
	public String displayWelcome() {
		return "Welcome";
	}
	
	@RequestMapping("showlogin")
	public String displayshow() {
		return "Login";
	}
	
	@RequestMapping("login")
	public String displaySucess() {
		return "Sucess";
	}
	
	
	

}
