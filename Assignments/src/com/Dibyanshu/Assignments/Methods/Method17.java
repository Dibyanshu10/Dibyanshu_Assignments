package com.Dibyanshu.Assignments.Methods;

import java.util.Scanner;

public class Method17 
{
	public static void main(String args[] )
	{

	    try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number ");
			int n = sc.nextInt();
			Method17 m = new Method17();
			int result = m.add(n);
			System.out.println("Sum of digits of number is::"+ result);
	    }
	}
	         public static int add(int n)
	         {
	        	 int sum = n%10;
	        	 if(sum==0)
	        	 {
	        		return 0; 
	        	 }
	        	 else 
	        	 {
					return sum + add(n/10);
				}
	         }	
}
