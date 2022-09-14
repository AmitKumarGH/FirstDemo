package com.LearnJava.HelloEx;

import java.util.Scanner;

public class students {
	public static void main(String[] args) {
		
//		int[] studentId = {101};
//		String[] studentName = {"Ak"};
//		String[] studentAddress = {"Mohali"} ;
//		String[] course = {"JAVA"};
//		double[] studentMarks = {90.00};
		int[] studentId = new int[5];
		String[] studentName = new String[10];
		String[] studentAddress= new String[10];
		String[] course= new String[10] ;
		double[] studentMarks= new double[10];
		students std = new students();
		Scanner input = new Scanner(System.in);
				
//			System.out.println("Name: "+ studentName[0]);
//			System.out.println("RollNo: "+ studentId[0]);
//			System.out.println("Course: "+ course[0]);
//			System.out.println("Address: "+ studentAddress[0]);
//			System.out.println("Marks: "+ studentMarks[0]);
		
		System.out.println("Enter student record:");
		
		for(int i=0; i<1;i++)
		{
			System.out.print("Name: ");
			studentName[i] = input.nextLine();
			System.out.print("RollNo: ");
			studentId[i] = input.nextInt();
			System.out.print("Course: ");
			course[i] = input.next();
			System.out.print("Address: ");
			studentAddress[i] = input.next();
			System.out.print("Marks: ");
			studentMarks[i] = input.nextDouble();
			
		}
		System.out.println("Available Student Record:");
		for(int i=0; i<1;i++)
		{
			System.out.println("Name: "+ studentName[i]);
			System.out.println("RollNo: "+ studentId[i]);
			System.out.println("Course: "+ course[i]);
			System.out.println("Address: "+ studentAddress[i]);
			System.out.println("Marks: "+ studentMarks[i]);
		}
}
}
		
	

