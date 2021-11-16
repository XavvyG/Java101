package com.qa.day5.challenges;

import java.util.*;

public class PersonList {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void addPerson() {
		
		//Create objects of the person class
		Person a = new Person("dom", 20, "sof dev");
		Person b = new Person("bob", 30, "sof eng");
		Person c = new Person("sam", 23, "manager");
		Person d = new Person("ash", 25, "team leader");

		
		//Create a List<> implementation and store those objects inside
		//need an array list to be able to add and update it -dynamic
		ArrayList<Person> pList = new ArrayList<>(); //creates the list
		
		pList.add(a);
		pList.add(b);
		pList.add(c);
		pList.add(d);

		for (Person i : pList) {
			System.out.println(i);
		}

	}

	public static Person search(String input, ArrayList<Person> pList) {

		for (Person element : pList) {
			if (element.getName().equalsIgnoreCase(input)) {
				System.out.println(element);
				return element;
			}
			else {
				System.out.println("No entry found!");
				return null;
			}

		}
		return null;
	}
}
