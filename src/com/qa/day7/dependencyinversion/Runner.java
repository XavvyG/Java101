package com.qa.day7.dependencyinversion;

public class Runner {
	public static void main(String[] args) {
		WeatherTracker wt = new WeatherTracker();
		wt.setConditions("foggy");
		Notifier phone = new Phone();

		phone.alertWeatherCondition("foggy");
		wt.notify(phone);

	}
}