package com.languagefundamentals;

public class TestDataType1 {
	Integer studentId=1;//auto-boxing
	String studentName=new String("Pinky");
	Integer age=20;//auto-boxing
	int i=age;//auto-unboxing
	Double marks=90D;
	Character grade='A';
	Boolean passed=true;

	public static void main(String[] args) {
		TestDataType1 t=new TestDataType1();
		System.out.println("student id : " + t.studentId);
		System.out.println("student name : " + t.studentName);
		System.out.println("age : " + t.i);
		System.out.println("marks : " + t.marks);
		System.out.println("Grade : " + t.grade);
		System.out.println("Stauts : " + t.passed);
		

	}

}
