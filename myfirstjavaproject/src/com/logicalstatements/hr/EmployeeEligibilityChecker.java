package com.logicalstatements.hr;

import java.util.Scanner;

public class EmployeeEligibilityChecker {

	public static void main(String[] args) {
		System.out.println("Job Eligibility Checker..!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your full name:");
		String fullName=sc.nextLine();
		System.out.println("Have you Completed Your Graduation(True/False):");
		boolean completedYourGraduation=sc.nextBoolean();
		sc.nextLine();
		if(completedYourGraduation) {
			System.out.println("Enter your degree qualification(B.Tech/B.E/MCA):");
			String degQualification=sc.nextLine();
			if(degQualification.equalsIgnoreCase("B.Tech")) {
				//System.out.println("Ok !! proceed to next");
				System.out.println("Enter your branch:");
				String branch=sc.nextLine();
				if(branch.equalsIgnoreCase("computer science and engineering")) {
					//System.out.println("Ok !! proceed next");
					System.out.println("Do You have any Backlogs(True/False):");
					boolean backlogs=sc.nextBoolean();
					if(!backlogs) {
						//System.out.println("Ok !! next");
						System.out.println("Enter Your CGPA:");
						float cgpa=sc.nextFloat();
						if(cgpa>=7.5) {
							//System.out.println("OK !! next");
							System.out.println("Do you know Java(True/False)?");
							boolean knowJava=sc.nextBoolean();
							if(knowJava) {
								System.out.println("Do you know SQL(True/False)?");
								boolean knowSql=sc.nextBoolean();
								if(knowSql) {
									System.out.println("Do you know Spring Boot(True/False)?");
									boolean knowSb=sc.nextBoolean();
									if(knowSb) {
										System.out.println("Are you willing to Relocate(True/False)?");
										boolean relocate=sc.nextBoolean();
										if(relocate) {
											System.out.println("Are you willing to work from office(True/False)?");
											boolean workFromOffice=sc.nextBoolean();
											if(workFromOffice) {
												System.out.println("Are you available to join immediately(True/False)?");
												boolean joinImmediately=sc.nextBoolean();
												if(joinImmediately) {
													
												}else {
													System.out.println("Sorry!! We are looking who are willing to join immediately.");
												}
											}else {
												System.out.println("Sorry!! We are looking who are willing to work from office.");
											}
											
										}else {
											System.out.println("Sorry!! We are looking who are willing to relocate.");
										}
									}
									else {
										System.out.println("Sorry!! we required SQL");
									}
									
								}else {
									System.out.println("Sorry!! we required SQL");
								}
							}
							else {
								System.out.println("Sorry!! we required java");
							}
						}
						else {
							System.out.println("Your CGPA is not matching our requirement");
						}
					}else {
						System.out.println("Sorry!!We are looking for who are not having any backlogs");
					}
					
				}else {
					System.out.println("Your Branch is not meeting our requirement");
				}
			}else if(degQualification.equalsIgnoreCase("B.E")) {
				System.out.println("OK !! proceed to next");
			}else if(degQualification.equalsIgnoreCase("MCA")) {
				System.out.println("OK !! proceed to next");
			}
			else {
				System.out.println("Your Qualification is not matched ...!!");
			}
			
		}else {
			System.out.println("Sorry !! Graduation is necessary for this job");
		}
		
		

	}

}
