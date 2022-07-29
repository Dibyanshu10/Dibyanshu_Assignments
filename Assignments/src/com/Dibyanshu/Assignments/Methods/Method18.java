package com.Dibyanshu.Assignments.Methods;

import java.util.Scanner;

public class Method18 
{
	public static void main(String args[] )
	{

	    try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number ");
			int n = sc.nextInt();
			Method18 m = new Method18();
			int result = m.factorial(n);
			System.out.println("Factorial of number is::"+ result);
	    }
	}
	 public  int factorial(int n)
     {
    	 int sum = n%10;
    	 if(sum==0)
    	 {
    		return 1; 
    	 }
    	 else 
    	 {
			return n * factorial(n-1);
		}
     }
	
}
	 
