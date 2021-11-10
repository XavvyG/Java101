package com.qa.day2;

import java.util.Scanner;

public class Iteration {

	// Creating an instance of a Class
	// class_name variable_name = new class_name();
	static Scanner sc = new Scanner(System.in);

	// Iteration/looping:
	// for loop -> defined condition/set number of times for the loop, when you know
	// the end
	// while loop -> executes as long as a condition is true
	// do-while loop -> this is the same as while loop (executes at least once
	// regardless if true or false)

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

	public static void realWorld() {
		System.out.println("Do you want to see your sched (y/n)?");
		String str = sc.nextLine();
		while (str.toLowerCase().equals("y")) {
			System.out.println("Enter the day of the week: ");
			String day = sc.nextLine();
			switch (day.toLowerCase()) {
			case "monday":
				System.out.println("you can sleep");
				break;
			case "tuesday":
				System.out.println("do work!");
				break;
			case "wednesday":
				System.out.println("halfway!");
				break;
			case "thursday":
				System.out.println("almost!");
				break;
			case "friday":
				System.out.println("freedom!");
				break;
			default:
				System.out.println("weekend?");
			}
			System.out.println("do you want to see another day (y/n)?");
			str = sc.nextLine(); // usually a user input would be detected here
		}
	}
	
	public static void whileLoop() {
		System.out.println("----WHILE----");
		int count = 3;
		while (count<3) {
			count++;
			System.out.println(count);
		}
	}
	
	public static void doWhileLoop() {
		System.out.println("----DO-WHILE----");
		int count = 3;
		do {
			count++;
			System.out.println(count);
		}
		while (count<3);
	}
}
