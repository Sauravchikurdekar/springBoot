package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Home {
	
	
	@Autowired
	@Qualifier("Lan")
	private network nt;
	public void getnetworkConnection() {
		nt.networkconnection();
	}

}
