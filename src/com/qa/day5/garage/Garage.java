package com.qa.day5.garage;

import java.util.ArrayList;

public class Garage {

	public void vehicleList() {
		ArrayList<Vehicle> vList = new ArrayList<>();

		Vehicle a = new Vehicle("Honda", "Type-R", "black", 1999, 4);
		Vehicle b = new Vehicle("Ducati", "Monster", "red", 2021, 2);
		Vehicle c = new Vehicle("BMW", "3 Series", "blue", 2016, 4);
		Vehicle d = new Vehicle("Nissan", "Almera", "silver", 2004, 4);

		
		vList.add(a);
		vList.add(b);
		vList.add(c);
		vList.add(d);
		
		
		for (Vehicle i : vList) {
			System.out.println(i);
		}
	}
	
}
