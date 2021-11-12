package com.qa.day5.polymorphism;

public class Car extends Vehicle {
	
	private String reg;
	
	
	//constructor with four parameters
	public Car(String colour, double mileage, String model, int wheels) {
		
		//super keyword - means get values of variable from the parent class
		super(colour, mileage, model, wheels);
		// TODO Auto-generated constructor stub
	}
	
	//constructor with five parameters
	//method overloading
	public Car(String colour, double mileage, String model, int wheels, String reg) {
		super(colour, mileage, model, wheels);
		this.reg = reg;
	}
	
	
	//method overriding
	@Override
	public String toString() {
		return "Car [reg=" + reg + "," + super.toString() +  "]";
	}
}