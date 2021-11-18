package com.qa.day7.liskovexercise;

public class BedroomAdder {
    public void addBedroom(MultiRoomAccommodation apartment) {
        apartment.setSquareFootage(apartment.getSquareFootage() + 40);

        apartment.setNumberOfBedrooms(apartment.getNumberOfBedrooms() + 1);
    }
}