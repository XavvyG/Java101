package com.qa.day7.dependencyinversion;

public class Phone implements Notifier{
	
	@Override
	public void alertWeatherCondition(String condition) {
		// TODO Auto-generated method stub
		if (condition.equals("foggy")) {
			System.out.println("It is foggy!");
		}
	}
}