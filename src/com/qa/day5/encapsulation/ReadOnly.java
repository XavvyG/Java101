package com.qa.day5.encapsulation;

public class ReadOnly {
	
	
	//should only have getters
	//customer public info
	private String firstName;
	private String lastName;
	
	private int age;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}
}
