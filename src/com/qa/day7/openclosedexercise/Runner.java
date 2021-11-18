package com.qa.day7.openclosedexercise;

public class Runner {
	public static void main(String[] args) {
		
		Greeting cg = new CasualGreeting();
		Greeting fg = new FormalGreeting();

		Greeter cgreeter = new Greeter(cg);
		Greeter fgreeter = new Greeter(fg);
		
		System.out.println(cgreeter.greet());
		
		System.out.println(fgreeter.greet());
		
	}
}
