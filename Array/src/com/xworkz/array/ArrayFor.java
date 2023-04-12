package com.xworkz.array;

public class ArrayFor {
	
	public static void main(String [] args) {
		
		//array using literals 
		
		int [] digits = {1,2,3,4,5,6,7,8,9,10,11,12};
		byte [] num = {10,11,12,13,14,15,16,17,18,87,89,34,12,23,23,65,67,87};
		short [] nos = {100,200,300,400,500,600,700,800,876,897,543,890,654};
		long [] number = {653456,78754,65767,98788,987880,657876,876554,98098};
		char [] elements = {'a','e','i','o','u','k','j','i','k','n'};
		
		//array using new keywod
		
		int numbers [] = new int [10];
		String name [] = new String [12];
		char character [] = new char [20];
		long numbs [] = new long [23];
		float pre [] = new float [34];
		
	 for (int i=0;i<digits.length-1;i++) {
			
		if (digits[i]%2!=0) {
		System.out.println(digits[i]);
		}
	}
	
	 System.out.println("------------------------------------------------");
		for (int k=nos.length-1;k>=0;k--) {
			
		if (nos[k]%2==0) {
				System.out.println(nos[k]);
		  }
		}
		
		System.out.println("------------------------------------------------");
	for (int m=0; m<=digits.length-1; m++) {
		if (digits[m]%2==0) {
				System.out.println(digits[m]);
			}
				
		}
	System.out.println("------------------------------------------------");
	for (int n=nos.length-1;n>=0;n--) {
			if (nos [n]!=0) {
			System.out.println(nos [n]);
				n--;
			}
		}
				
		
	}
}
	


