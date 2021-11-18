package com.qa.day7.singleresponsibility;

public class Driver {
    private Car car;
    
	public Driver(Car car) {
		super();
		this.car = car;
	}

	// functionality
    public void drive(int milesDriven){
        car.setMileage(car.getMileage() + milesDriven);
    }
}