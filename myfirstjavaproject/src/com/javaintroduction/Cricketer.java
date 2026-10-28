package com.javaintroduction;

public class Cricketer {
	//step1 : Declaration
	//static variables
	static int CountryId;
	static String CountryName;
	//instance variables
	int JerseyNo;
	String CricketerName;
	

	public static void main(String[] args) {
		//step2 : Initialization
		CountryId=91;
		CountryName="India";
		
				
		//Step3 : Accessing the static Varibles
		System.out.println("CountryId :" + CountryId);
		System.out.println("Country Name :" + CountryName);
		
		Cricketer rs=new Cricketer();
		// instance variables can be access after a object creation
		//Accessing the instance variables
		rs.JerseyNo=45;
		rs.CricketerName="Rohit Sharma";
		System.out.println("CountryId :" + CountryId);
		System.out.println("Country Name :" + CountryName);
		System.out.println("JerseyNo:" + rs.JerseyNo);
		System.out.println("CricketerName:" + rs.CricketerName);
		System.out.println("********************************************************");
		Cricketer jb=new Cricketer();
		jb.JerseyNo=93;
		jb.CricketerName="jasprit Bumrah";
		System.out.println("CountryId :" + CountryId);
		System.out.println("Country Name :" + CountryName);
		System.out.println("JerseyNo:" + jb.JerseyNo);
		System.out.println("CricketerName:" + jb.CricketerName);
		System.out.println("********************************************************");
		Cricketer hp=new Cricketer();
		CountryId=92;
		CountryName="Bharath";
		hp.JerseyNo=33;
		hp.CricketerName="Hardik pandiya";
		System.out.println("CountryId :" + CountryId);
		System.out.println("Country Name :" + CountryName);
		System.out.println("JerseyNo:" + hp.JerseyNo);
		System.out.println("CricketerName:" + hp.CricketerName);
		System.out.println("********************************************************");
		Cricketer si=new Cricketer();
		si.JerseyNo=96;
		si.CricketerName="shreyas Iyer";
		System.out.println("CountryId :" + CountryId);
		System.out.println("Country Name :" + CountryName);
		System.out.println("JerseyNo:" + si.JerseyNo);
		System.out.println("CricketerName:" + si.CricketerName);
		
		
		
		
		
		
		
		
		
		

	}

}
