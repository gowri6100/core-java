package com.xworkz.polymorphism;

public class Runner extends Vehicle{
	public static void main(String [] args) {
		
		// calling Bike1 class method 
		
		Bike1  r = new Bike1 ();
		r.ride();
		r.travel();
		r.consume();
		
		//calling Car1 class method 
		
		Car1 k = new Car1 ();
		k.ride();
		k.travel();
		k.consume();
		
		
		//calling Train class method 
		
		
		Train m = new Train ();
		m.ride ();
		m.travel ();
		m.consume ();
		
		// calling Aeroplane class method 
		
		Aeroplane n = new Aeroplane ();
		n.ride ();
		n.travel();
		n.consume ();
		
		//calling Ship class method 
		
		Ship s = new Ship ();
		s.ride ();
		s.travel ();
		s.consume();
			
		
	}

}
