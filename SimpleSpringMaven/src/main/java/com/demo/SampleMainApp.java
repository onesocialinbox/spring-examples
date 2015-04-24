package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleMainApp {
	
	//public HelloService hello;
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		HelloService helloService = (HelloService) context.getBean("helloService");
		helloService.printHello();
	}
	

}
