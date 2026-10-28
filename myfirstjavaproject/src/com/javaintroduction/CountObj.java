package com.javaintroduction;

public class CountObj {
	 static int i=0;
	{
		i++;
	}

	public static void main(String[] args) {
		CountObj obj1=new CountObj();
		CountObj obj2=new CountObj();
		CountObj obj3=new CountObj();
		CountObj obj4=new CountObj();
		CountObj obj5=new CountObj();
		
		System.out.println(i);
		

	}

}
