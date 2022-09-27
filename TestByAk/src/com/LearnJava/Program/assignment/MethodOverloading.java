package com.LearnJava.Program.assignment;

public class MethodOverloading {
	
	private static void display(int a) {
		 System.out.println("Value is ="+ a);
	}
	private static void display(int a, int b) {
		 System.out.println("Value is ="+ a+" and "+b);
	}
	public static void main(String[] args) {
		
		display(10);
		display(5,6);
	}
}
