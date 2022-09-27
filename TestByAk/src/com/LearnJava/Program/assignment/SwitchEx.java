package com.LearnJava.Program.assignment;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose size from 29|42|44|48:");
		int number = sc.nextInt();
		String size;
		switch (number) {
		case 29:
			size = "Small";
			break;
		case 42:
			size = "Medium";
			break;
		case 44:
			size = "Large";
			break;
		case 48:
			size = "Extra-Large";
			break;
		default:
			size = "Unknown";
			break;
		}
		System.out.println("Size= "+size);
	}
}
