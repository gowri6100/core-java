package com.xworkz.multilevelinheritance;

public class Bus extends Vehicle{
	
	int moreNumOfPeopleWillFill;
	byte sizeOfTheBus;
	
	
	public Bus (int moreNumOfPeopleWillFill,byte sizeOfTheBus) {
		this.moreNumOfPeopleWillFill = moreNumOfPeopleWillFill;
		this.sizeOfTheBus = sizeOfTheBus;
		System.out.println(this.moreNumOfPeopleWillFill);
		System.out.println(this.sizeOfTheBus);
	}
	
	
	public static void om() {
		System.out.println("easy to travel");
		
	}
	public static void om1() {
		System.out.println("less amount ticket");
	}

}
