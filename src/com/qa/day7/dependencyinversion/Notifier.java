package com.qa.day7.dependencyinversion;

public interface Notifier {
	public default void alertWeatherCondition(String weatherConditions) {
	}
}
