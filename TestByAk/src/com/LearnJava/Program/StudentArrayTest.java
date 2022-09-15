package com.LearnJava.Program;

import java.util.Scanner;

//core class
public class StudentArrayTest {
	public static void main(String[] args) {
		//create object to get StudentArray information
//		StudentArray student1 = new StudentArray();
//		StudentArray student2 = new StudentArray();
		Scanner sc =new Scanner(System.in);
		StudentArray students[] = new StudentArray[5];//Array created
		
		for(int i=0; i<students.length;i++) {
			System.out.println("Enter Student Name: ");
			String name =sc.next();
			
			students[i] = new StudentArray(i+1, name);//constructor
		}
		
		for(int i=0; i<students.length;i++) {
			students[i].displayInfo();
		}
//		System.out.println("Id: "+student1.id);
//		System.out.println("Name: "+student1.name);
//		System.out.println("Course: "+student1.course);
//		System.out.println("Subjects with Marks:");
//		for(int i=0; i<student1.subjects.length;i++) {
//			System.out.print(student1.subjects[i]+"=");
//			System.out.println(student1.marks[i]);
//		}
//		System.out.println("Address: "+student1.address);
		
//		student1.displayInfo();
//		student2.displayInfo();
	}
	
	
}
