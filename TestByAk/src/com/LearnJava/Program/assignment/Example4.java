package com.LearnJava.Program.assignment;
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							import java.lang.Math;
public class Example4 {
	public static void main(String[] args) {
		
				double pi = 3.1415926;
				double e= 2.71828;
				double x = 2;// we can change value of x according to user
				double res = (1/Math.sqrt(2*pi))*Math.pow(e,-1*(Math.pow(x,2))/2);
				System.out.println(res);
	}
}
