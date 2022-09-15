package com.LearnJava.Program;

public class StudentArray {
	//Instance Variable /State / Properties
	final int SIZE=5;//constant initialization
	int id;
	String name;
	String course;
//	String subjects[] = new String[SIZE];
	String subjects[];
	double marks[] = new double[SIZE];
	String address;
	//Action / Method / Instance Method
	public void displayInfo() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Course: "+course);
		System.out.println("Subjects with Marks:");
		for(int i=0; i<subjects.length;i++) {
			System.out.print(subjects[i]+"=");
			System.out.println(marks[i]);
		}
		System.out.println("Address: "+address);
	}
	//default constructor
	StudentArray(){
		subjects = new String[] {"C", "C++", "Java"};
	}
	StudentArray(int id, String name){//local variable
		this.id = id;
		this.name = name;
		subjects = new String[] {"C", "C++", "Java"};
	}
}
