package com.xworkz.multilevelinheritance;

public class Car extends Vehicle {
	String nameOfTheCar;
	int price;
	
	public Car(String nameOfTheCar,int price) {
		this. nameOfTheCar =  nameOfTheCar;
		this. price =  price;
		System.out.println(this. nameOfTheCar);
		System.out.println(this. price);
	}
	
	
	public static void im() {
		System.out.println("safe to dreive");
	}
	public static void im1() {
		System.out.println("protect from sun");
	}
	

}
