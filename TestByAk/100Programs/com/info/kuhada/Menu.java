package com.info.kuhada;

import java.util.Scanner;

public class Menu {
	public char MainMenu() {
		char choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Java Programs:");
		System.out.println("Enter A for 1-20 Programs List");
		System.out.println("Enter B for 21-40 Programs List");
		System.out.println("Enter C for 41-60 Programs List");
		System.out.println("Enter D for 61-80 Programs List");
		System.out.println("Enter E for 81-100 Programs List");
		choice = sc.next().charAt(0);
		if(choice == 'A'|| choice == 'a')
		{
			OptionA a = new OptionA();
			a.OptA();
		}
		else if(choice == 'B'|| choice == 'b')
		{
			OptionB b = new OptionB();
			b.OptB();
		}
		else if(choice == 'C'|| choice == 'c')
		{
			OptionC c = new OptionC();
			c.OptC();
		}
		else if(choice == 'D'|| choice == 'd')
		{
			OptionD d = new OptionD();
			d.OptD();
		}
		else if(choice == 'E'|| choice == 'e')
		{
			OptionE e = new OptionE();
			e.OptE();
		}
		else
		{
			System.out.println("Enter Valid Character A to E or a to e");
		}
		
		return choice;
	}
}
