package com.xworkz.busproject.busdata;

import com.xworkz.busproject.constants.Tyre;

public class BusRunner {
	
	public static void main (String[]args) {
		
		//static method calling
	
	Bus.transport();
	
	Bus bus = new Bus("60kmph","60crf",'a',"4,3kmpl","black");
	
	Bus.nameOfTheBus = "Airavatha";
	System.out.println(Bus.nameOfTheBus);
	System.out.println(Tyre.TYRE1.name);
	
	bus.Travelling();
	
	Bus.less();
	
	Bus.ticket();
	Bus.less();
	 
	Bus. noOfPassenger =  87;
	System.out.println(Bus.noOfPassenger);
	
	
	}

}
