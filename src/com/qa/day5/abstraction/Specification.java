package com.qa.day5.abstraction;

public abstract class Specification {
	
	// abstract class -> abstract and non-abstract methods
	// normal class -> non-abstract methods
	// interfaces -> can only have abstract methods
	
	
	//method without any implementation - so it is an 
	public abstract String create();
	
	
	public void read() {
		System.out.println("read function");
	}
	
	public abstract String update();
	
	public abstract void delete(int id);
}
