package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse21 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter unit of electricity to get the bill");
			double unit= sc.nextDouble();
		
			if(unit<=50)
			{
				double  bill1= 0.50 * unit;
				System.out.println("Amount payable is::"+bill1);
			}
				
			
			else if(unit>50 && unit<=150)
			{
				double bill2 = ( 0.50 * unit) + (0.75 * unit-50);
				System.out.println("Amount payable is::"+bill2);
			}
			else if(unit>150 &&  unit<=250)
			{
				double  bill3 = ( 0.50 * unit) + (0.75 * unit-50) + (1.20 * unit-150);
				System.out.println("Amount payable is::"+bill3);
			}
			else if(unit>250)
			{
				double bill4 = ( 0.50 * unit) + (0.75 * unit-50) + (1.20 * unit-150) + (1.50 * unit-250);
				double finalBill = bill4 + bill4 * 0.20;
				System.out.println("Amount payable is::"+finalBill);
			}
			else 
			{
				System.out.println("Please Enter Valid input");
			}
		}
	}
}
