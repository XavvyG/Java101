package com.qa.exercises;

//Calculator
//Create a method that accepts two integers as input, then returns an integer that is the sum of these two parameters. (Addition)
//
//Create the following additional three methods that each take two parameters:
//
//Multiplication - which takes two numbers and returns the product.
//Subtraction - which takes two numbers, then returns the result of the subtraction.
//Division - which takes two numbers, then returns the result of the division.
//Your division method may have returned the wrong result; This is called a rounding error and is quite common in most languages. this is because we were using ints rather than doubles. Modify the division method so that it takes Double parameters and then return a Double, if not already.

public class Calculator {
	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}

	public static int difference(int a, int b) {
		int result = a - b;
		return result;
	}

	public static int factor(int a, int b) {
		int result = a * b;
		return result;
	}

	public static double quotient(double a, double b) {
		double result = a / b;
		return result;
	}
}
