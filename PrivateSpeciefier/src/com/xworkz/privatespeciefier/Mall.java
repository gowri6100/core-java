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
	public static void employees () {
		System.out.println( noOfEmployees);
	}
	public static void amount () {
		System.out.println(Salary);
	}
	public static void expenses() {
		System.out.println(expenditure);
	}

}
