package com.qa.day7.dependencyinversion;

public class Email implements Notifier {
	
	@Override
	public void alertWeatherCondition(String condition) {
		// TODO Auto-generated method stub
		if (condition.equals("raining")) {
			System.out.println("It is raining!");
		}
	}
}