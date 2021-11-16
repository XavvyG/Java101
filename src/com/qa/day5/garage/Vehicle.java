package com.qa.day5.garage;

public class Vehicle {

	private String make; //null
	private String model; //null
	private String colour; //null
	private int year; //0.0
	private int wheels; //0
	
	public Vehicle(String make, String model, String colour, int year, int wheels) {
		super();
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.year = year;
		this.wheels = wheels;
	}
	
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", colour=" + colour + ", year=" + year
				+ ", wheels=" + wheels + "]";
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	
	
}
