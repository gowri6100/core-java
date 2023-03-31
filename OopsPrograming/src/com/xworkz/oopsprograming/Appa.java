package com.xworkz.oopsprograming;

public class Appa extends University {
	String qualityOfEducation;
	String dasoha;
	
	
	public Appa(String qualityOfEducation,String dasoha) {
		this.qualityOfEducation = qualityOfEducation;
		this.dasoha = dasoha;
		System.out.println(this.qualityOfEducation);
		System.out.println(this.dasoha);
		
	}
	//creating method
	
	public static void edu() {
		System.out.println("gives good quality of education");
	}
	public static void anna() {
		System.out.println("gives prasad");
	}
	

}
