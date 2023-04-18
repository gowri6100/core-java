package com.xworkz.busproject;

import com.xworkz.busproject.busdata.Bus;

public class BusStarter extends Bus {
	
	public static void main(String []args) {
		
		BusStarter bus = new BusStarter();
		
		
		Bus.noOfPassenger = 87;
		System.out.println(Bus.noOfPassenger);	
		
	}

}
