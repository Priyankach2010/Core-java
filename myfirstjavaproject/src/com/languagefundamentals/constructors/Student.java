package com.languagefundamentals.constructors;

public class Student {
	int roll_no;
	String name;
	String branch;
	int section;

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.studentInfo();

	}

	void studentInfo() {
		System.out.println("Student details are:");
		System.out.println("RollNo is :" + roll_no);
		System.out.println("Name is :" + name);
		System.out.println("branch is :" + branch);
		System.out.println("Section is :" + section);

	}

}
