package com.xworkz.multilevelinheritance;

public class Mobile extends Current {
	String name;
	int storage;
	
	public Mobile(String name,int stroge) {
		this.name = name;
		this.storage = storage;
		System.out.println(this.name);
		System.out.println(this.storage );
		
	}
	
	public static void jak() {
		System.out.println("used to call");
	}
	public static void jak1() {
		System.out.println("used to message");
	}

}
