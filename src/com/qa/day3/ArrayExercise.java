package com.qa.day3;

import java.util.ArrayList;
/**
 * 1. Create an array that will hold 10 integer values, populate the array with values, then call and output each element.
 * 2. Create a for loop that populates an integer array with values, outputting them at each iteration.
 * Then create another loop that iterates through the array, changing the values at each point to equal itself times 10, outputting them at each iteration.
**/

public class ArrayExercise {
	public static int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

	public static void task1() {
		for (int i : num) {
			System.out.println("Number: " + i);
		}
	}

	public static void task2() {
		ArrayList<Integer> array = new ArrayList<>();

		for (int i = 0; i < num.length; i++) {
			array.add(num[i]);

		}
		for (int index : array) {
			array.set(index, array.get(index) * 10);
			System.out.println(array);
		}
	}
}
