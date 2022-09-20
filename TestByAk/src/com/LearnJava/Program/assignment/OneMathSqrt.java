package com.LearnJava.Program.assignment;

import java.util.Scanner;

public class OneMathSqrt {
	public static void main(String[] args) {
		System.out.println("1.Evaluate the expression. Math.sqrt(1+2+3+4):");
        System.out.println("Answer:"+ Math.sqrt(1+2+3+4));
        System.out.println("2.Evaluate the expression. Math.exp(-Math.pow(Math.sin(1), 0.25)):");
        System.out.println("Answer:"+ Math.exp(-Math.pow(Math.sin(1), 0.25)));
        System.out.println("3. Write a Java expression to calculate the area of"
        		+ " a triangle, given three sides a, b, c. (Heron's formula):");
        double s1, s2, s3, area, S;
        Scanner scanner;
        scanner = new Scanner(System.in);
        // Take input from user
        System.out.println("Enter Three Sides of a Triangle:");
        s1 = scanner.nextDouble();
        s2 = scanner.nextDouble();
        s3 = scanner.nextDouble();
 
        /*
         * Area of any triangle = sqrt(s*(s-sideOne)*(s-sideTwo)*(s-sideThree))
         * Where s = (sideOne + sideTwo + sideThree)/2
         */
        S = (s1 + s2 + s3) / 2;
        area = Math.sqrt(S * (S - s1) * (S - s2) * (S - s3));
        System.out.println("4. Write a Java expression for the mathematical formula.");
        System.out.format("Answer:The Area of triangle = %.2f\n", area);
        System.out.println("5. The monthly payment c of a mortgage of n months"
        		+ " with monthly interest rater for a principal p is given by "
        		+ "the mathematical formula. pr(1+r)\" (1+r)\" - 1 Write a Java "
        		+ "expression to calculate the monthly payment.");
        Scanner scan = new Scanner(System.in); 
      	System.out.print("Enter Principal Amount : ");
      	double principal = scan.nextDouble(); 
      	System.out.print("Enter Rate of Interest : ");
      	double rate = scan.nextDouble(); 
      	rate =( rate/100)/12; 
      	System.out.print("Enter Time period in years : ");
      	int time = scan.nextInt();
      	time = time * 12; 
      	double p= (principal * rate) / (1 - Math.pow(1 + rate, -time));
      	System.out.println("Payment: " + p);
      	System.out.println("6. Lets be a string of odd length. Write a Java "
      			+ "expression to give a substring of s with the center character "
      			+ "removed. For example, if sis \"Program\", the expression should "
      			+ "give \"Proram\".");
      	String str = "Program";
      	int l = str.length();
      	System.out.println(str);
      	if((l % 2) == 0){
      	    System.out.println(str);
      	}else{
      	    StringBuffer sb = new StringBuffer(str);
      	    System.out.println(sb.deleteCharAt((l-1)/2).toString());
      	}

       scanner.close();
	}
}
