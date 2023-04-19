package com.xworkz.familydata;

public class FamilyRunner {
	
	public static void main(String[]args) {
		 
		 Family run = new  Family("sharma",67,"shankar",30000,1000);
		 Family run1 = new Family("sharma",67,"shankar",30000,1000);
		 Family run2 = new  Family("kapoor",6,"raj",80000,1000);
		 Family run3 = new  Family("khan",7,"salman",50000,20000);
		 Family run4= new  Family("chopra",8,"sam",30000,1000);
		 
		 
		 
		 System.out.println(run.toString());
		 System.out.println(run1.toString());
		 System.out.println(run2.toString());
		 System.out.println(run3.toString());
		 System.out.println(run4.toString());
		 
		 System.out.println(run.equals(run1));



		 
		
	
		
		
		
		
		
		
	}

}
