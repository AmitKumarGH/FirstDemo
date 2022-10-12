package com.info.kuhada;

import java.util.Scanner;

public class Prog4 {
	void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name as a Input:");
		String data = in.next();
		System.out.print("Entered Input is: "+data);
		in.close();
	}
}
