package com.oops.inheritance;

import java.util.Scanner;

public class PersonalLoan extends LoanImpl {
	void getPersonalLoanDocInfo(){
		System.out.println("All the personal loan documents verified successfully");
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("welcome to personal loan banking");
		PersonalLoan pl=new PersonalLoan();
		double salary=pl.getCustomerSalary();
		int age=pl.getCustomerAge();
		int cibil=pl.getCibilScore();
		if(salary>=900000.00 && age>=26 && (cibil>=300 && cibil<=900)) {
			System.out.println("Basic information is validated check personal details");
			if(pl.isPhoneValid() && pl.isAadharValid() && pl.isPanValid()) {
				System.out.println("Details are correct and Loan got approved!!");
				System.out.println("Your loan ROI is: "+pl.getLoanROI());
				pl.getPersonalLoanDocInfo();
			}else {
				System.err.println("Something went wrong!");
			}
			
		}else {
			System.out.println("Your are not eligible for personal loan and your loan got rejected");
		}
		System.out.println("main method ended");

	}

}
