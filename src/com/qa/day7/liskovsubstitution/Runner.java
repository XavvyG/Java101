package com.qa.day7.liskovsubstitution;

public class Runner {
public static void main(String[] args) {

	FlightlessBird penguin = new Penguin();
	FlyingBird owl = new Owl();
	
	Animal animal = new Animal();

	animal.toFly(owl);
	animal.notFly(penguin);
}
	
	
	
}
