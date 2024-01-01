package com.example.demo;

import org.springframework.stereotype.Component;

interface network{
	public void networkconnection() ;
		
	
}
@Component("MTNL")
public class MTNLnetwork implements network {
	
	public void networkconnection() {
		System.out.println("MTNL connection");
	}
	
	
	@Component("Lan")
	class LanNetwork implements network{
		public void networkconnection() {
			System.out.println("This is lan connection");
		}
	}
}
