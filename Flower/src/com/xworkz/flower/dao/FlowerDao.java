package com.xworkz.flower.dao;

public class FlowerDao {
	
	String [] flower = new String [10];
	//private Object flowername;
	
	public String [] flowerList (String str) {
		if(str!=null  && str.length() > 3) {
			for(int i=0;i<flower.length; i++) {
				if (flower[i] == null) {
					flower[i] = str;
					System.out.println(flower[i]);
					return flower;
				}
			}
		}
		System.out.println("not a flower");
		return flower;
		
				}
	//read
	public  void read () {
		for(int j=0;j<flower.length;j++) {
			System.out.println(flower[j]);
			
		}
		
	}
	//update 
	public boolean updateflowerbyindex(String flowername,int index) {
		if(flowername!=null) {
			if(flowername.length() >=3) {
				flower[index] = flowername;
				System.out.println("The given flower name " + flowername + " is updated");
				return true;

				
			}
			System.out.println("given flower name is not valid in length");
		}
		
	
	{
	System.out.println("Given Grocery Name is null");
	
	return false;
	}
	}

	
	
	public String updateByflowernameName(String presentflower, String updatingflower) {
		if (presentflower != null) {
			if (updatingflower != null) {
				if (updatingflower.length() >= 3) {
					System.out.println("The Given flower Name  " + updatingflower + "  Is Valid");
					for (int i = 0; i < flower.length; i++) {
						if (flower[i] != null) {

							if (flower[i].equals(presentflower)) {
								System.out.println("Given Previous Name " + presentflower + " is valid");
								flower[i] = updatingflower;
								System.out.println("The flowerName " + updatingflower + "  is updated");
								return updatingflower;
							}
						}
						{
							System.out.println("Previous Name is not Found");
						}
					}
					{
						System.out.println("The ArrayIndex is null");
					}
					{
						System.out.println("Given updating flower length is not valid");
					}
				}
				{
					System.out.println("updating name is null");
				}
			}
			{
				System.out.println("Previous name is null");
			}
		}
		return updatingflower ;
	}
	public boolean deleteByIndex(int index) {
		if (index >= 0) {
			if (index < flower.length) {
				flower[index] = null;
				System.out.println("Deleted Successfully");
				return true;
			}
			{
				System.out.println("Index Length is not valid");

			}
		}
		{
			System.out.println("Negetive Index Is given");
		}
		return false;
	}
	
	public boolean DeleteByName(String dltName) {
		if (dltName != null) {
			for (int i = 0; i < flower.length; i++) {
				if (dltName.equals(flower[i])) {
					flower[i] = null;
					System.out.println("Deleted successfully");
					return true;
				}
			}
			{
				System.out.println("The length of the name is not valid");

			}
		}
		else
		{
			System.out.println("The dltName Is null");
			return false;
		}
		return false;
	}
	public boolean search(String flowername) {
		if(flowername!=null && flowername.length() >3) {
			for(int i=0;i<flower.length;i++) {
				if(flower[i]!=null) {
					if(flower[i].equals(flowername)) {
						System.out.println("flower is found");
						return true;
						
					}
					
				}
				
			}	
			
		}
		System.out.println("flower not found");
		return false;
		
		
	}
}
	

		
				
			
		

				
			
			
	


