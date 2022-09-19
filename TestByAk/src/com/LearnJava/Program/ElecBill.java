package com.LearnJava.Program;

import java.util.Scanner;

public class ElecBill {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Unit to calculate Bill:");
		int units = sc.nextInt();
		double bill=0;
		if(units>0 && units<=199)
		{
			bill = units;
		}
		
		else if(units>=200 && units<=399)
		{
			bill = 100+(units-199)*2;
			//
		}
		else if(units>=400 && units<=499)
		{
			bill =  100+(399-200)*2 + (units-399)*3;
			//100-199=0
			//200-399=2
		}
		else if(units>=500 && units<=599)
		{
			bill =  100+(399-200)*2 + (499-400)*3 + (units-499)*4;
			//100-199=0
			//200-399=2
		}
		System.out.println("Bill:"+bill);
		
		double totalbill=0;
		double ed=34.00;
		double gst=0;
		gst = bill*.15;
		totalbill = bill+ed+gst;
		System.out.println("Electricity Duty:"+ed);
		System.out.println("GST 15%:"+gst);
		System.out.println("Total Bill:"+totalbill);
	}
}
