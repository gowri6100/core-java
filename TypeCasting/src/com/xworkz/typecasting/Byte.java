package com.xworkz.typecasting;

public class Byte {
	
	public static void main(String[]args) {
		//type converting 
		
	int a = 10;
	long b = a;
	System.out.println(b);
	
	short c =100;
	long d = c ;
	System.out.println(d);
	
	byte e =12;
	short f = e;
	System.out.println(f);
	
	float g = 12.34f;
	double h = g;
	System.out.println(h);
	
	byte i = 23;
	int j = i ;
	System.out.println(j);
	
	int  k = 123;
	long l = k;
	System.out.println(l);
	
	//type casting 
	
	double m = 123.74775d;
	float n = 12.32f;
	m=n;
	m = (float) n;
	System.out.println(m);
	
	int o = 12332;
	byte p = 123;
	o=p;
	o = (int) p;
	
	System.out.println(p);
	
	double q =12.345d;
	int r = (int )q;
	System.out.println(q);
	
	float s = 23.654f;
	byte t =(byte) s;
	System.out.println(t);
	
	long u = 123456231;
	int v = (int) u;
	System.out.println(v);
	
	long w = 1938929919;
	byte x = (byte) w;
	System.out.println(w);
		
	
	}

}
