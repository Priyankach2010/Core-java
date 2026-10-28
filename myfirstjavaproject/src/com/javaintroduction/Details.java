package com.javaintroduction;
class Priya{
	int id;
	String name;
	String branch;
	public Priya(int id, String name, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
	
}

public class Details {

	public static void main(String[] args) {
		Priya obj=new Priya(1,"priyanka","cse");
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(obj.branch);	

	}

}
