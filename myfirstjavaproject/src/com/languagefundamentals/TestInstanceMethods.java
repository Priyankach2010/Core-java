package com.languagefundamentals;

public class TestInstanceMethods {
	 String sname;
	 int rollno;
	 String course;
	 int marks1;
	 int marks2;
	 int marks3;
	 int totalMarks;
	 int avg;
	void StudentDetails(String sname,int rollno,String course) {
		System.out.println("student name : " + sname);
		System.out.println("student rollno : " + rollno);
		System.out.println("student course : " + course);
		
	}
	public int CalculateTotal(int marks1,int marks2,int marks3) {
		System.out.println("subject 1 marks : " + marks1);
		System.out.println("subject 2 marks : " + marks2);
		System.out.println("subject 3 marks : " + marks3);
		totalMarks=marks1+marks2+marks3;
		System.out.println("Total Marks : " + totalMarks);
		return totalMarks;
	}
	public void AvgMarks(int totalMarks) {
		avg=totalMarks/3;
		System.out.println("Average marks : " + avg);
	}
	

	public static void main(String[] args) {
		TestInstanceMethods obj= new TestInstanceMethods();
		obj.sname="pinky";
		obj.rollno=1;
		obj.course="jfs";
		obj.marks1=90;
		obj.marks2=90;
		obj.marks3=90;
		obj.StudentDetails(obj.sname,obj.rollno,obj.course);
		obj.CalculateTotal(obj.marks1,obj.marks2,obj.marks3);
		obj.AvgMarks(obj.totalMarks);
	}

}
