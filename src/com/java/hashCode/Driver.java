package com.java.hashCode;

import com.java.equals.Car;

public class Driver {

	public static void main(String[] args) {
		Car car1 = new Car(1, "abc", "abc@mail.com");
		Car car2 = new Car(1, "abc", "abc@mail.com");
		
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		System.out.println(car1.equals(car2));
	}

}
