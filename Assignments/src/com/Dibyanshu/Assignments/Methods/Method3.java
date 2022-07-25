package com.Dibyanshu.Assignments.Methods;

import java.util.Scanner;

public class Method3 
 {

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the first number");
			int n1 = sc.nextInt();
			System.out.println("Enter the Second number");
			int n2 = sc.nextInt();
			Method3 method = new Method3();
			double d = method.Compare(n1, n2);
			System.out.println("Greater of two number is ::"+d);
		}
	}

			
			public double Compare(int n1, int n2)
			{
				if(n1>n2)
				{
					return n1;
				}
				else 
				{
					return n2;
				}
			}
			
}
