package com.qa.day7.singleresponsibility;

public class Runner {
	public static void main(String[] args) {

		Car car = new Car("Read", "Ferrari", 3000,100,false);
		Driver driver = new Driver(car);
		Mechanic mech = new Mechanic(car);
		
		
		mech.adjustHeight(5);
		driver.drive(5000);
		mech.tyreChange();
		System.out.println(car.getMileage());
		System.out.println(car.getHeight());
		System.out.println(car.isTyre());
	}
}
