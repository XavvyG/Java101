package com.qa.day2;

public class FizzBuzz {

	static int x;

	public static String execute() {
		if (x % 5 == 0 && x % 3 == 0) {
			return "FizzBuzz";
		} else if (x % 3 == 0) {
			return "Fizz";
		} else if (x % 5 == 0) {
			return "Buzz";
		} else {
			String number = String.valueOf(x);
			return number;
		}
	}
}