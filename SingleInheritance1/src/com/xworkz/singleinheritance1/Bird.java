package com.xworkz.singleinheritance1;

public class Bird {
	String nameOfTheBird;
    String  sizeOfTheBird;
    
    public Bird() {
    	System.out.println("default constructor");
    }
    
    public Bird(String nameOfTheBird, String  sizeOfTheBird) {
    	this.nameOfTheBird = nameOfTheBird;
    	this.sizeOfTheBird = sizeOfTheBird;
    	System.out.println(this.nameOfTheBird);
    	System.out.println(this.sizeOfTheBird);
    }
	
	public static void cam1() {
		System.out.println("birds have flying wings");
	}
	public static void cam2() {
		System.out.println("size of the bird various from bird to bird");
	}

}
