package com.qa.day5.garage;

public class Motorbike extends Vehicle {

	private int engineSizeCC;
	
	public Motorbike(){}

	public Motorbike(String make, String model, String colour, int year, int wheels, int engineSizeCC) {
		super(make, model, colour, year, wheels);
		this.engineSizeCC = engineSizeCC;
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
