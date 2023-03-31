package com.xworkz.oopsprograming;

public class Starter extends University {
	
	public static void main(String []args){
		
		//creating a obj
		University versity = new University("vtu",543,567,876,98778,'d');
		Appa appa = new Appa("education", "food");
		VivekanandaCollege college = new VivekanandaCollege("green","electronic");
		JananiCollege janani = new JananiCollege("lenovo",'A');
		
		
		//calling method
		
		appa.edu();
		appa.anna();
	    college.black();
		college.board();
		janani.lenovo();
		janani.section();
		
		
		
	}

}
