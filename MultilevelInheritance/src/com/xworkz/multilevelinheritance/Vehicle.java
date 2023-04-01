package com.xworkz.multilevelinheritance;

public class Vehicle {
	
	String wheel;
	byte noOfWheel;
	
	public Vehicle() {
		System.out.println("default constructor");
	}
	
	public  Vehicle (String wheel,byte noOfWheel) {
		this.wheel = wheel;
		this.noOfWheel = noOfWheel;
		System.out.println(this.wheel);
		System.out.println(this.noOfWheel);
	}
	
	
	
	public static void gam() {
		System.out.println("make noise pollution");
	}
	public static void gam1() {
		System.out.println("make air pollution");
	}
	 

}
