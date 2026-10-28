package com.languagefundamentals.constructors;

import java.util.Scanner;

class Vehicles {
		String type;
		Vehicles(String type) {
			this.type = type;
		}
	}

	class Car extends Vehicles {
		String brand;
		double price;

		Car(String type, String brand, double price) {
			super(type);
			this.brand = brand;
			this.price = price;
		}
	}

	class ElectricCar extends Car {
		double batteryCapacity;

		ElectricCar(String type, String brand, double price, double batteryCapacity) {
			super(type, brand, price);
			this.batteryCapacity = batteryCapacity;
		}
	
	    void display() {
			System.out.println("The type of car is " + type);
			System.out.println("The brand of car is " + brand);
			System.out.println("The price of car is " + price);
			System.out.println("The battery capacity of car is " + batteryCapacity);

		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ElectricCar ec = new ElectricCar("Electric", "kia", 1000000, 70);
		ec.display();
		sc.close();
	}

}
