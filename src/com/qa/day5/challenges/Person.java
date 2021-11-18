package com.qa.day5.challenges;

import java.util.ArrayList;

//Abstraction - OOP 
public class Person implements PersonList {

//	Create a Person class modelling name, age and job title variables.
//
//	Create a method to return all three of these in a formatted string.
//
//	HINT: @Override the toString() method.
//
//	Create some example objects with this class.
//
//	Create a List<> implementation and store those objects inside.
//
//	HINT: it's probably best to put your List<> implementation in a separate class.
//
//	Create a method that can search for a specific Person by their name.

	// Encapsulation OOP
	// ---variables
	private String name;// null
	private int age;// 0
	private String jobTitle;// null

	// Polymorphism OOP - overloading
	// ---default constructor
	public Person() {
	}

	// ---constructor: initialise the variables as soon as I create an instance of
	// the class
	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	// ---getters & setters
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

	// ---toString method
	// Polymorphism OOP - Overriding
	@Override
	public String toString() {
		return "Person: name=" + name + ", age=" + age + ", jobTitle=" + jobTitle;
	}

	// method to search for a specific Person by their name.
	public Person findPerson(String name, ArrayList<Person> person) {
		for (Person p : person) {
			if (p.name.toLowerCase().equals(name.toLowerCase())) {
				return p;
			}
		}
		return new Person();
	}

}