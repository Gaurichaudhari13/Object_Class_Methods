package com.java.toString;

public class Car {
	int id;
	String name;
	String email;

	public Car(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String toString() { // toString method
		return id + " is id " + name + " is name " + email + " is email";

	}
}
