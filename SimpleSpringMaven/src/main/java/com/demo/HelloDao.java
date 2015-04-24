package com.demo;

import org.springframework.stereotype.Component;

@Component
public class HelloDao {
	
	public String getUserName() {
		return "Admin";
	}

}
