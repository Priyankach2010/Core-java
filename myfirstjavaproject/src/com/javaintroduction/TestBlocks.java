package com.javaintroduction;

public class TestBlocks {
	static String CollegeName="RGUKT";
	static int rollNo;
	static String Name;
	static int marks;
	static {
		System.out.println("student clg is : " + CollegeName);
	}
	{
		System.out.println("Student Object Created");
	}
	static void clgDetails() {
		System.out.println("college name is : " + CollegeName);
	}
	void stDetails() {
		System.out.println("student rollno is :" +rollNo);
		System.out.println("student name is : " + Name);
		System.out.println("student marks is : " + marks);
	}
	

	public static void main(String[] args) {
		TestBlocks obj1=new TestBlocks();
		TestBlocks.clgDetails();
		obj1.rollNo=1;
		obj1.Name="priyanka";
		obj1.marks=90;
		obj1.stDetails();
		TestBlocks obj2=new TestBlocks();
		TestBlocks.clgDetails();
		obj2.rollNo=2;
		obj2.Name="pinky";
		obj2.marks=90;
		obj2.stDetails();
		

	}

}
