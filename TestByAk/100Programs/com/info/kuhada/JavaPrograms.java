package com.info.kuhada;

import java.util.Scanner;

public class JavaPrograms{
	public static void main(String[] args) {
		
		char choice;
		int progNum = 0;
		Scanner num = new Scanner(System.in);
		
		System.out.println("Java Programs:");
		System.out.println("Enter A for 1-20 Programs List");
		System.out.println("Enter B for 21-40 Programs List");
		System.out.println("Enter C for 41-60 Programs List");
		System.out.println("Enter D for 61-80 Programs List");
		System.out.println("Enter E for 81-100 Programs List");
		choice = num.next().charAt(0); ;
		if(choice == 'A')
		{
			System.out.println("1.Simple Java Program");
			System.out.println("2.Print Integer in java");
			System.out.println("3.Command Line Argument");
			System.out.println("4.How to get Using input using Scanner Program in java");
			System.out.println("5.How to convert Fahrenheit to Celsius	Program in java");
			System.out.println("6.How to swap 2 no using 3rd variable   Program in java");
			System.out.println("7.How to swap 2 no without using 3rd variable   Program in java");
			System.out.println("8.How to add two number Program in java");
			System.out.println("9.Find Largest  no in java Program");
			System.out.println("10.If Else clause in java");
			System.out.println("11.If Else clause in java- Program 2");
			System.out.println("12.Nested If Else clause in java");
			System.out.println("13.How to check Odd and Even Number in java");
			System.out.println("14.Find factorial for given no Program in Java");
			System.out.println("15.How to complete 2 string in Java program");
			System.out.println("16.Simple For  Loop Program in Java");
			System.out.println("17.Print Star console using Loop");
			System.out.println("18.Print Star console using Loop");
			System.out.println("19.While loop Program in java");
			System.out.println("20.Print Reverse number in java program");
			System.out.println("Enter Program Number to Execute");
			progNum = num.nextInt();
		}
		else if(choice == 'B')
		{
			System.out.println("21.While loop using break Program in java");
			System.out.println("22.While loop using break and continue Program in java");
			System.out.println("23.Print all alphabet using for loop Program in java");
			System.out.println("24.Enhance loop in java Program");
			System.out.println("25.Print Multiplication table Program in java");
			System.out.println("26.Print prime no  Program in java");
			System.out.println("27.Check no is Armstrong or not   in java Program");
			System.out.println("28.Print Floyd’s Triangle in java Program");
			System.out.println("29.Find All substring of string in java Program");
			System.out.println("30.Print reverse string in java Program");
			System.out.println("31.Check Given No is palindrome or Not  in java Program");
			System.out.println("32.How to add two matrix in java Program");
			System.out.println("33.How to multiply two matrix in java Program");
			System.out.println("34.How to get transpose of matrix in java Program");
			System.out.println("35.How to compare 2 string in java Program");
			System.out.println("36.How to string width with specific char in java Program");
			System.out.println("37.How to use indesOf()  in java Program");
			System.out.println("38.How to replace string with another string in java Program");
			System.out.println("39.How to split string in java Program");
			System.out.println("40.How to remove space in string both end in java Program");
		}
		else if(choice == 'C')
		{
			System.out.println("41.How to convert all char in string lower case in java Program");
			System.out.println("42.How to create method  in java Program");
			System.out.println("43.Find Length, Concatenate and Replace String in Java Program");
			System.out.println("44.How Static block working in java Program");
			System.out.println("45.Difference between Static and Instance method working in java Program");
			System.out.println("46.How to create Multiple class in java Program");
			System.out.println("47.How to create constructor  in java Program");
			System.out.println("48.How to create constructor overloading in java Program");
			System.out.println("49.Exception Handling java Program");
			System.out.println("50.How to throw exception in  java Program");
			System.out.println("51.Advantage of Finally in Exception Handling java Program");
			System.out.println("52.How to create Interface in java Program");
			System.out.println("53.How to print date and time in java Program");
			System.out.println("54.How to SQL Date in java Program");
			System.out.println("55.How to Date format in java Program");
			System.out.println("56.How to Generate random number in java Program");
			System.out.println("57.How perform garbage collection in java Program");
			System.out.println("58.How to get own IP Address in java Program");
			System.out.println("59.How to open notepad in java Program");
			System.out.println("60.Leaner search Program in java");
			System.out.println("Enter Program Number to Execute");
			progNum = num.nextInt();
		}
		else if(choice == 'D')
		{
			System.out.println("61.Binary search Program in java");
			System.out.println("62.Bubble sort Program in java");
			System.out.println("63.How to connect Database using java Program");
			System.out.println("64.How to insert data in table using JDBC in java Program");
			System.out.println("65.How to insert image using JDBC in java Program");
			System.out.println("66.How to execute Procedure in JDBC in java Program");
			System.out.println("67.How to check Regular expression in  java Program");
			System.out.println("68.How to create Multithreading program in java");
			System.out.println("69.How to join thread in java program");
			System.out.println("70.How to write data in text file using java program");
			System.out.println("71.How to read data from text file using java program");
			System.out.println("72.How to get URL of site using java Programs");
			System.out.println("73.How to get IP address from site URL using java program");
			System.out.println("74.How to create AWT program in java");
			System.out.println("75.How to add lable in AWT program in java");
			System.out.println("76.How to add text area program in java");
			System.out.println("77.How to dropdown in AWT program in java");
			System.out.println("78.How to create Swing program in java");
			System.out.println("79.How to add checkbox in Swing program in java");
			System.out.println("80.How to convert string to integer in java program");
			System.out.println("Enter Program Number to Execute");
			progNum = num.nextInt();
		}
		else if(choice == 'E')
		{
			System.out.println("81.How to convert integer to string in java program");
			System.out.println("82.How to convert string to long in java");
			System.out.println("83.How to convert string to float in java");
			System.out.println("84.How to convert string to double in java program");
			System.out.println("85.How to convert string to date in java program");
			System.out.println("86.Create ArrayList program in java");
			System.out.println("87.How to create LinkedList program in java");
			System.out.println("88.How to ArrayList using list interface program in java");
			System.out.println("89.How to create Hashset program in java");
			System.out.println("90.How to create LinkedHashSet program in java");
			System.out.println("91.How to create TreeSet program in java");
			System.out.println("92.How to create PriorityQueue program in java");
			System.out.println("93.How to create HashMap using map interface program in java");
			System.out.println("94.How to create LinkedHashMap program in java");
			System.out.println("95.How to create TreeMap program in java");
			System.out.println("96.How to create Hashtable program in java");
			System.out.println("97.How to create Array program in java");
			System.out.println("98.How to create Multidimensional array program in java");
			System.out.println("99.How to create Find Factorial No using Recursion Program in java");
			System.out.println("100.How to create Method Overriding program in java");
			System.out.println("Enter Program Number to Execute");
			progNum = num.nextInt();
		}
		else
		{
			System.out.println("Enter Valid Character A to E");
		}
		if(progNum == 1) {
			Prog1 pro1 = new Prog1();
			pro1.hello();
		}
		if(progNum == 2) {
			Prog2 pro2 = new Prog2();
			pro2.PrintNum();
		}
		if(progNum == 3) {
			
		}
		num.close();
	}

	
}
