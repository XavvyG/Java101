package com.qa.day7.liskovexercise;

public class MultiRoomAccommodation extends Apartment {

    private int numberOfBedrooms;

	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}
}
