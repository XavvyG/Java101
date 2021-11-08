package com.qa.exercises;

//QA Community - Operator Exercises

public class Runner {
	public static void main(String[] args) {
		System.out.println(Calculator.sum(10,10));
		System.out.println(Calculator.difference(10,10));
		System.out.println(Calculator.factor(10,10));
		System.out.println(Calculator.quotient(10,10));
		
		double mark1 = 150; 
		double mark2 = 149; 
		double mark3 = 125;
		double grade = Results.method1(mark1,mark2,mark3);
		double percent = Results.method2(grade);
		String percent2dp = String.format("%.2f", percent);
		
		System.out.println("Physics: " +mark1+ "\nChemistry: " +mark2+ "\nBiology: " +mark3);
		System.out.println("Total mark: "+grade);
		System.out.println("Your grade is: "+percent2dp+ "%");
	}
}