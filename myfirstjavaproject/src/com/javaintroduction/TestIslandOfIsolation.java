package com.javaintroduction;
class C{
	D d;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called form C class");
	}
}
class D{
	C c;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called from D class");
	}
}

public class TestIslandOfIsolation {
	
	public static void main(String[] args) {
		System.out.println("main method started");
		C obj1=new C();
		D obj2=new D();
		
		obj1.d=obj2;
		obj2.c=obj1;
		
		obj1=null;
		obj2=null;
		
		System.gc();
		

	}

}
