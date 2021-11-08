package com.qa.day1;

public class Runner {
	//scope is defined by {}
	
	//This is a comment
	//Type "main then hit ctrl+space then hit enter"
	//Class is in PascalCase
	//To declare a method you need:
	//	- access modifier: (private, public, default, protected)
	//	- return type: the data type we want the method to return
	//	- method name: what you want to name the method (camelCase)
	//	- parameters: arguments/inputs to pass into the method (data type & name = int a)
	//	- declare scope with { }
	//	- return statement should be the last line of the method
	
	public static void main(String[] args) {
		System.out.println("Hello World, I rule all xD!");
		//Shortcut for Print sysout then hit ctrl+space
		System.out.println();
		
		hello(); //calls the hello method - this won't output to the console
		System.out.println(hello());
		printHello();
		
		//how to call a non-static method
		DataTypes temp = new DataTypes();
		temp.printVariables();
		
		System.out.println(Operators.power(20));
	}
	
	public static String hello() {
		return "hello";
	}
	
	public static void printHello() {
		System.out.println("printHello");
	}
}
