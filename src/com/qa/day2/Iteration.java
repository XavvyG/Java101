package com.qa.day2;

public class Iteration {

//Iteration/looping:
//	for loop -> defined condition/set number of times for the loop, when you know the end
//	while loop -> executes as long as a condition is true
//	do-while loop -> this is the same as while loop (executes at least once regardless if true or false)

	public static void forLoop(int i) {

		// for loop has 3 parts to it
		// for(initialiser, condition, increment
		for (int counter = 0; counter <= i; counter += 2) {
			System.out.println(counter);
		}
	}

	// Creating a times table using for loops
	public static void timesTable(int table) {
		for (int counter = 0; counter <= 12; counter++) {
			int times = table * counter;
			System.out.println(table + " * " + counter + " = " + times);
		}
	}

	public static void whileLoop(String str) {
		while (str == "y") {
			System.out.println("Selected yes");
			System.out.println("Do you want to exit (y/n)?");
			str = "n";
		}
	}
}
