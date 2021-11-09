package com.qa.day2;

//Calculator Revisited
//Edit the division method in the Calculator class, 
//the sum should only execute if the first parameter is smaller than the second, 
//otherwise it prints out a message saying that the division cannot be performed.

public class Calculator {
	
	public static String quotient(double a, double b) {
		if (a<b) {
			double result = b / a;
			return "Answer is: " +result;
		}
		else {
			return "Division cannot be performed";
		}
	}
}
