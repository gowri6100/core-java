package com.xworkz.practise;

class Parent {
	
	String name = "hema";

}
class Child extends Parent {
	
	String name = "hima";
	
	public void m1 () {
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
	
	
}

public class Keyword1{
	public static void main(String [] args) {
		Child obj = new Child();
		obj.m1();
		
	}
}
