package com.xworkz.oopsprograming;

public class University {
	String UniversityName;
	int noOfStudent;
	int noOfTeacher;
	int noOfClassroom;
	int SalaryOfEmployees;
	char section;
	float resultOfUniversity;
	
	public University() {
		System.out.println("default constructor");
	}
	
	public University(String UniversityName,int noOfStudent,int noOfTeacher,int noOfClassroom,int SalaryOfEmployees,char section) {
		this. UniversityName =  UniversityName;
		this.noOfStudent = noOfStudent;
		this. noOfTeacher =  noOfTeacher;
		this.noOfClassroom = noOfClassroom;
		this.SalaryOfEmployees = SalaryOfEmployees;
		this.section = section;
		System.out.println(this. UniversityName);
		System.out.println(this.noOfStudent);
		System.out.println(this.noOfTeacher);
		System.out.println(this.noOfClassroom);
		System.out.println(this.SalaryOfEmployees);
		System.out.println(this.section);
		
		
	}
	
	public static void class1() {
		System.out.println("platform to leran");
	}
	public static void class2() {
		System.out.println("making fun");
	}
	public static void class3() {
		System.out.println("designing a future");
	}
	
	

}
