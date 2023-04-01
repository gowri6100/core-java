package com.xworkz.multilevelinheritance;

public class Child extends GrandFather{
	
	String haveANickName;
	String haveASmartPhone;
	
	public  Child (String haveANickName,String haveASmartPhone) {
		this.haveANickName = haveANickName;
		this. haveASmartPhone =  haveASmartPhone;
		System.out.println(this.haveANickName);
		System.out.println(this. haveASmartPhone);
	}
		
		
		public  static void   we() {
			System.out.println("used to call with nickname");
		 }
		 public static void we1() {
			 System.out.println("using new technology");
		 }
			
}
