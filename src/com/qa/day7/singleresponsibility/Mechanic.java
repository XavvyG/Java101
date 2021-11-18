package com.qa.day7.singleresponsibility;

public class Mechanic {

	private Car car;

	public Mechanic(Car car) {
		super();
		this.car = car;
	}
	
	public void adjustHeight(int addedHeight) {
		car.setHeight(car.getHeight()+addedHeight);
	}
	
	public void tyreChange() {
		car.setTyre(!car.isTyre());
	}
}
