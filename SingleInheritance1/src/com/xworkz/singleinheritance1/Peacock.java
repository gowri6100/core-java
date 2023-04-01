package com.xworkz.singleinheritance1;

public class Peacock extends Bird {

	String colour;
	String sizeOfTheFeathers;
	
	public Peacock (String colour,String sizeOfTheFeathers) {
		this.colour = colour;
		this.sizeOfTheFeathers = sizeOfTheFeathers;
		System.out.println(this.colour);
		System.out.println(this.sizeOfTheFeathers);
		
	}
	
	public static void tam() {
		System.out.println("peacock is a national bird");
	}
	public static void tam1() {
		System.out.println("peacock has longest feathers");
	}
}
