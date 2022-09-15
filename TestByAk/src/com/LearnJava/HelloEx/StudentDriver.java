package com.LearnJava.HelloEx;

import java.util.Scanner;

public class StudentDriver {
	public static void main(String[] args) {

		Student students []  = new Student[2];
		Scanner input = new Scanner(System.in);
		// write a loop
		for(int i=0;i<students.length;i++)
		{
			// read info for student
			//create student object
			// keep object in array		
			System.out.print("Name: ");
			String studentName = input.next();
			System.out.print("RollNo: ");
			int Id = input.nextInt();
			System.out.print("Course: ");
			String course = input.next();
			System.out.print("Address: ");
			String studentAddress = input.next();
			System.out.print("Marks: ");
			double studentMarks = input.nextDouble();
			Student student = new Student();
			// setter
			student.setStudentName(studentName);
			student.setId(Id);
			student.setCourse(course);
			student.setStudentAddress(studentAddress);
			student.setStudentMarks(studentMarks);
			students[i]  = student;
		}

		System.out.println("Student Data:");
		for(int i=0;i<students.length;i++)
		{
			students[i].show();
		}
		input.close();
	}
}
