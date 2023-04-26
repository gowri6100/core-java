package com.xworkz.college;

import com.xworkz.college.dao.CollegeDao;

public class CollegeRunner {

	public static void main(String[] args) {
		 CollegeDao obj	= new  CollegeDao ();
		 
	     obj.saveString("jaya");
		 obj.saveString("dana");
		 obj.saveString("gori");
		 obj.saveString("jaya");
		 obj.saveString("lali");
		 
		 obj.read();


	}

}
