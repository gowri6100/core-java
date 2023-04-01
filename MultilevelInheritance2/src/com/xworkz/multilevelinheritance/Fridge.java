package com.xworkz.multilevelinheritance;

public class Fridge extends Current{
	String name;
	int price;
	
	public Fridge(String name,int price) {
		this.name = name;
		this.price = price;
		System.out.println(this.name);
		System.out.println(this.price);
	}
	
	public static void as() {
		System.out.println("used to store food");
	}
	public static void as1() {
		System.out.println("food will be fresh");
	}

}
