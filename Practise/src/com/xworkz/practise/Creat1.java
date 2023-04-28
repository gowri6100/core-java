package com.xworkz.practise;

public class Creat1 {
	String [] bottle = new String[5];
	public String [] goal(String str) {
		if(str!=null && str.length() >2) {
			for (int i=0; i<bottle.length;i++) {
				if(bottle == null) {
					
					bottle[i]= str;
					System.out.println(bottle[i]);
					return bottle;
				}
				
			}
		}
		System.out.println("not valid bottle");	
		return bottle;
		
	}
	public void read () {
		for(int j=0;j<bottle.length;j++) {
			System.out.println(bottle [j]);
		}
	}
	
	
	
	
	
	

}
