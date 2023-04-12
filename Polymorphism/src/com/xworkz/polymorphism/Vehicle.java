package com.xworkz.polymorphism;

public class Vehicle {
	
 //creating a method for class Vehicle 
	
public static void ride () {
	
	System.out.println("used to travel");
}
public static void travel () {
	System.out.println("for trip");
}
public static void consume () {
	System.out.println("vehicle consume petrol or diesel");
}
}
 class Bike1 {
	//creating a method for class Bike1
	 
 public  void ride () {
	System.out.println("ridding");
		
	}
public  void travel () {
	System.out.println("travelling ");
}
public void consume () {
	System.out.println("consuming");
}
}
 class Car1 {
	 
	//creating a method for class car1
	
	public void  ride () {
		System.out.println("long ride");
		
	}
	public void travel () {
		System.out.println("long travel");
	}
	public  void consume () {
		System.out.println("consuming");
	}
}
	
 class Train {
	 
	//creating a method for class Train
		
		public  void  ride () {
			System.out.println("tour");
		}
		public void travel () {
			System.out.println("trip");
		}
		public void consume() {
			System.out.println("petrol");
		}
	}
	 class Aeroplane{
		 
		//creating a method for class Aeroplane 
		
		public void ride () {
			System.out.println("high price ticket");
		}
		public void travel () {
			System.out.println("high maintanance");
		}
		public void consume () {
			System.out.println("less time consumption");
		}
	}
	 class Ship {
		 
		//creating a method for class Ship
		
		public void ride () {
			System.out.println("gives comfortable");
		}
		public void travel () {
			System.out.println("easy to travel");
		}
		public void consume () {
			System.out.println("less consumption ");
		}
	}
		
	


