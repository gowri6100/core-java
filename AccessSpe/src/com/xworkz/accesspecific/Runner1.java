package com.xworkz.accesspecific;

import com.xworkz.accesspe.Garden;

public class Runner1 extends Garden{
public static void main (String []args) {
		
		//public and private method calling 
		
		Garden.getGarden();
		
		//protected method calling 
		Garden.plant();
		
		//calling non static varible
		
		//Garden obj = new Garden ();
		 
		Garden.ayur();
	    Garden.flower();

    }
}
