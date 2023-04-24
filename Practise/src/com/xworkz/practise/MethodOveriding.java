package com.xworkz.practise;

public class MethodOveriding {
	
	public static void m1() {
		System.out.println("no arg");
		
		}
		public static void m2() {
			System.out.println("arg with int with m1");
		}
		public static void m3() {
			System.out.println("arg with string  with name");
		}
		
		public static void m4() {
			System.out.println("arg with string with int and name");
		}
}
 
class Overriding{
	
	public static void m1() {
		System.out.println("no arg");
		
		}
		public static void m2() {
			System.out.println("arg with int with m2");
		}
		public static void m3() {
			System.out.println("arg with string  with name2");
		}
		
		public static void m4() {
			System.out.println("arg with string with int and name3");
		}
		
class Runner{		

public static void main(String[] args) {
	
	MethodOveriding over = new MethodOveriding();
	over.m1();
	
	Overriding ove = new Overriding();
	ove.m1();	
}
}
}
