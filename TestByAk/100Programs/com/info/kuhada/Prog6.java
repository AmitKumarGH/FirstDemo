package com.info.kuhada;

import java.util.Scanner;

public class Prog6 {
	void Swap() {
		int no1,no2,var3;
		Scanner data = new Scanner(System.in);
		System.out.print("Enter First No:");
		no1 = data.nextInt();
		System.out.print("Enter Second No:");
		no2 = data.nextInt();
		System.out.println("Before Swap:");
		System.out.println("First No is: "+no1);
		System.out.println("Second No is: "+no2);
		var3 = no1;
		no1 = no2;
		no2 = var3;
		System.out.println("After Swap:");
		System.out.println("First No is: "+no1);
		System.out.println("Second No is: "+no2);
		data.close();
	}
}
