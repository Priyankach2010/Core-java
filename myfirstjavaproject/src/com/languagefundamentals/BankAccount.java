package com.languagefundamentals;

import java.util.Scanner;

public class BankAccount {
	static int balance=1000;
	public static void Deposit(int amount) {
		balance=balance+amount;
	    System.out.println("After depositing the balance is:"+balance);
		
	}
	public static void Withdraw(int amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("After withdraw the balance is:"+balance);	
		}else {
			System.out.println("Insufficient balance");
		}		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount for deposit :");
		int depositAmount=sc.nextInt();
		Deposit(depositAmount);
		System.out.println("Enter the amount for withdraw :");
		int withdrawAmount=sc.nextInt();
		Withdraw(withdrawAmount);

	}

}
