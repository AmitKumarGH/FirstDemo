package com.LearnJava.Program;

public class TypeCast {
	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		byte a = 10;
		//byte b = a +10;//cannot convert integer to byte
		byte b = (byte)(a+10);
		//double y = 15;
		//double z = x/y;
		double z = (double)x/y;//casting
		System.out.println(x/y);
		System.out.println(z);
		System.out.println((double)x/y);//casting 
		System.out.println(x%y);
		System.out.println(y%x);
		System.out.println(b);
 	}
}
