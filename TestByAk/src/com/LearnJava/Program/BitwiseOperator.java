package com.LearnJava.Program;

import java.util.Scanner;

public class BitwiseOperator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		System.out.println(a | b);
		System.out.println(a & b);
		System.out.println(a ^ b);
		System.out.println(a << 2);//00001010->00101000
		System.out.println(a >> 2);//00001010->00000010
		keyboard.close();
	}
}
