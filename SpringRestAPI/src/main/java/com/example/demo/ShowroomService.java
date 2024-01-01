package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowroomService {
	@Autowired

	private SworoomRepository resp;

	public Showroom addShowroom(Showroom showroom) {
		return resp.save(showroom);
	}

	public List<Showroom> getAllShowroom() {
		return resp.findAll();
	}

	public Showroom getShowroomById(int id) {
		return resp.findById(id).get();
	}

	public String deleteShowroomById(int id) {
		resp.deleteById(id);
		return "row deleted";
	}

	public Showroom UpdateShoeroomById(Showroom showroom) {
		return resp.save(showroom);
	}

}
