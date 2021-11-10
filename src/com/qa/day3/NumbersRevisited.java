package com.qa.day3;

/*
 * Use a for()-loop to print the numbers 1-100 in words.
 * For example; 1 = one, 100 = one hundred.
 */

public class NumbersRevisited {
	public static void numbersToWords() {

		String wordsArray[][] = {
				{ "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
						"thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" },
				{ "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" } };

		for (int i = 1; i < wordsArray[0].length; i++) {
			System.out.println(wordsArray[0][i]);
		}
		for (int j = 2; j < wordsArray[1].length; j++) {
			for (int i = 0; i < wordsArray[1].length; i++) {
				System.out.println(wordsArray[1][j] + "-" + wordsArray[0][i]);
			}
		}
		System.out.println("one hundred");
	}
}
