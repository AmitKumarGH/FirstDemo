package com.info.kuhada;


import java.util.Scanner;

public class JavaPrograms{
	public static void main(String[] args) {
		
		char choice;
		int progNum = 0;
		Scanner sc = new Scanner(System.in);
		
		Menu m = new Menu();
		choice = m.MainMenu();
		
		if(choice == 'A'|| choice == 'a')
		{
			OptionA a = new OptionA();
			progNum = a.OptA();
		}
		else if(choice == 'B'|| choice == 'b')
		{
			OptionB b = new OptionB();
			progNum = b.OptB();
		}
		else if(choice == 'C'|| choice == 'c')
		{
			OptionC c = new OptionC();
			progNum = c.OptC();
		}
		else if(choice == 'D'|| choice == 'd')
		{
			OptionD d = new OptionD();
			progNum = d.OptD();
		}
		else if(choice == 'E'|| choice == 'e')
		{
			OptionE e = new OptionE();
			progNum = e.OptE();
		}
		else
		{
			System.out.println("Enter Valid Character A to E or a to e");
		}if(progNum == 1) {
			System.out.println("Program:1.Simple Java Program");
			Prog1 pro1 = new Prog1();
			pro1.hello();
			System.out.print("Enter \"M\" for main Menu and \"E\" for Exit: ");
			char option = sc.next().charAt(0);
			if(option == 'M')
			{
				m.MainMenu();
				
			}
			
		}if(progNum == 2) {
			System.out.println("Program:2.Print Integer in java");
			Prog2 pro2 = new Prog2();
			pro2.PrintNum();
		}if(progNum == 3) {
			System.out.println("Program:3.Command Line Argument");
			System.out.println("Your first argument is: "+args[0]);  
		}if(progNum == 4) {
			System.out.println("Program:4.How to get Using input using Scanner Program in java");
			Prog4 pro4 = new Prog4();
			pro4.input();
		}if(progNum == 5) {
			System.out.println("Program:5.How to convert Fahrenheit to Celsius	Program in java");
			double a;
			System.out.print("Enter  Fahrenheit temperature:");
			a=sc.nextDouble();
			Prog5 pro5 = new Prog5();
			double result=pro5.celsius(a);	
			System.out.println("Celsius temperature is = "+result);	
			sc.close();
		}if(progNum == 6) {
			System.out.println("Program:6.How to swap 2 no using 3rd variable   Program in java");
			Prog6 pro6 = new Prog6();
			pro6.Swap();
		}if(progNum == 7) {
			System.out.println("Program:7.How to swap 2 no without using 3rd variable   Program in java");
			Prog7 pro7 = new Prog7();
			pro7.SwapWithout();
		}if(progNum == 8) {
			System.out.println("Program:8.How to add two number Program in java");
			Prog8 pro8 = new Prog8();
			pro8.Add();
		}
		sc.close();
	}

	
}
