package com.xworkz.multilevelinheritance;

public class Bike extends Vehicle{
	String nameOfTheBike;
	int speed;
	
	public Bike(String nameOfTheBike,int speed) {
		this. nameOfTheBike =  nameOfTheBike;
		this.speed = speed ;
		System.out.println(this. nameOfTheBike );
		System.out.println(this.speed);
	}
	
	public static void kam() {
		System.out.println("use to travel");
		
	}
	public static void  kam1() {
		System.out.println("making noise");
	}

}
