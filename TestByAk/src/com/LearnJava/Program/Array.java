package com.LearnJava.Program;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		//int rollNo[] = new int [5];
		int rollNo[];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array=");
		int size = sc.nextInt();
		
		
		while(size<=0)
		{
			System.out.print("Enter Size of Array");
			size = sc.nextInt();
		}
		rollNo = new int [size];
		int value = 0;
		for(int i=0; i<rollNo.length; i++)
		{
			for(i=0; i<rollNo.length; i++)
			{
			System.out.print("Enter RollNo["+i+"]=");
			value = sc.nextInt();
			
			//System.out.println(i);
							
			}
			System.out.println("RollNo["+i+"]="+value);
			//System.out.println(i);
		}
		
		
//		System.out.println(rollNo[0]);
//		System.out.println(rollNo[1]);
//		System.out.println(rollNo[2]);
//		System.out.println(rollNo[3]);
//		System.out.println(rollNo[4]);
	}

}
