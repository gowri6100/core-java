package com.xworkz.familydata;

public class Family {
	
	String familyName;
	int noOfMember;
	String headOfTheFamily;
	int incomeOfTheFamily;
	int expensesOfTheFamily;
	
	
	public Family (String familyName,int noOfMember,String headOfTheFamily,int incomeOfTheFamily,int expensesOfTheFamily){
	this.familyName = familyName;
	this.noOfMember = noOfMember;
	this.headOfTheFamily = headOfTheFamily;
	this.incomeOfTheFamily = incomeOfTheFamily;
	this.expensesOfTheFamily = expensesOfTheFamily;
	}
		
		public String toString() {
			return "NAMEOFTHEFAMILY= :"+ familyName +  "   MEMBER = :" + noOfMember +   "  HEAD =:"+ headOfTheFamily + "   INCOME = :" +  incomeOfTheFamily + "  EXPENSES = :" + expensesOfTheFamily ;
			
		}
		public boolean equals(Family run1) {
			if (this.noOfMember == run1.noOfMember & this.headOfTheFamily.equals(run1.headOfTheFamily) & this.incomeOfTheFamily==(run1.incomeOfTheFamily)){
			return true;
			}
			else {
			return false;
			}
			
		}
		
}
