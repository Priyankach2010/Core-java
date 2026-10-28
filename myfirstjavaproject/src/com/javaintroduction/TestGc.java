package com.javaintroduction;
class A{
	B b;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called form A class");
	}
}
class B{
	A a;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called from B class");
	}
}

public class TestGc {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}
	void hello() {
		System.out.println("hello method");
		//outside of method - when method is completed then automatically c object is eligible for gc.s
		TestGc c=new TestGc();
		System.out.println("hello method ended");
		
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		TestGc c1 = new TestGc();
		System.out.println(c1);// com.javaintroduction.TestGc@1dbd16a6
		TestGc c2 = new TestGc();
		System.out.println(c2);// com.javaintroduction.TestGc@7ad041f3
		TestGc c3 = new TestGc();
		System.out.println(c3);// com.javaintroduction.TestGc@251a69d7
		//Nullifying object
		c1 = null;
		
		//Reassigning the object - c2 object is eligible for gc.c3 object address is shared by two objects.
		c2=c3;
		System.out.println(c2);//com.javaintroduction.TestGc@251a69d7
		System.out.println(c3);//com.javaintroduction.TestGc@251a69d7
		
		//Anonymous object is used to call the methods after it collects by gc.
		new TestGc().hello();
		
		
		//island of isolation
		A obj1=new A();
		B obj2=new B();
		
		obj1.b=obj2;
		obj2.a=obj1;
		
		obj1=null;
		obj2=null;
		
		System.gc();

	}

}
