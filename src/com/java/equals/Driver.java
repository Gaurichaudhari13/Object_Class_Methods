package com.java.equals;

public class Driver {

	public static void main(String[] args) {
		Car car1 = new Car(1, "abc", "abc@mail.com");
		Car car2 = new Car(1, "abc", "abc@mail.com");
		System.out.println(car1.equals(car2));
		System.out.println(car1 == car2);

	}

}
