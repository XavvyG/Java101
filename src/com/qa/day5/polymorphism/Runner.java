package com.qa.day5.polymorphism;

public class Runner {
	public static void main(String[] args) {

		Vehicle x = new Vehicle ("white", 30000, "BMW", 4);
		System.out.println(x);
		
		Car myCar = new Car("black", 50000, "Audi", 4, "BK04ZTE");
		System.out.println(myCar);
		
		
	}
}
