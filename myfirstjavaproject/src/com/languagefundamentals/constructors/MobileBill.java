package com.languagefundamentals.constructors;

import java.util.Scanner;

public class MobileBill {
	String model;
	double price;
	int quantity;
	double mobileCost;
	double deliveryCharge;
	double finalBill;

	MobileBill() {
		
	}

	MobileBill(String model) {
		this();
		this.model=model;
	}

	MobileBill(String model, double price) {
		this(model);
		this.price=price;
	}

	MobileBill(String model, double price, int quantity) {
		this(model, price);
		this.quantity=quantity;
	}

	MobileBill(String model, double price, int quantity, double deliveryCharge) {
		this(model,price,quantity);
//		this.model = model;
//		this.price = price;
//		this.quantity = quantity;
		this.deliveryCharge = deliveryCharge;
		this.mobileCost=price*quantity;
		this.finalBill=this.mobileCost+deliveryCharge;		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the model of the mobile : ");
		String model = sc.next();
		System.out.println("Enter the price of the mobile :");
		double price = sc.nextDouble();
		System.out.println("Enter the quantity :");
		int quantity = sc.nextInt();
		System.out.println("Enter the deliery charges:");
		double deliveryCharge = sc.nextDouble();
		MobileBill m1 = new MobileBill(model ,price,quantity,deliveryCharge);
		m1.mobileBillInfo();

	}

	void mobileBillInfo() {
		System.out.println("The model of the mobile is:" + model);
		System.out.println("The price of the mobile is:" + price);
		System.out.println("The quantity of the mobile is:" + quantity);
		System.out.println("The delivery charge of the mobile is:" + deliveryCharge);
		System.out.println("The cost of the mobile is:" + mobileCost);
		System.out.println("The final bill of the mobile is:" + finalBill);
	}

}
