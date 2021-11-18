package com.qa.day5.garage;

public class Runner {
	public static void main(String[] args) {
		
		Garage garage = new Garage();

		Vehicle a = new Vehicle("Honda", "Type-R", "black", 1999, 4);
		Vehicle b = new Vehicle("Ducati", "Monster", "red", 2021, 2);
		Vehicle c = new Vehicle("BMW", "3 Series", "blue", 2016, 4);
		Vehicle d = new Vehicle("Nissan", "Almera", "silver", 2004, 4);
		Vehicle boat = new Boat("superferry", "latest", "black", 2000, 0, false);

		garage.add(a);
		garage.add(b);
		garage.add(c);
		garage.add(d);
		garage.add(boat);
		garage.calcAllBills();
		garage.fixVehicle(boat);
	}
}
