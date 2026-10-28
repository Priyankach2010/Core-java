package com.languagefundamentals.methods;

import java.util.Scanner;

public class TestMethods2 {
	static Scanner sc=new Scanner(System.in);
    void add(int a,int b) {
    	System.out.println("sum is :" +(a+b));
    }
    void sub(int a,int b) {
    	System.out.println("diff is :" +(a-b));
    }
    void mul(int a,int b) {
    	System.out.println("mul is :" +(a*b));
    }
    void div(int a,int b) {
    	System.out.println("div is :" +(a/b));
    }
    void rem(int a,int b) {
    	System.out.println("rem is :" +(a%b));
    }
    void square() {
    	System.out.println("Enter a number for square of its number:");
    	int a=sc.nextInt();
    	System.out.println("square of a number is :" +(a*a));
    }
    void cube() {
    	System.out.println("Enter a number for cube of its number:");
    	int a=sc.nextInt();
    	System.out.println("cube of a number is :" +(a*a*a));
    }
    void isEven() {
    	System.out.println("Enter a number to check whether it is even or not:");
    	int a=sc.nextInt();
    	if(a%2==0) {
    		System.out.println("The given number is even");
    	}
    	else {
    		System.out.println("The given number is not an even number");
    	}
    }
    void isOdd() {
    	System.out.println("Enter a number to check whether it is even or not:");
    	int a=sc.nextInt();
    	if(a%2!=0) {
    		System.out.println("The given number is odd");
    	}
    	else {
    		System.out.println("The given number is not an odd number");
    	}   	
    }
    void isPositive() {
    	System.out.println("Enter a number to check whether it is positive or not:");
    	int a=sc.nextInt();
    	if(a>=0) {
    		System.out.println("The given number is positive");
    	}
    	else {
    		System.out.println("The given number is a negative number");
    	} 
    	
    }
    
	void main(String[] args) {
		
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		System.out.println("enter b number:");
		int b=sc.nextInt();
		add(a,b);
		sub(a,b);
		mul(a,b);
		div(a,b);
		rem(a,b);
		square();
		cube();
		isEven();
		isOdd();
		isPositive();
		
		
		
		
		

	}

}
