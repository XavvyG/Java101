package com.qa.day5.abstraction;

public class Runner {
	public static void main(String[] args) {
		
		//abstract class cannot be instantiated
		//Specification z = new Specification(); xxxx

		Implement2 demo2 = new Implement2();
		demo2.delete(0);
		
		
	}
}
