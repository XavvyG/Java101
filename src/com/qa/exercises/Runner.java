package com.qa.exercises;

//QA Community - Operator Exercises

public class Runner {
	public static void main(String[] args) {
		System.out.println(Calculator.sum(10, 10));
		System.out.println(Calculator.difference(10, 10));
		System.out.println(Calculator.factor(10, 10));
		System.out.println(Calculator.quotient(10, 10));
		
		Results.physics=148;
		Results.chemistry=149;
		Results.biology=113;
		System.out.println(Results.method1());
		String percent2dp = String.format("%.2f", Results.method2());
		System.out.println(percent2dp+ "%");
	}
}