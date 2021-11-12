package com.qa.day5.abstraction;

public class Implement1 extends Specification {
	
	//Can only inherit from 1 class
	//cannot inherit from multiple classes
	
	
	@Override
	public String create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
		System.out.println("delete stuff");
		
	}
	
}
