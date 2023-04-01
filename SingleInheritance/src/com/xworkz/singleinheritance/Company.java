package com.xworkz.singleinheritance;

public class Company {
	String nameOfTheCompany;
	int noOfEmployees;
	
	public Company() {
		System.out.println("deafault constructror");
	}
	public Company(String nameOfTheCompany,int noOfEmployees) {
		this.nameOfTheCompany = nameOfTheCompany;
		this.noOfEmployees =  noOfEmployees;
		System.out.println(this.nameOfTheCompany);
		System.out.println(this.noOfEmployees);
	}
	
	public static void sam() {
		System.out.println("platform to explore our ideas");
	}
	public static void sam1() {
		System.out.println("where we will get a salary");
	}

}