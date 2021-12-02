package com.qa.day10;

public class Runner {

	public static void main(String[] args) {
		Box<Frog> frogBox = new Box<Frog>();
		Frog f = new Frog();
		f.name = "Bob";
		frogBox.add(f);
		System.out.println(frogBox.remove());
		// we can't use primitive types with generics
	}

}

class Animal {
	public String name;

	@Override
	public String toString() {
		return "Animal[Name: " + name + "]";
	}

}


class Frog extends Animal {
}

class Cat extends Animal {
}

class Box<T> {
	T obj;

	void add(T obj) {
		this.obj = obj;
	}

	T remove() {
		T tmp = obj;
		obj = null;
		return tmp;
	}
}

class AnimalBox<T> extends Box<T> {

}