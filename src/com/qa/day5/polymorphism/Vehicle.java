package com.qa.day5.polymorphism;

public class Vehicle {
	
	// variables
	private String colour; //null
	private double mileage; //0.0
	private String model; //null
	private int wheels; //0
	
	// constructor - to set the initial values for the variables in the class
	// method
	// can tell if a method is a constructor because it has the same name as the class
	
	public Vehicle(String colour, double mileage, String model, int wheels) {
		super();
		this.colour = colour;
		this.mileage = mileage;
		this.model = model;
		this.wheels = wheels;
	}
	
	// can auto-generate
	// right click -> source -> generate toString() -> select fields -> click Generate
	// toString() method allows you to print out all the values of variables in the object
	
	@Override
	public String toString() {
		return "Vehicle [colour=" + colour + ", mileage=" + mileage + ", model=" + model + ", wheels=" + wheels + "]";
	}
	
}
