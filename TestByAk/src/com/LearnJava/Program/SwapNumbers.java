package com.LearnJava.Program;

public class SwapNumbers {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("Before Swap Number1="+num1);
		System.out.println("Before Swap Number2="+num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After Swap Number1="+num1);
		System.out.println("After Swap Number2="+num2);
		
	}
}
