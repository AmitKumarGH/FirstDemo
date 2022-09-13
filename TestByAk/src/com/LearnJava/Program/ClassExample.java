package com.LearnJava.Program;

public class ClassExample {
	final int size = 5;
	int studentId;
	String studentName;
	String studentAddress;
	double studentMarks[] = new double[size];
	String studentSubjects[] = new String[size];
	
	public void displayInfo() {
		System.out.println("Student Id="+studentId);
		System.out.println("Student Name="+studentName);
		
		System.out.println("Student Subjects and Marks:");
		
		for(int i=0;i<studentSubjects.length;i++) {
			System.out.println(studentSubjects[i]+"=");
			System.out.println(studentMarks[i]);
		}
		System.out.println("Student Address="+studentAddress);
	}
}
