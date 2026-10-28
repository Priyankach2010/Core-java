package com.oops.inheritance;

public class HomeLoan extends LoanImpl {
	private void getHomeLoanDocInfo(){
		System.out.println("All the Home loan documents verified successfully");
	}
	
	//whenever we are not happy or not satisfied from parent class functionalities .go and create same method with different behavior is the concept of method over riding.
	@Override
	public double getLoanROI(){
		int cibil=getCibilScore();
		double roi=6.5;
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
	public static void main(String[] args) {
		System.out.println("welcome to Home loan banking");
		HomeLoan hl=new HomeLoan();
		double salary=hl.getCustomerSalary();
		int age=hl.getCustomerAge();
		int cibil=hl.getCibilScore();
		if(salary>=800000.00 && age>=25 && (cibil>=300 && cibil<=900)) {
			System.out.println("Basic information is validated check personal details");
			if(hl.isPhoneValid() && hl.isAadharValid() && hl.isPanValid()) {
				System.out.println("Details are correct and Loan got approved!!");
				System.out.println("Your loan ROI is: "+hl.getLoanROI());
				hl.getHomeLoanDocInfo();
			}else {
				System.err.println("Something went wrong!");
			}
			
		}else {
			System.out.println("Your are not eligible for personal loan and your loan got rejected");
		}

	}


}
