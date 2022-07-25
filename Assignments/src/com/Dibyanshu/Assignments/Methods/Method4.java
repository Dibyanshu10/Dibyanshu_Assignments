package com.Dibyanshu.Assignments.Methods;

import java.util.Scanner;

public class Method4 
{

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int n = sc.nextInt();
			Method4 method = new Method4();
			String res = method.Compare(n);
			System.out.println("Number is :: "+res);
		}
	}
			
					
					
		 public String Compare(int n)
			{
				if(n%2==0)
				{
					return "even";
				}
				else 
				{
					return "odd";
				}
			}
}
