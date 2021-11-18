package com.qa.day5.garage;

import java.util.ArrayList;

public class Garage {

	ArrayList<Vehicle> vehicleList = new ArrayList<>();

	
	public void removeVehicleByType(String name) {
		for (Vehicle veh : vehicleList) {
			if(veh.getClass().getSimpleName().equals(name)) {
				vehicleList.remove(veh);
			}
		}
	}
	
	public void calcAllBills() {
		for (Vehicle veh : vehicleList) {
			vehicleBill(veh);
		}
	}
	
	public void fixVehicle(Vehicle veh) {
		vehicleBill(veh);
	}
	
	public void add(Vehicle veh) {
		vehicleList.add(veh);
	}
	
	public void empty() {
		vehicleList.clear();
	}
	
	public void vehicleBill(Vehicle veh) {
		if (veh instanceof Car) {
			System.out.println("Car: Bill is £200");
		}else if (veh instanceof Boat) {
			System.out.println("Boat: Bill is £500");
		}else if (veh instanceof Motorbike) {
			System.out.println("Motobike: Bill is £100");
		}
	}
}
