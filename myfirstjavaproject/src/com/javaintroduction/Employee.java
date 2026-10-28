package com.javaintroduction;

public class Employee {
	static String companyName;
	int empId;
	String empName;
	int salary;
	static {
		companyName="Vcube";
		System.out.println("company name : " + companyName);
	}
	{
		System.out.println("the Employee Details are :");
	}
	

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.empId=101;
		e1.empName="priya";
		e1.salary=40000;
		System.out.println("employee Id : " + e1.empId);
		System.out.println("employee name : " + e1.empName);
		System.out.println("employee salary : " + e1.salary);
		Employee e2=new Employee();
		e2.empId=102;
		e2.empName="pinky";
		e2.salary=40000;
		System.out.println("employee Id : " + e2.empId);
		System.out.println("employee name : " + e2.empName);
		System.out.println("employee salary : " + e2.salary);
		
		Employee e3=new Employee();
		e3.empId=103;
		e3.empName="priyanka";
		e3.salary=40000;
		System.out.println("employee Id : " + e3.empId);
		System.out.println("employee name : " + e3.empName);
		System.out.println("employee salary : " + e3.salary);
		

	}

}
