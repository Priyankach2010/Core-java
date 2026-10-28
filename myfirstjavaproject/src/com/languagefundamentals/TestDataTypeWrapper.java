package com.languagefundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestDataTypeWrapper {
	String s="pinky";   //String literal
	String s1="A";
	String s2="100.05";
	String s3=new String("vijay");   //string object
	String s4=new String(); 
//	String s5=true;     //Type mismatch: cannot convert from boolean to String
	
	
//	StringBuffer sb="rahul"; //Type mismatch: cannot convert from String to StringBuffer
	StringBuffer sb1=new StringBuffer("Rahul");
	StringBuffer sb2=new StringBuffer();

	BigInteger bi;
	BigDecimal bd;
	
	public static void main(String[] args) {
		TestDataTypeWrapper t= new TestDataTypeWrapper();
		System.out.println("******************String************");
		System.out.println(t.s);
		System.out.println(t.s1);
		System.out.println(t.s2);
		System.out.println(t.s3);
		System.out.println(t.s4);
		System.out.println("***************StringBuffer***********");
		System.out.println(t.sb1);
		System.out.println(t.sb2);
		System.out.println(t.bi);
		System.out.println(t.bd);
      
	}

}
