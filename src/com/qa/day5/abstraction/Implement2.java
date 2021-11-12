package com.qa.day5.abstraction;

public class Implement2 extends Specification{

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
		System.out.println("deleted id");
	}
	
	//this class can have its own methods ontop of the ones that were inherited
	public void method() {
		
	}
}
