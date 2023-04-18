package com.xworkz.accesspe;

public class Garden {
	
	public static String nameOfGarden = "theFern";
	private static int noOfSpecies = 46656;
	 static int noOfPlants = 768687;
	protected static String nameOfPlants = "cycus";
	
	public String ayurvedicPlants = "tulsi";
 private float perOfPlaceOccupiedByGarden = 34.764f;
	char nameFirstLetter = 'f';
	protected int  noOfFlowerPlants = 23311;
	
	//for static variable
	
	//public accessspeciefier 
	
	public static void getGarden () {
		Garden obj3 = new Garden();
		System.out.println(obj3. ayurvedicPlants);
		System.out.println(nameOfGarden);
		species();
		per ();
	}
	
	//private accessspeicifier
	
	private static void species() {
	   System.out.println(noOfSpecies);
	}
	
	//default access speciefier
	
	static void plants() {
		System.out.println(noOfPlants);
	}
	
	//protected access speciefier
	
	protected static void plant () {
		System.out.println(nameOfPlants);
	}
	
	//for non static variable
	
	
	public static void ayur () {
		System.out.println("ayurvedicPlants");
		
	}
	
	private static void per () {
		Garden obj2 = new Garden();
		System.out.println(obj2.perOfPlaceOccupiedByGarden);
		
		
	}
	 static void letter () {
		 Garden obj4 = new Garden();
		System.out.println(obj4. nameFirstLetter);
	}
	protected static void flower () {
		Garden obj5 = new Garden();
		System.out.println(obj5.noOfFlowerPlants);
	}

}
