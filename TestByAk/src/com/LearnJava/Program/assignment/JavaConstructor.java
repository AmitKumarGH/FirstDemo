package com.LearnJava.Program.assignment;

public class JavaConstructor {
	private String name;
//	constructor	
	JavaConstructor()	{
		System.out.println("Constructor Called:");
		name = "Amit";
	}
	public static void main(String[] args) {
//		constructor is invoked while creating object of the main class
		JavaConstructor obj = new JavaConstructor();
		System.out.println("The name is "+obj.name);
	}
}
