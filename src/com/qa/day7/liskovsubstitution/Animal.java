package com.qa.day7.liskovsubstitution;

public class Animal {
    public void toFly(FlyingBird flyBird){
        flyBird.fly();
    }
    
    public void notFly(FlightlessBird noFlyBird) {
    	noFlyBird.flap();
    }
}