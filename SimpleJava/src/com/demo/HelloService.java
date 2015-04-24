package com.demo;

public class HelloService {
	
	
	private HelloDatabaseDao dao;
	
	public void printHello() {
		String userName = dao.getUserName();
		System.out.println("Hello!!!" + userName);
	}

	public HelloDatabaseDao getDao() {
		return dao;
	}

	public void setDao(HelloDatabaseDao dao) {
		this.dao = dao;
	}
	
	

}
