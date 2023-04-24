package com.xworkz.practise;

public class Method {
	
	public void m1() {
	System.out.println("no arg");
	
	}
	public void m1(int num) {
		System.out.println("arg with int");
	}
	public void m1(String name) {
		System.out.println("arg with string");
	}
	
	public void m1(String name, int num) {
		System.out.println("arg with string");
	}
	
	public static void main(String[]args) {
		Method obj = new Method();
		obj.m1();
		obj.m1(10);
		obj.m1("gowri");
		obj.m1("sheela", 5);
	}
	
		

}
