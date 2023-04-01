package com.xworkz.multilevelinheritance;

public class Runner1 extends Vehicle {
	
	
	public static void main(String[]args) {
		
		Vehicle obj4= new Vehicle("MRF",(byte) 4);
		Bike obj5 = new Bike("ns120",120);
		Car obj6 = new Car("verna",200000);
		Bus obj7 = new Bus(67,(byte) 67);
		
		obj4.gam();
		obj4.gam1();
		obj5.kam();
		obj5.kam1(); 
		obj6.im();
		obj6.im1();
		obj7.om();
		obj7.om1();
		
	}

}
