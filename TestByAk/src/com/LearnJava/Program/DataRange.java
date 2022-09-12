package com.LearnJava.Program;

public class DataRange {
	public static void main(String[] args) {
		byte i = 127;
		byte j = (byte)(i+1);
		byte k = -128;
		byte m = (byte)(k-2);
		System.out.println(j);
		System.out.println(m);
		
		int a = 5;
		int b = 6;
		String c = "Hello";
		System.out.println(a+b+c);
		System.out.println(a+c+b);
		System.out.println(c+a+b);
		
		System.out.println(c+(a+b));
	}
}
