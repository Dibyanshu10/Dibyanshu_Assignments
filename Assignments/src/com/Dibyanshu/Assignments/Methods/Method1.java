package com.Dibyanshu.Assignments.Methods;

import java.util.Scanner;

public class Method1 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int n = sc.nextInt();
			Method1 method = new Method1();
			double cube = method.Calculate(n);
			System.out.println("Cube of entered number is ::"+cube);
		}
	}
			

		
		public double Calculate(int n)
		{
			double value = n * n * n;
			return value;
		}
			
		}

	