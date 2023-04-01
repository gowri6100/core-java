package com.xworkz.multilevelinheritance;

public class Runner3 extends Current{
	
	public static void main(String []args) {
		Current obj14 = new Current(543,765);
		Television obj15= new Television("onida",654);
		Mobile obj16 = new Mobile("samsung",678);
		Fridge obj17 = new Fridge("whirlpool",30000);
		
		obj14.kal();
		obj14.kal1();
		obj15.man();
		obj15.man1();
		obj16.jak();
		obj16.jak1();
		obj17.as();
		obj17.as1();
		}

}
