package com.languagefundamentals.methods;

public class TestMethods1 {
	int addition(int a,int b) {
		int sum=a+b;
		System.out.println("Addition of two numbers is : " +sum);
		return sum;
		
	}
	int subtraction(int sum,int b) {
		int diff=sum-b;
		System.out.println("subtraction of two numbers is : " +diff);
		return diff;	
	}
	int multiplication(int a,int b) {
		int mul=a*b;
		System.out.println("multiplication of two numbers is :" +mul);
		return mul;
	}
	double division(int a,int b) {
		int div=a/b;
		System.out.println("Division of two numbers is :"+div);
		return div;
	}

	void main(String[] args) {
		int x=10;
		int y=20;
		int z=10;
		int m=10;
		int d=2;
		double result=division(multiplication(subtraction(addition(x,y),z),m),d);
		
		System.out.println();

	}

}
