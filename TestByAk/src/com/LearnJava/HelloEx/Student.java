package com.LearnJava.HelloEx;

import java.util.Scanner;

public class Student {
	
	private int Id;
	private String studentName;
	private String studentAddress;
	private String course;
	private double studentMarks;
	
	
	public int getId() {
		return Id;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", studentName=" + studentName + ", studentAddress=" + studentAddress + ", course="
				+ course + ", studentMarks=" + studentMarks + "]";
	}
	public void setId(int id) {
		Id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(double studentMarks) {
		this.studentMarks = studentMarks;
	}
	public void show() {
	System.out.println("Student Data:");
	for(int i=0;i<students.length;i++)
	{
		System.out.println("Name: "+ students[i].StudentName);
		System.out.println("RollNo: "+ students[i].Id);
		System.out.println("Course: "+ students[i].Course);
		System.out.println("Address: "+ students[i].StudentAddress);
		System.out.println("Marks: "+ students[i].StudentMarks);
	}
	}
}
