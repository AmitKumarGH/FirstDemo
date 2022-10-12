package com.info.kuhada;

import java.util.Scanner;

public class Prog8 {
	void Add() {
		int num1,num2, sum;
		Scanner num = new Scanner(System.in);
		System.out.print("Enter First Number:");
		num1 = num.nextInt();
		System.out.print("Enter Second Number:");
		num2 = num.nextInt();
		sum = num1 + num2;
		System.out.println("Sum="+num1+"+"+num2);
		System.out.println("Sum="+sum);
		num.close();
	}
}
