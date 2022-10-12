package com.info.kuhada;

import java.util.Scanner;

public class Prog2 {
	void PrintNum() {
		Scanner num = new Scanner(System.in);
		
		System.out.println("Enter any Integer Number:");
		int number = num.nextInt();
		System.out.println("Integer Number is: "+ number);
		num.close();
	}
	
}
