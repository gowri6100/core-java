package com.xworkz.practise;

 class runner {
	
	
	String name = "gagan";
	
	public void m2 () {
		System.out.println(name);
	}

}
 class Word extends runner{
	 
	 String name = "kayaka";
	 
	 public  void m1 () {
		 System.out.println(name);//by defaulty it excute current class excute
		 System.out.println(this.name); //by explicilty current class excute
		 System.out.println(super.name); //by explicitly super class variable excute
	 }
	
}
public  class Keyword {
	 
	 public static void main(String [] args) {
	 
 Word word = new Word();
 word.m1();
		 runner run = new runner();
		 run.m2();
   }
}
