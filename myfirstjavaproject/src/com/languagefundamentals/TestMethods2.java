package com.languagefundamentals;

import java.util.Scanner;


public class TestMethods2 {

	public static void main(String[] args) {
		TestMethods2 t=new TestMethods2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int a=sc.nextInt();
		System.out.println("Enter the b number :");
		int b=sc.nextInt();
		System.out.println("Addition of two numbers : " + t.add(a,b));
		System.out.println("Subtraction of two numbers : " + t.sub(a,b));
		System.out.println("Multiplication of two numbers : " + t.mul(a,b));
		System.out.println("Division of two numbers : " + t.div(a,b));

	}

	 int add(int a, int b) {
		return a+b;
	}
	 int sub(int a,int b) {
		 return a-b;
	 }
	 int mul(int a,int b) {
		 return a*b;
	 }
	 int div(int a,int b) {
		 return a/b;
	 }
	 
	 

}
