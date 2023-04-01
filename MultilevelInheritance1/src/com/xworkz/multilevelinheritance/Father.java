package com.xworkz.multilevelinheritance;

public class Father extends GrandFather {
	
	String useMobile;
	long haveBankAccount;
	
	public Father (String useMobile,long haveBankAccount) {
		this.useMobile = useMobile;
		this.haveBankAccount = haveBankAccount;
		System.out.println(this.useMobile );
		System.out.println(this.haveBankAccount);
	}
	
	 static void han () {
	
		System.out.println("used keypad mobile");
	}
    static void han1 () {
		System.out.println("having a bank account");
	}

}
