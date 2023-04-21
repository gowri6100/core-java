package com.xworkz.practise;

class One{
	String name = "john";
	
}
class Two extends One{
	String name = "jack";
	

public void m1() {
	System.out.println(name);
	System.out.println(this.name);
	System.out.println(super.name);
}
}



public class Keyword3 {
	
	public static void main (String[] args) {
		Two obj= new Two();
		obj.m1();
		
	}

}
