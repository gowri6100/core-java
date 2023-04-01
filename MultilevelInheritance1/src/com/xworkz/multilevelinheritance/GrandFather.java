package com.xworkz.multilevelinheritance;

public class GrandFather {
	
	String name;
	int age;
	
	public GrandFather() {
		System.out.println("default constructor");
	}
	
	public  GrandFather(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	
	
	
	public static void you() {
		System.out.println("old generation");
	}
	public static void you1() {
		System.out.println("old year");
	}

}
