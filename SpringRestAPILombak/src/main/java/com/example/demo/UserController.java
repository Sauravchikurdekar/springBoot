package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/saveuser")
	public User saveUser(@RequestBody User user) {
		
		return service.saveUser(user);
		
	
	}
	
	
	@GetMapping("/showuser")
	public List<User> display(){
		return service.getAllUser();
	}
	

	@PostMapping("/user/{id}")
	public User serchUser(@PathVariable int id) {
		return service.getUserById(id);
	}
	
	
	@PostMapping("/updateuser")
	public User UpdateUser(@RequestBody User user) {
		return service.updateUserById(user);
	
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		return service.deleteUserById(id);
	}
	
}
