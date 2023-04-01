package com.xworkz.singleinheritance;

public class employee extends Company{
	
	String qualityOfMaintanace;
	String launch;
	
	public employee(String qualityOfMaintanace,String launch) {
		this.qualityOfMaintanace = qualityOfMaintanace;
		this.launch = launch;
		System.out.println(this.qualityOfMaintanace);
		System.out.println(this.launch);
		
	}
	
	
	public static void jam() {
		System.out.println("we can share our ideas");
	}
	public static void jam1() {
		System.out.println("we can get launch");
	}

}
