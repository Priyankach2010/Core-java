package com.oops.inheritance;

import java.util.Scanner;

public class LoanImpl implements Loan{
	static Scanner sc=new Scanner(System.in);
	
	@Override
	public boolean isPhoneValid(){
		System.out.println("enter your mobile number:");
		String phone=sc.next();
		return phone.matches("[6-9]{1}[0-9]{9}");
	}
	
	@Override
	public boolean isAadharValid() {
		System.out.println("Enter your Aadhar number:");
		String aadhar=sc.next();
		return aadhar.matches("[1-9]{1}[0-9]{11}");
	}
	
	@Override
	public boolean isPanValid() {
		System.out.println("Enter pan number:");
		String pan=sc.next();
		return pan.matches("[A-Z/a-z]{5}[0-9]{4}[A-Z/a-z]{1}");
	}
	
	@Override
	public double getLoanROI(){
		int cibil=getCibilScore();
		double roi=8.5;
		if(cibil>=300 &&cibil<=549) {
			System.out.println("poor-High risk of loan rejection,requires immediate credit repair or high-collateral options");
			roi=roi+4.0;
		}
		else if(cibil>=550 && cibil<=699) {
			System.out.println("Fair-Moderate risk,may face limitations in credit approval");
			roi=roi+2.0;
		}else if(cibil>=700 && cibil<=749) {
			System.out.println("Good-Low risk,better chances of loan approval with favorable terms");
			roi=roi+1.5;
		}else if(cibil>=750 && cibil<=900) {
			System.out.println("Excelelnt-very low risk,highest likelihood of approval and access to lower interest rates");
			roi=roi+0.5;
		}else {
			System.err.println("Invalid cibil information !! can you connect with relationship manager of your bank");
			roi=roi+10.0;
		}
		return roi;
	}
	
	@Override
	public int getCibilScore(){
		System.out.println("enter cibil score:");
		int cibil=sc.nextInt();
		return cibil;	
	}
	
	@Override
	public double getCustomerSalary(){
		System.out.println("enter your salary:");
		double salary=sc.nextDouble();
		return salary;
	}
	
	@Override
	public int getCustomerAge(){
		System.out.println("enter your age:");
		int age=sc.nextInt();
		return age;
	}

}
