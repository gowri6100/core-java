package com.xworkz.oopsprograming;

public class VivekanandaCollege extends University {
	String colorOfBoard;
	String smartClass;
	
	public  VivekanandaCollege(String colorOfBoard,String smartClass) {
		this.colorOfBoard = colorOfBoard;
		this.smartClass = smartClass;
		System.out.println(this.colorOfBoard);
		System.out.println(this.smartClass);
	}
	
	public static void black(){
		System.out.println("use to write");
	}
	public static void board(){
		System.out.println("used to teach");
	}

}
