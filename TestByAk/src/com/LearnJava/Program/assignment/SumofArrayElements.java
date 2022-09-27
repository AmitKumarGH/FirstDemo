package com.LearnJava.Program.assignment;

public class SumofArrayElements {
	public static void main(String[] args) {
		int[] numbers = {4,8,4,2,3,1};
		int sum = 0;
		for(int number: numbers)
		{
			sum += number;
		}
		System.out.println("Sum = " + sum);
	}
}