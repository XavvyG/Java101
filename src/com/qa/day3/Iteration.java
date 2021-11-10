package com.qa.day3;

import java.util.Scanner;

/**
 * Numbers 
 * 1. Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11. 
 * 2. Create a second method that when given the number 1-99 returns a String representation of this number, for example 1 = one, 11 = eleven, 21 = twenty-one. 
 * 3. Expand on the method you wrote in Numbers 2 to allow the input 1-999. 
 * 4. Expand the method you wrote in Numbers 2 to allow the input 1-9999
 **/

public class Iteration {
	static Scanner sc = new Scanner(System.in);

	public static void addTwoNumbers() {
		System.out.println("Enter a 2-digit number: ");
		int number = sc.nextInt();
		int sum = 0;
		int rem;
		while (number > 0) {
			rem = number % 10;
			sum += rem;
			number /= 10;
		}
		System.out.println(sum);
	}

	public static String numberToWord() {
		String words = "";
		String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String tensArray[] = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };

		System.out.println("Enter number (1-999999): ");
		int number = sc.nextInt();
		if (number == 0) {
			return "zero";
		}
		// check if number is divisible by 1 million
		if ((number / 1000000) > 0) {
			words += number / 1000000 + " million ";
			number %= 1000000;
		}
		// check if number is divisible by 1 thousand
		if ((number / 1000) > 0) {
			words += number / 1000 + " thousand ";
			number %= 1000;
		}
		// check if number is divisible by 1 hundred
		if ((number / 100) > 0) {
			words += number / 100 + " hundred ";
			number %= 100;
		}

		if (number > 0) {
			// check if number is within teens
			if (number < 20) {
				// fetch the appropriate value from unit array
				words += unitsArray[number];
			} else {
				// fetch the appropriate value from tens array
				words += tensArray[number / 10];
				if ((number % 10) > 0) {
					words += "-" + unitsArray[number % 10];
				}
			}
		}
		System.out.println(words);
		return words;
	}
}
