package com.Dibyanshu.Assignments.Methods;

import java.util.Scanner;

public class Method10 
 {
	public static void main(String args[] )
	{

	    try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the base value");
			int b = sc.nextInt();
			System.out.println("Enter the exponent value");
			int e = sc. nextInt();
			 double result = calculate(b,e);
			 System.out.println("Power of number is ::" +result);
		}
	    }
	     public static double calculate(int b, int e){
	         if(b!=0)
	            return (Math.pow(b, e));
	        else 
	            return 1;
	     }

	}


