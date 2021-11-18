package com.qa.day5.garage;

public class Boat extends Vehicle{
	
	private boolean hasEngine;

	public Boat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Boat(String make, String model, String colour, int year, int wheels, boolean hasEngine) {
		super(make, model, colour, year, wheels);
		this.hasEngine = hasEngine;
		// TODO Auto-generated constructor stub
	}

	public boolean isHasEngine() {
		return hasEngine;
	}

	public void setHasEngine(boolean hasEngine) {
		this.hasEngine = hasEngine;
	}
	
	
}
