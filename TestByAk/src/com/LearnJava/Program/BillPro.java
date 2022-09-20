package com.LearnJava.Program;

import java.util.Scanner;

public class BillPro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Unit to calculate Bill:");
		int units = sc.nextInt();
		
        double billToPay = 0;  
        
        if(units <= 100)  
        {  
            billToPay = units * 1;  
        }  
        
        else if(units <= 200){  
            billToPay = 100 * 1 + (units - 100) * 2;  
        }  
        
        else if(units >200 && units<=500)  
        {  
            billToPay = 100 * 1 + 100 * 2 + (units - 200) * 3;  
        }
        else if(units >500 || units<=1000)  
        {  
            billToPay = 100 * 1 + 100 * 2 + 300 * 3 + (units - 500) * 4;  
        }
        System.out.println("The electricity bill for " +units+ " is : " + billToPay);   
	}
}
