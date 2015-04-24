package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class HelloService {
	
	
	@Autowired
	public HelloDao helloDao;
	
	public void printHello() {
		System.out.println("Hello...." + helloDao.getUserName());
	}

}
