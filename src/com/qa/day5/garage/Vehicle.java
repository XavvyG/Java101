package com.qa.day5.garage;

public class Vehicle {

	private String make; //null
	private String model; //null
	private String colour; //null
	private double mileage; //0.0
	private int wheels; //0
	
	public Vehicle(String make, String model, String colour, double mileage, int wheels) {
		super();
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.mileage = mileage;
		this.wheels = wheels;
	}
	
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", colour=" + colour + ", mileage=" + mileage
				+ ", wheels=" + wheels + "]";
	}
	
	
	
}
