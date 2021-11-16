package com.qa.day3;

public class StringExercise {
	public static void string1() {

		/*
		 * 1.) Create two Strings where one string has a value of “yesterday it was
		 * raining” and the other string with a value of “today it is sunny” Concatenate
		 * both values, capitalise both strings and print out the result. The result
		 * should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING
		 */

		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";
		System.out.println(str2.toUpperCase() + ", " + str1.toUpperCase());
		System.out.println(str2.toUpperCase().substring(0, 12) + "" + str1.toUpperCase().substring(17, 24));
	}

	/*
	 * For this task you are to implement 4 methods that manipulate String objects.
	 * For all parts of this section you are only allowed to use the length(),
	 * substring(), and equals() methods. Avoid using arrays or any methods you have
	 * yet to be taught as this defeats the purpose of the exercise: 
	 * Method 1 - When given a String, count and return how many words there are in that String.
	 * Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line. 
	 * Method 3 - When given a String, print out this String in a vertical fashion in reverse order, each word on a different line.
	 * Method 4 - A find method, which takes 2 Strings; the first is message and the second is the String you want to find in the message. A boolean value should
	 * be returned to indicate whether or not the second String has been found in the message.
	 *
	 */
	public static int method1(String str) {

		int wordCount = 1;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				wordCount++;
			}
		}
		return wordCount;
	}

	public static void method2(String str) {
		System.out.println(str.replace(" ", "\n"));
	}

	public static void method3(String str) {
		String chars[] = str.split(" ");
		if(chars.length > 0){
            for(int i=chars.length-1;i>=0;i--){
                System.out.print(chars[i]+"\n");
            }
        }
	}

	public static void method4(String message, String find) {
		String lMessage = message.toLowerCase();
		String lfind= find.toLowerCase();
		
		System.out.println(lMessage.contains(lfind));
		
	}
	public static void method5(String message) {
		
		
		
	}
	
	
	
}
