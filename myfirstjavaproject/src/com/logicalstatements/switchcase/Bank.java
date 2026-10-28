package com.logicalstatements.switchcase;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		double balance=0;
		System.out.println("Enter our Bank System");
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Check Balance\r\n"
				+ "2. Deposit\r\n"
				+ "3. Withdraw\r\n"
				+ "4. Transfer\r\n"
				+ "5. Mini Statement\r\n"
				+ "6. Exit");
		int num=sc.nextInt();
		switch(num) {
		case 1 ->balance=checkBalance();
		}
		

	}

	private static double checkBalance() {
		return checkBalance();
	}

}
