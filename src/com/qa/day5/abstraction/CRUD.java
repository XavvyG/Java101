package com.qa.day5.abstraction;

public interface CRUD {
	
	
	//interface is always abstract
	//methods HAVE TO BE abstract so you don't have to use the keyword
	public String create();
	
	public String[] read();
	
	public String update();
	
	public void delete();
	
}
