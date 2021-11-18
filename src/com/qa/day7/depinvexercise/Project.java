package com.qa.day7.depinvexercise;

import java.util.List;

public class Project {
//    Developer back = new BackendDeveloper();
//    Developer front = new FrontendDeveloper();

	List<Developer> developers;

	public Project(List<Developer> devs) {
		this.developers = devs;
	}

	public void implement() {
		for (Developer dev : developers) {
			dev.develop();
		}
	} 
	
//	public void implement() {
//        developers.forEach(d->d.develop());
//    }

	public void devType() {
		for(int i=0; i<developers.size(); i++) {
			System.out.println(i + " "+ developers.get(i).getClass().getSimpleName());
		}
	}
}