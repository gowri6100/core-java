package com.xworkz.array;

public class ArrayIf {
	public static void main(String []args) {
		
		int [] coins = {1,2,3,4,5,6,7,8,9};
		byte [] index = {10,20,30,40,50};
		
		//print the value as it is 
		for (int i=0;i<=8;i++) {
			System.out.println(coins[i]);
		}
		//print the value as it is by coins.length
		System.out.println("------------------------");
		for (int i=0;i<=coins.length-1;i++) {
			System.out.println(coins [i]);
		}
		//reverse skip value 
		System.out.println("------------------------------");
		for (int j=coins.length-1;j>=0;j--) {
			if(coins[j]%2==0) {
			System.out.println(coins [j]);
		}
		}
		//ascending skip value
		System.out.println("-------------------------------------");
		for (int k=0;k<=coins.length-1;k++) {
			if (coins[k]%2==0) {
				System.out.println(coins[k]);
			}
		}
		//reverse skip value 
		System.out.println("-------------------------");
		for (int l=index.length-1;l>=0;l--) {
			if (index[l]!=0) {
				System.out.println(index[l]);
				l--;
			}
		}
		for (int )
		
		
	}

}
