package com.xworkz.multilevelinheritance;

public class Current {
	int watt;
	int volts;
	
	public Current() {
		System.out.println("default constructor");
	}
	
	public Current(int watt,int volts) {
		this. watt =  watt;
		this.volts = volts;
		System.out.println(this. watt);
		System.out.println(this.volts);
		
		
	}
	
	public static void kal() {
		System.out.println("current range");
	}
	public static void kal1() {
		System.out.println("current passing");
	}
	
	

}
