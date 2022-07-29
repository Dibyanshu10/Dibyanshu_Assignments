package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops21 
{
	public static void main(String args[] )
	{

	    try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the base value");
			double b = sc.nextInt();
			System.out.println("Enter the exponent value");
			double e = sc. nextInt();
			double  power=1;
			while(e!=0)
			{
				 power = power *b;
				 --e;
				
			}
			 System.out.println("Power of number is "+power);
	    }
	}

}
