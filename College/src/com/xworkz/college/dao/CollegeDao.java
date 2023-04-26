package com.xworkz.college.dao;

public class CollegeDao {
	
	String[] stringname = new String[5];
	//method 
	public String [] saveString (String str) {
		if(str!=null & str.length()<5) {
			System.out.println("name is valid");
			
			for(int i=0; i<stringname.length;i++) {
				if(stringname[i]==null) {
				stringname [i] = str;
				System.out.println(stringname[i]);
				return stringname;
			}
			}
			{
				System.out.println("string name is not valid");
				return stringname;
			}
			
			}
		return stringname;
	}

		
	

		
		public void read() {
			for (int i=0 ;i<stringname.length;i++) {
				System.out.println(stringname[i]);
			}
		
	}
}
