package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowroomController {

	@Autowired
	private ShowroomService service;

	@PostMapping("/show1")
	public Showroom saveShowroom(@RequestBody Showroom showroom) {
		return service.addShowroom(showroom);
	}

	@GetMapping("/showall")
	public List<Showroom> showall() {
		return service.getAllShowroom();
	}
	
	@GetMapping("/showby{id}")
	public Showroom getById(@PathVariable int id) {
return	service.getShowroomById(id);
	}
	
	@GetMapping("/delete{id}")
	public String delete(@PathVariable int id) {
		return service.deleteShowroomById(id);
	}
	@GetMapping("/update")
	public Showroom update(Showroom showroom) {
		return service.addShowroom(showroom);
	}
	
}
