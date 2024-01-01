
package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contoller {
	
	@Autowired
 private TuitionService service;
 
	@PostMapping("/Tuition")
 public Tuition save(@RequestBody Tuition tuition) {
	 return service.addTusion(tuition);
 }
	@GetMapping("/findall")
	
	public List<Tuition> show(){
		return service.getAllTuition();
	}
	
	
	@GetMapping("/find/{id}")
	public Tuition FindById(@PathVariable int id) {
		return service.getTuitionById(id);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteById(int id) {
		return service.deleteById(id);
	}
	

	
}
