package com.qa.day1;

//class - PascalCase
public class DataTypes {

	// class - have 2 things:
	// variables
	// methods

	// ----------variables:
	// camelCase
	// global scope
	int age = 100; // default = 0
	boolean bool = true; // default = false
	long bigInt = 12; // default = 0
	String text = "Hello World!"; // default = null
	short number = 2; // default = 0
	double doub = 138.4; // default = 0.0
	float decimal = 4.5f; // default = 0.0
	char myChar = 'A'; // default = null

	// single instance across all objects
	static String name = "xav";

	// ----------methods:
	// camelCase
	public void method1() {
		// scope of this "num" is local to the method()
		int num;

		// if you have "int age" here, the local variable is prioritised
		age -= 50; // age = age - 50
	}

	public void method2() {
		age += 2;
	}

	public void printVariables() {
		System.out.println(age);
		System.out.println(bool);
		System.out.println(bigInt);
		System.out.println(text);
		System.out.println(number);
		System.out.println(doub);
		System.out.println(decimal);
		System.out.println(myChar);
	}
}
