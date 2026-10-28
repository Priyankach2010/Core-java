package com.languagefundamentals;

public class TestDataType2 {
	//By default RHS value is in int
	//-128 to 127
	byte b;
	byte b1=127;
	byte b2=-128;
	byte b3=(byte)134;
	byte b4=(byte)-134;
	byte b5='x';
	byte b6=(byte)10.5f;
	//byte b6=true;//cannot cast boolean to byte
	
	//-32768 to 32767
	short s;
	short s1=32767;
	short s2=-32768;
	short s3=(short)32769;
	short s4=(short)-32769;
	short s5='A';
	
	//-2147483648 to 2147483647
	int i;
	int i1=45678;
	int i2=(int)-2147483649L;
	int i3='P';
	int i4=(int)2147483649l;
	int i5=(int)10.2f;
	
	//-9223372036854775808 to 9223372036854775807
	long l;
	long l1=100;
	long l2='A';
	//The literal 9223372036854775809L of type long is out of range
	//long l3=9223372036854775809L;
	
	float f;
	double d=100;
	char c;
	boolean bo;

	public static void main(String[] args) {
		TestDataType2 t=new TestDataType2();
		System.out.println("******************byte*************");
		System.out.println(t.b);
		System.out.println(t.b1);
		System.out.println(t.b2);
		System.out.println(t.b3);
		System.out.println(t.b4);
		System.out.println(t.b5);
		System.out.println(t.b6);
		System.out.println("**************short*****************");
		System.out.println(t.s);
		System.out.println(t.s1);
		System.out.println(t.s2);
		System.out.println(t.s3);
		System.out.println(t.s4);
		System.out.println(t.s5);
		
		System.out.println("***************int****************");
		System.out.println(t.i);
		System.out.println(t.i1);
		System.out.println(t.i2);
		System.out.println(t.i3);
		System.out.println(t.i4);
		System.out.println(t.i5);
		System.out.println("***************long*******************");
		System.out.println(t.l);
		System.out.println(t.l1);
		System.out.println(t.l2);
		System.out.println(t.f);
		System.out.println(t.d);
		System.out.println(t.c);
		System.out.println(t.bo);

	}

}
