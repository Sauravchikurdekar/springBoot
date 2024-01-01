package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class TuitionService {
	
	@Autowired
	private TuisionRepository resp;
	
	//for insert
	public Tuition addTusion(Tuition tuition) {
	return resp.save(tuition);
	}
	
	//for show all
	public List<Tuition> getAllTuition(){
		return resp.findAll();
		
	}
	
	
//for find id
	public Tuition getTuitionById(int id){
		return resp.findById(id).get();
		
	}
	
	//for delete id
	public String deleteById(int id) {
		 resp.deleteById(id);
		 return "row is deleted";
	}

	
	public Tuition UpdateById(Tuition tuition) {
		return resp.save(tuition);
	}
	
}
