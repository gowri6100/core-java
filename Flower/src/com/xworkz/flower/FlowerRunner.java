package com.xworkz.flower;

import com.xworkz.flower.dao.FlowerDao;
import com.xworkz.flower.dto.Flowerdto;

public class FlowerRunner {
	public static void main(String[] args) {

		FlowerDao obj = new FlowerDao();
		Flowerdto obj1 = new Flowerdto();

		obj1.setNameOfTheFlower("lotus");
		System.out.println(obj1.getNameOfTheFlower());

		obj1.setType("bot smell");
		System.out.println(obj1.getType());

		obj1.setPrice(100);
		System.out.println(obj1.getPrice());

		obj1.setSize(34);
		System.out.println(obj1.getSize());
		
		obj.flowerList("lilly");
		obj.read ();
		
		obj.updateflowerbyindex("Rose", 1);
		
		obj.updateByflowernameName("Rose","Red Rose");
		
		obj.deleteByIndex(1);
		
		obj.DeleteByName("Rose");
		
		obj.search("lily");
	}

}
