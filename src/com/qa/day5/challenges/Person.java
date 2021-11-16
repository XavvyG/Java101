package com.qa.day5.challenges;

//Create a Person class modelling name, age and job title variables.
public class Person {
	
	
	//Encapsulation
	//---variables
	private String name;
	private int age;
	private String jobTitle;
	
	//Constructor: initialise variables as soon as an instance is created
	//Create a method to return all three of these in a formatted string.
	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}


	public Person() {
		// TODO Auto-generated constructor stub
	}


	//Create some example objects with this class.
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	
	//ToString Method
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "]\n";
	}

	
}
