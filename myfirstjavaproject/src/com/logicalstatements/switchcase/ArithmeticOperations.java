package com.logicalstatements.switchcase;

import java.util.Scanner;

public class ArithmeticOperations {

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn;
		do {
			System.out.println("Enter a number:");
			double a = sc.nextDouble();
			System.out.println("Enter b number:");
			double b = sc.nextDouble();
			System.out.println(
					"Which operation you want to perform..? \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
			System.out.println("select one of the operation you want to perform");
			int num = sc.nextInt();
			double result = 0;
			switch (num) {
			case 1 -> result = addition(a, b);
			case 2 -> result = subtraction(a, b);
			case 3 -> result = multiplication(a, b);
			case 4 -> result = division(a, b);
			default -> System.out.println("you entered the invalid number");
			}
			System.out.println("The result of your operation is :" + result);
			System.out.println("Do you swant to continue y for yes and N for no:");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("Calculator closed");

	}

	double addition(double a, double b) {
		return a+b;
	}
	double subtraction(double a, double b) {
		return a-b;
	}
	double multiplication(double a, double b) {
		return a * b;
	}
	double division(double a, double b) {
		return a / b;
	}
}
