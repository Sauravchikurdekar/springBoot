	package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
	@Autowired
	FoodReposertory resp;

//for insert
	public Food addFood(Food food) {
		return resp.save(food);
	}

//all food
	public List<Food> getAllFood() {
		return resp.findAll();
	}

//search single food
	public Food getFoodById(int id) {
		return resp.findById(id).get();
	}

//delete food

	public String deleteFoodById(int id) {
		resp.deleteById(id);
		return "Food Delete";
	}

//update food
	public Food UpdateFoodById(Food food) {
		
		return resp.save(food);
	}
}
