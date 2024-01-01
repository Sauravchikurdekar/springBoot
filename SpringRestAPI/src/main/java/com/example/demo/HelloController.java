package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping("k")
	public String display() {
		return "Hello";
	}
	
	@GetMapping("demo")
	public String display1() {
		return "Hello welcome to RestAPI";	
		}

	@GetMapping("list")
	public String displaylist() {
		List<String> names=new ArrayList<>();
		names.add("saurav");
		names.add("khimam");
		names.add("kiooo");
		names.add("prince");
		return names.toString();
	}
}
