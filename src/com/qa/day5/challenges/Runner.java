package com.qa.day5.challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

	// create an instance of the scanner class to be able to use it
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("What is your name?");
		String name = sc.nextLine();// nextLine is a method in the scanner class which looks for the next line of
									// string
		System.out.println("What is your age?");
		int age = sc.nextInt();// nextInt looks for the next integer
		sc.nextLine();// pick up the enter key

		// Create objects of the Person class
		Person a = new Person(name, age, "be a mouse");
		Person b = new Person("bob", 15, "builder");
		Person c = new Person("eeyore", 7, "bounce");

		System.out.println(a);

		// Create a List<> implementation and store those objects inside
		// need an arrayList to be able to add and update it -dynamic
		ArrayList<Person> people = new ArrayList<>();// create the list

		people.add(a);// add person 'a' to the list
		people.add(b);
		people.add(c);

		System.out.println(people);
		System.out.println("who do you want to find?");

		String find = sc.nextLine();

		Person finding = new Person();
		System.out.println("Person found!!! - " + finding.findPerson(find, people));// PERSON B
	}

}