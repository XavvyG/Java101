package com.qa.day5.garage;

public class Car extends Vehicle {
	private int numOfDoors;


	public Car(String make, String model, String colour, int year, int wheels, int numOfDoors) {
		super(make, model, colour, year, wheels);
		this.numOfDoors = numOfDoors;
		// TODO Auto-generated constructor stub
	}

	
	public int getNumOfDoors() {
		return numOfDoors;
	}


	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	
	

}
