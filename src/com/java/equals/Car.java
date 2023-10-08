package com.java.equals;

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

	public boolean equals(Object obj) {
		Car c = (Car) obj;
		if (this.id == c.id && this.name == c.name && this.email == c.email) {
			return true;

		} else {
			return false;
		}

	}
}
