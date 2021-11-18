package com.qa.day7.dependencyinversion;

public class WeatherTracker {
	
    private String conditions;
    
    public void notify(Notifier notifier) {
    	notifier.alertWeatherCondition(conditions);
    }
    
    public void setConditions(String weather) {
    	this.conditions = weather;
    }

    public String getConditions() {
        return conditions;
    }
}