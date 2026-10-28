package com.javaintroduction;

public class Test1 {
	static {
		method1();
		Test1 t=new Test1();
		t.method4();
		t.method5();
	}
	static void method1() {
		System.out.println("method1 called");
		method2();
	}
	static void method2() {
		System.out.println("method2 called");
		method3();
	}
	static void method3() {
		System.out.println("method3 called");
	}
	void method4() {
		System.out.println("method4 called");
	}
	void method5() {
		System.out.println("method5 called");
	}

	public static void main(String[] args) {
		

	}

}
