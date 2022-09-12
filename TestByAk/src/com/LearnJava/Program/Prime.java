package com.LearnJava.Program;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter any number=");
		int Number = num.nextInt();
		int i;
		boolean f =  true;
		for(i=2; i<=Number/2; i++)
		{

			if(Number%i == 0)
			{
				System.out.println(Number+ "is Not a Prime Number");
				f=false;
			}
		}


		if(f) {
			System.out.println(Number+" is a Prime Number");
		}



	}
}
