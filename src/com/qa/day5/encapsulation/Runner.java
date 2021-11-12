package com.qa.day5.encapsulation;
import java.util.Scanner;

public class Runner {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//created an instance of the ReadWrite Class:
		ReadWrite test = new ReadWrite();
		
		System.out.println(test.getCvc());
		
		System.out.println("Enter CVC: ");
		test.setCvc(sc.nextInt());

		System.out.println("Your CVC is: "+test.getCvc());
		
	}
}
