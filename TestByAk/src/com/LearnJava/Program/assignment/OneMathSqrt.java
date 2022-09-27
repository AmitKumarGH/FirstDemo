package com.LearnJava.Program.assignment;

import java.util.Scanner;
import java.lang.Math;

public class OneMathSqrt {
	//8.Function to concatenate two different halves of given strings
    public static void swapTwoHalves(String s1, String s2)
    {
        int la = s1.length();
        int lb = s2.length();
         
        // Creating new strings by
        // exchanging the first half
        // of a and b. 
        String c = s1.substring(0,la/2) +
        		s2.substring(0,lb/2);
        System.out.println(c);
    }
//7. // Function that swap first and
    // the last character of a string
    public static String swapFirstAndLast(String s)
    {
  
        // Check if the string has only
        // one character then return
        // the string
        if (s.length() < 2)
            return s;
  
        // Converting the string into
        // a character array
        char[] ch = s.toCharArray();
  
        // Swapping first and the last
        // character of a string
        char temp = ch[0];
        ch[0] = ch[ch.length - 1];
        ch[ch.length - 1] = temp;
  
        // Converting character to
        // string and return
        return String.valueOf(ch);
    }
	public static void main(String[] args) {
		//1.
				System.out.println("1.Evaluate the expression. Math.sqrt(1+2+3+4):");
		        System.out.println("Answer:"+ Math.sqrt(1+2+3+4));
		//2.
		        System.out.println("2.Evaluate the expression. Math.exp(-Math.pow(Math.sin(1), 0.25)):");
		        System.out.println("Answer:"+ Math.exp(-Math.pow(Math.sin(1), 0.25)));
		//3.
		        System.out.println("3.Write a Java expression to calculate the area of"
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
		         * Area of any triangle = sqrt(s*(s-sideOne)(s-sideTwo)(s-sideThree))
		         * Where s = (sideOne + sideTwo + sideThree)/2
		         */
		        S = (s1 + s2 + s3) / 2;
		        area = Math.sqrt(S * (S - s1) * (S - s2) * (S - s3));
		        System.out.format("Answer:The Area of triangle = %.2f\n", area);
		//4.        
		        System.out.println("4.Write a Java expression for the mathematical formula. 1/Math.sqrt(2*pi))*Math.pow(e,-1*(Math.pow(x,2))/2");
		        double pi = 3.1415926;
				double e= 2.71828;
				double x = 2;// we can change value of x according to user
				double res = (1/Math.sqrt(2*pi))*Math.pow(e,-1*(Math.pow(x,2))/2);
				System.out.println(res);
		//5.        
		        System.out.println("5.The monthly payment c of a mortgage of n months"
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
		//6.
		      	System.out.println("6.Lets be a string of odd length. Write a Java "
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
		//7.
		      	System.out.println("7.Lets be a string of length at least 2. Write a "
		      			+ "Java expression to give a string with the first and last characters "
		      			+ "of s swapped. For example, if s is \"dog\", the expression should give \"god\".");
		     // Given String s
		        String s = "DOG";
		        System.out.println("Before Swap s="+s);
		        // Function Call
		        System.out.println("After Swap s="+swapFirstAndLast(s));
		//8.
		        System.out.println("8. Let s1 and s2 be two strings of even lengths. "
		        		+ "Write a Java expression to combine the first half of s1 and "
		        		+ "the second half of s2, if s1 is \"Computer\" and s2 is \"Programmer\", "
		        		+ "the expression should give \"CompProgr\".");
		     // Given strings
		        String str1 = "Computer";
		        String str2 = "Programmer";
		        System.out.println("First String S1="+str1);
		        System.out.println("Second String S2="+str2);
		        System.out.println("After combine the first half of s1 and the second half of s2:");
		        // Calling function
		        swapTwoHalves(str1, str2);
		//9.
		        System.out.println("9. A string variable fullName represents a full name such as "
		        		+ "\"Doe, John\". Write a Java expression to give a string of first initial "
		        		+ "and last name, e.g., \"J. Doe\". ");
		        String st = "Doe, John";

		        st = st.replace(" ", "");                                      //remove spaces
		        int i = st.indexOf(",");                                      //get pos of comma
		        String nam = st.charAt(i+1) + ". " + st.substring(0, i);      //create name
		        System.out.println("FullName:"+st);
		        System.out.println("first initial and last name="+nam);
		        scanner.close();
		        scan.close();
			}
	}

