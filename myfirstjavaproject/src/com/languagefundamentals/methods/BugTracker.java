package com.languagefundamentals.methods;

public class BugTracker {
	 int bugId;
	 String appName;
	 String bugTitle;
	 String severity;
	 String priority;
	 String status;
	 String assignDeveloper;
	 
	
	void main(String[] args) {
		BugTracker b1=new BugTracker();
		b1.bugId=101;
		b1.appName="Online Banking App";
		b1.bugTitle="Login Button not working";
		b1.severity="High";
		b1.priority="High";
		b1.status="open";
		b1.assignDeveloper="developer";
		System.out.println("The BugId is : " + getBugId(b1.bugId));
		System.out.println("Application name of bug is " + getAppName(b1.appName));
		System.out.println("Bug Title : " +getBugTitle(b1.bugTitle));
		System.out.println("Severity of  the bug : " +getSeverity(b1.severity));
		System.out.println("Priority of the bug is : " + getPriority(b1.priority));
		System.out.println("Status of the bug is : " + getStatus(b1.status));
		System.out.println("Assign developer of the bug is : "  + getAssignDeveloper(b1.assignDeveloper));
		
		assignToDeveloper(b1.bugId, b1.assignDeveloper);
		b1.displayBugSummary();
		

	}


	String getAppName(String appName) {
		return appName;
	}
	 int getBugId(int bugId) {
         return bugId;		
	}
	String getBugTitle(String bugTitle) {
		return bugTitle;
	}
	String getSeverity(String severity) {
		return severity;
	}
	String getPriority(String priority) {
		return priority;
	}
	String getStatus(String status) {
		return status;
	}
	String getAssignDeveloper(String assignDeveloper){
		return assignDeveloper;
	}
	
	void assignToDeveloper(int bugId,String assignDeveloper) {
		this.assignDeveloper="Associate develpor";
		this.status="in Development";
		System.out.println("Another developer was assigned");
		updateStatus(this.status);
	}
	void updateStatus(String newStatus) {
		status=newStatus;
		System.out.println("The Status of work is :"+newStatus);
	}
	void displayBugSummary(){
		System.out.println(getBugId(bugId));
		System.out.println(getAppName(appName));
		System.out.println(getBugTitle(bugTitle));
		System.out.println(getSeverity(severity));
		System.out.println(getPriority(priority));
		System.out.println(getStatus(status));
		System.out.println(getAssignDeveloper(assignDeveloper));
		
		
		
	}

}
