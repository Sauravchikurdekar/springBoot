package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Service
public class UserService {
	
	@Autowired
	private UserRepository resp;

	public User saveUser(User user) {
		return resp.save(user);
		
	
	}

	public List<User> getAllUser() {
		return resp.findAll();
	}

	public User getUserById(int id) {
		return resp.findById(id).get();
	}

	public String deleteUserById(int id) {
		resp.deleteById(id);
		return "User Id is deleted";
	}

	public User updateUserById(User user) {
		return resp.save(user);
	}

}
