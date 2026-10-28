package com.javaintroduction;

public class TestMethods01 {
	
	//static methods can be called in directly.
	//instance methods can be called in static method with object reference only not directly.
	
	void hello() {
    	System.out.println("hello");
    }
	public static void main(String[] args) {
		System.out.println("main method started");
		Demo1 obj=new Demo1();
		welcome();
		obj.hello();
		System.out.println("main method ended");
	}
	static void welcome() {
		System.out.println("static void method");
	}
	

}
