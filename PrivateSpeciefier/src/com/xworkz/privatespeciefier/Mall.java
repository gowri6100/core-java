package com.xworkz.privatespeciefier;

public class Mall {
	
	
	private static String nameOfTheMall = "asian mall";
	private static int noOfEmployees = 7678678;
	private static int Salary = 800000;
	private static  int expenditure = 656565;
	
	
	
	
	
	public static String shop () {
		System.out.println(nameOfTheMall);
		return nameOfTheMall;
	}
	public static int  employees () {
		System.out.println( noOfEmployees);
		return noOfEmployees;
	}
	public static int amount () {
		System.out.println(Salary);
		return Salary;
	}
	public static int expenses() {
		System.out.println(expenditure);
		return expenditure;
	}

}
