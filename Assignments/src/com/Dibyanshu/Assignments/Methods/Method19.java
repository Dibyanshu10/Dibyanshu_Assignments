package com.Dibyanshu.Assignments.Methods;

import java.util.Scanner;

public class Method19 
{
	public static void main(String args[] )
	{

	    try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number ");
			int n = sc.nextInt();
			Method19 m = new Method19();
			int result = m.fibonacci(n);
			System.out.println("Fibonacci series for::"+ result+" terms::");
			for(int i =0; i<=n; i++)
			{
				System.out.println(fibonacci(i));
			}
	    }
	}
	 public static  int fibonacci(int n)
     {
		 
		 if (n==0) {
		      return 0;
		    }

		    if (n == 1 || n == 2) {
		      return 1;
		    }

		    return fibonacci(n- 1) + fibonacci(n- 2);
		  }
     }


