package com.javaintroduction;

public class Demo1 {
    void hello() {
    	System.out.println("hello");
    }
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("main method ended");
		welcome();
		Demo1 obj=new Demo1();
		obj.hello();
	}
	public static void welcome() {
		System.out.println("static void method");
	}

}
