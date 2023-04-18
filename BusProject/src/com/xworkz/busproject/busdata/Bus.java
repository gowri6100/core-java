package com.xworkz.busproject.busdata;

import com.xworkz.busproject.constants.Tyre;

public class Bus {
	public static String nameOfTheBus;
	public static String nameOfTheDriver;
	private static int ticketPrice;
	private static int price;
	protected static int noOfPassenger;
	public Tyre tyre;
	
	protected String speed;
	String model;
	char firstLetterOfTheBus;
	String mileage;
	String colorOfTheBus;
	//methods
	
	public static  void transport() {
		System.out.println("can travel from one place to another");
	}
	public  void Travelling() {
		System.out.println("makes noise pollution");
		
		
	   Travel();
	}
	private   void Travel() {
		ticketPrice = 129;
		price = 56571;
		System.out.println("makes air pollution");
		System.out.println(nameOfTheBus);
		System.out.println(price);
	}
	static void ticket() {
		System.out.println("common people can travel");
	}
	protected  static void less () {
		System.out.println("less ticket price");
	}	
	public Bus() {
		System.out.println("default constructor");
	}
	
	//constructor
	public Bus(String speed,String model,char firstLetterOfTheBus,String mileage,String colorOfTheBus) {
	this.speed = speed;
	this.model = model;
	this.firstLetterOfTheBus = firstLetterOfTheBus;
	this.mileage = mileage;
	this.colorOfTheBus = colorOfTheBus;
	
	System.out.println(this.speed);
	System.out.println(this.model );
	System.out.println(this.firstLetterOfTheBus);
	System.out.println(this.mileage);
	System.out.println(this.colorOfTheBus);
		
	
	
	}
	

}

