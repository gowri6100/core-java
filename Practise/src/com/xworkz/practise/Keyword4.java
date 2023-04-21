package com.xworkz.practise;

class parent{
	String name = "radha";
	
}
class child{
	String name = "ram";
	public void m1 (){
		System.out.println(name);
	}
	
}





public class Keyword4{
	public static void main(String []args) {
	child c	= new child();
	c.m1();
		
	}
}