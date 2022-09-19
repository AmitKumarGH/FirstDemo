package com.LearnJava.Program;

import java.util.Scanner;

public class StringEx {
	public static void main(String[] args) {
		StringBuilder st = new StringBuilder();// using stringbuilder class object
		Scanner value = new Scanner(System.in);
		System.out.println("Enter String to reverse it:");
		String s = value.next();
		st.append(s);
		st.reverse();//inbuild reverse method in stringbuiler n buffer
		System.out.println("Reverse String using stringBuilder:\n"+ st);
		
		System.out.println("using toCharArray:");
		char[] sArray = s.toCharArray();
		for(int i=sArray.length-1; i>=0;i--)
		{
			System.out.print(sArray[i]);
		}
		System.out.println("\nUsing While Loop");
		int sLength = s.length();
		while(sLength>0)
		{
			System.out.print(s.charAt(sLength-1));
			sLength--;
		}
		System.out.println("Using For loop:");
		for(sLength=s.length(); sLength>0;--sLength)
		{
			System.out.print(s.charAt(sLength-1));
		}
		value.close();
		
	}
}
