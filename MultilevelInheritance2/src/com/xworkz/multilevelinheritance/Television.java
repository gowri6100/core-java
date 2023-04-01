package com.xworkz.multilevelinheritance;

public class Television extends Current {
	
	String name;
	int size;
	
	public Television(String name,int size) {
		this.name  = name;
		this.size = size;
		System.out.println(this.name);
		System.out.println(this.name);
	}
	
	
	public static void man() {
		System.out.println("gives entertainment");
	}
	public static void man1() {
		System.out.println("for time pass");
	}
	
	

}
