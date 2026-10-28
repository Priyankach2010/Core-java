package com.languagefundamentals.methods;

import java.util.Scanner;

public class LoanManagement {
	String customerName;
	int loanAmount;
	double interestRate;
	int tenure;
	double calcualteInterset(int p,int t,double r) {
		double interest=(p*t*r)/100;
		return interest;
	}
	double totalAmount(int p,double interest) {
		double amount=p+interest;
		return amount; 
	}
	double calculateMonthlyEmi(double amount,int t) {
		int m=t*12;
		double emi=(amount/m);
		return emi;	
	}
	void displayLoanSummary(double interest, double amount,double emi) {
		System.out.println("The customer name is :" +customerName);
		System.out.println("Interest amount for amount is :" + interest);
		System.out.println("The total amount with interest is :" +amount);
		System.out.println("The monthly emi amount is : " +emi);
	}

	public static void main(String[] args) {
		LoanManagement l1=new LoanManagement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		l1.customerName=sc.next();
		System.out.println("Enter your principle amount:");
		l1.loanAmount=sc.nextInt();
		System.out.println("enter the time of period:");
		l1.tenure=sc.nextInt();
		System.out.println("Enter the interest rate: ");
		l1.interestRate=sc.nextDouble();
		double interest=l1.calcualteInterset(l1.loanAmount,l1.tenure,l1.interestRate);
		double total=l1.totalAmount(l1.loanAmount, interest);
		double EMI=l1.calculateMonthlyEmi(total,l1.tenure);
		l1.displayLoanSummary(interest, total, EMI);
		sc.close();

	}

}
