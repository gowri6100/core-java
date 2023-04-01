package com.xworkz.multilevelinheritance;

public class Runner2 extends GrandFather {
	public static void main(String []args) {
		
		GrandFather obj11 = new GrandFather("hanu",78);
		Father obj12 = new Father("nokia keypad",7654334);
		Child obj13 = new Child ("chintu","redmi");
		
		obj11.you();
		obj11.you1();
		obj12.han();
		obj12.han1();
		obj13.we();
		obj13.we1();
		
		
		
		
		
	}

}
