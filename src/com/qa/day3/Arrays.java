package com.qa.day3;

import java.util.ArrayList;

public class Arrays {

	// What are arrays:
	// - list
	// - store a block of numbers
	// --- store a set of data of any data type (e.g. an array for a bunch of ints
	// or another array for a bunch of strings, etc)

	int a = 1;
	int b = 3;
	int c = 5;
	int d = 7;
	int x; // empty variable so this defaults to 0
	// store odd numbers in an array - store multiple values in one variable

	int[] odd; // - empty array, defaults to null
	String[] str;
	double[] doub;// takes both ints and floats

	String[] alphabet = { "a,b,c,d" };
	// list item 3 =
	// list item 2 =
	// list item 1 = a,b,c,d

	String[] alphabet2 = { "a", "b", "c", "d" };
	// list item 3 = c
	// list item 2 = b
	// list item 1 = a

	// Arrays are static - fixed
	public static void array() {

		// single-dimensional = only has columns and a single row
		int[] oddNums = { 1, 3, 5, 7, 9 }; // defined an int array to have the values 1,3,5,7
		// col 0 1 2 3 4
		// ---------------------------
		// 1 3 5 7 9

		// -----------prints values at each index of the array
		System.out.println(oddNums[0]);
		System.out.println(oddNums[1]);
		System.out.println(oddNums[2]);
		System.out.println(oddNums[3]);
		System.out.println(oddNums[4]);

		// ------------loop to do the same
		// improve index<=4 to use length of array
		// you can do:
		// index<oddNums.length
		// or
		// index<=oddNums.length-1
		for (int index = 0; index < oddNums.length; index++) {
			System.out.println("index: " + index + ", value = " + oddNums[index]);// oddNums[0], oddNums[1]
		}

		int[][] age;
		// multi-dimensional array has multiple rows and columns
		// col | 0 1 2 3 4
		// row ---------------------------
		// 0 | 43 31 15 57 9
		// 1 | 37 6 5 2 53
		// 2 | 25 82 3 11 18
		// 3 | 7 8 23 21 0

		int[][] ageVals = { { 1, 3, 5, 7, 9 }, { 3, 6, 5, 2, 5 }, { 5, 8, 3, 1, 8 }, { 7, 8, 3, 2, 0 } };
		// [row][col]
		System.out.println(ageVals[3][4]);// prints 0
		System.out.println(ageVals[1][1]);// prints 6
		System.out.println(ageVals[0][4]);// prints 9

		// Extension:
		// create a Print function to print out all the values in your multi-dimensional
		// array
		// - hints: could use nested for-loop

	}

	// Array Lists are dynamic - variable
	public static void arrayList() {
		int a = 3;// primitive version of an integer
		Integer b = 3; // non-primitive version of an integer, belongs to a class so can call methods
						// on it

		// will have to import the ArrayList class -> click import
		ArrayList<Integer> arr1 = new ArrayList<>();
		System.out.println("before add: " + arr1);
		arr1.add(23);// 0
		arr1.add(24);// 1
		arr1.add(25);// 2
		System.out.println("size of arrayList: " + arr1.size());
		System.out.println("after add: " + arr1);
		arr1.remove(1);
		System.out.println("remove index 1: " + arr1);
		System.out.println("new value at index 1: " + arr1.get(1));
//		(23);//0
//		(25);//1
		arr1.remove(1);
		System.out.println("remove index 1: " + arr1);
		// Scanner sc = new Scanner();
	}

}