package com.qa.day7.singleresponsibility;

public class Car {
    private String colour;
    private String model;
    private int mileage;
    private int height;
    boolean tyre;

    // constructor
    public Car(String colour, String model, int mileage, int height, boolean tyre) {
        this.colour = colour;
        this.model = model;
        this.mileage = mileage;
        this.height = height;
        this.tyre = tyre;
    }

    // getters and setters for colour and model

    public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

    // getter for mileage
    public int getMileage() {
        return mileage;
    }

	// setter for mileage
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    //getter setter for height
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	//getter setter for tyre
	public boolean isTyre() {
		return tyre;
	}

	public void setTyre(boolean tyre) {
		this.tyre = tyre;
	}

}