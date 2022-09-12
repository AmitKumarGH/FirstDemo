package com.LearnJava.Program;

public class Typecasting {
	public static void main(String[] args) {
		
		int a = 9;
		float f = a;
		
		System.out.println(a);
		System.out.println("Widening(Typecasting)"+f);//type conversion-implicit-auto
		
		float f2 =10.5f;
		int b = (int)f2;
		
		System.out.println(f2);
		System.out.println("Narrowing(Typecasting)"+b);//type casting-explicit-manually
	}
}
