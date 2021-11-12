package com.qa.day5.inheritance;

public class Runner {

	public static void main(String[] args) {

		
		// Grandparent Class
		GrandParent nan = new GrandParent();
		System.out.println("gp=" +nan.years());
		
		
		// Parent Class
		Parent mum = new Parent();

		mum.eyeColour = "blue";
		System.out.println("parent="+ mum.print());
		System.out.println("parent="+mum.years());
		
		//DRY - Don't Repeat Yourself
		Child me = new Child();
		me.eyeColour = "brown";
		System.out.println("child="+me.print());
		System.out.println("child="+me.years());
		
	}

}
