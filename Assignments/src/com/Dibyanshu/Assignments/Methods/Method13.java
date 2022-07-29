package com.Dibyanshu.Assignments.Methods;

import java.util.Scanner;

public class Method13 
{
	public static void main(String args[] )
	{

	    try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number ");
			int n = sc.nextInt();
			int sum = calculate(n);
			 System.out.println("sum  of natural number till " +n+" is::"+ sum);
	    }
	}
	   

	private static int calculate(int n)
	{

        if(n>=1)
        {
            return n + calculate(n-1);
        }
        else
        {
            return n;
        }
      }
	}


