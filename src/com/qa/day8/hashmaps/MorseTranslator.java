package com.qa.day8.hashmaps;

import java.util.*;
import java.util.stream.Collectors;

public class MorseTranslator {
	
	Map<String, String> morseCode = new HashMap<>();;
	
	
	//Constructor
	public MorseTranslator() {

		this.morseCode.put(".-","A");
		this.morseCode.put("-...","B");
		this.morseCode.put("-.-.","C");
		this.morseCode.put("-..","D");
		this.morseCode.put(".","E");
		this.morseCode.put("..-.","F");
		this.morseCode.put("--.","G");
		this.morseCode.put("....","H");
		this.morseCode.put("..","I");
		this.morseCode.put(".---","J");
		this.morseCode.put("-.-","K");
		this.morseCode.put(".-..","L");
		this.morseCode.put("--","M");
		this.morseCode.put("-.","N");
		this.morseCode.put("---","O");
		this.morseCode.put(".--.","P");
		this.morseCode.put("--.-","Q");
		this.morseCode.put(".-.","R");
		this.morseCode.put("...","S");
		this.morseCode.put("-","T");
		this.morseCode.put("..-","U");
		this.morseCode.put("...-","V");
		this.morseCode.put(".--","W");
		this.morseCode.put("-..-","X");
		this.morseCode.put("-.--","Y");
		this.morseCode.put("--..","Z");

		this.morseCode.put("/", " ");
	}

	public String translate(String input) {
		// split the string, find the key and get the value
		
		return Arrays.stream(input.split(" ")).map(n -> this.morseCode.get(n)).collect(Collectors.joining(""));
	}

}
