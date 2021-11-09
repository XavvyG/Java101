package com.qa.day2;

public class Conditionals {
	//if-statements, if-else statements
	//Conditional - something that is dependent on a condition - "true or false"
	
	public static String ride(int age, int height) {
		if (age>12 || height>120) {
			return "can ride";
		}
		else {
			return "can't ride";
		}
	}
	
	public static String hotOrCold(int temp) {
		if(temp > 30) {
			return "Turn on AC";
		}
		else if (temp == 30) {
			return "Perfect temperature";
		}
		else {
			return "Turn on heater";
		}
	}
	

	public static String umbrella(boolean rain) {
		if (rain == true) {
			return "Take umbrella";
		}
		else {
			return "dont' take umbrella";
		}
	}
}