package com.logicalstatements.switchcase;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		int age;
		boolean indianCitizen;
		boolean hasVoterId;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		age = sc.nextInt();
		System.out.println("Are you Indian citizen or not(True/False)?");
		indianCitizen = sc.nextBoolean();
		System.out.println("Are you have voter id or not(true/false)?");
		hasVoterId = sc.nextBoolean();
		int status = 0;
		if (age < 0)
			status = 1;
		else if (age < 18 || !indianCitizen)
			status = 2;
		else if (!hasVoterId)
			status = 3;
		else
			status = 4;
		switch (status) {
		case 1 -> System.out.println("Invalid age");
		case 2 -> System.out.println("Not Eligible to vote");
		case 3 -> System.out.println("Voter Id is required");
		case 4 -> System.out.println("Eligible to Vote");
		default -> System.out.println("Something is Invalid");
		}
		sc.close();
	}

}
