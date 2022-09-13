package com.LearnJava.Program;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		//int rollNo[] = new int [5];
		int rollNo[];
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array=");
		size = sc.nextInt();
		while(size<=0)
		{
			System.out.print("Enter Size of Array");
			size = sc.nextInt();
		}
		rollNo = new int [size];
				
		for(int i=0; i<size; i++)
		{
			System.out.print("Enter RollNo["+i+"]=");
			rollNo[i] = sc.nextInt();
		}
		for(int i=0; i<size; i++)
		{
			System.out.println("RollNo["+i+"]="+rollNo[i]);
			
		}
//		System.out.println(rollNo[0]);
//		System.out.println(rollNo[1]);
//		System.out.println(rollNo[2]);
//		System.out.println(rollNo[3]);
//		System.out.println(rollNo[4]);
	}

}
