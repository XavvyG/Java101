package com.qa.day7.openclosed;

public class Runner {
	public static void main(String[] args) {
		Circle circle = new Circle ();
		Rectangle rect = new Rectangle ();
		AreaCalculator ac = new AreaCalculator();
		
		
		circle.setRadius(12.1);
		rect.setLength(10);
		rect.setWidth(15);

		ac.calcArea(circle);
		ac.calcArea(rect);
	}
}
