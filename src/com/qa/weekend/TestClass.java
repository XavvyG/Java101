package com.qa.weekend;

public class TestClass {
	public static int amISearch(String sentence) {
		
		int count;

		for (count=0; count < sentence.length();count++)
			if (sentence.toLowerCase().contains(" am ")||sentence.toLowerCase().contains("am ") ||sentence.toLowerCase().contains(" am")){
		}
		for (count=0; count < sentence.length();count++)
			if (sentence.toLowerCase().contains("am ")){
		}
		for (count=0; count < sentence.length();count++)
			if (sentence.toLowerCase().contains(" am")){
		}
		
		
		return count;
	}
}
