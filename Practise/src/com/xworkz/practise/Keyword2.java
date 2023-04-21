package com.xworkz.practise;

 class first {
	int num = 8989;

}
 class second  extends first{
	 String name = "jack";
	 
	 public  void m1() {
		 System.out.println(name);
		 System.out.println(this.name);
		 System.out.println(super.num);
	 }
	 
	 
 } 
public class  Keyword2{
	
	public static void main(String []args) {
		second obj = new second();
		obj.m1();
	}
	
}
