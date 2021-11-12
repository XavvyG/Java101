package com.qa.day5.challanges;
import java.util.Scanner;
import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person a = new Person ("xavier", 30, "sof dev");
		Person b = new Person ("bob", 30, "sofeng");
		Person c = new Person ("sam", 23, "manager");
		
		ArrayList<Person> pList = new ArrayList<>();
		pList.add(a);
		pList.add(b);
		pList.add(c);
		
		System.out.println(pList);
		
//		
//		System.out.println("Enter job title: ");
//		String myJobTitle = sc.nextLine();
//		p.setJobTitle(myJobTitle);
//
//	
//		System.out.println("Enter name: ");
//		String myName = sc.nextLine();
//		p.setName(myName);
//		
//		
//		System.out.println("Enter age: ");
//		int myAge = sc.nextInt();
//		p.setAge(myAge);

//		System.out.printf("\nYour are: "+p.getName() +"\nAge: "+p.getAge()+"\nJob: "+p.getJobTitle());

		
		
		
	}
}