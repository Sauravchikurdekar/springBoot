package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FoodController {
	@Autowired
	private FoodService service;

	@PostMapping("/savefood")
	public Food SaveFood(@RequestBody Food food) {
		return service.addFood(food);
	}

	@GetMapping("/showfood")
	public List<Food> display1() {
		return service.getAllFood();
	}

	@PostMapping("/food/{id}")
	public Food searchFood(@PathVariable int id) {
		return service.getFoodById(id);
	}

	@PostMapping("/updatefood")
	public Food UpdateFood(@RequestBody Food food) {
		return service.UpdateFoodById(food);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteFood(@PathVariable int id) {
		return service.deleteFoodById(id);
	}

}
