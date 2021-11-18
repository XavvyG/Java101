package com.qa.day7.depinvexercise;

import java.util.List;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {

		List<Developer> devs = new ArrayList<>();
		Project proj = new Project(null);

		devs.add(new FrontendDeveloper());
		devs.add(new BackendDeveloper());
		
		proj.devType();
	}
}
