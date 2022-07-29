package com.Dibyanshu.Assignments.Methods;

import java.util.Scanner;

public class Method12 
{
	public static void main(String args[] )
	{

	    try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the first number ");
			int n = sc.nextInt();
			int n1 =1;
			System.out.println(Odd(n1,n));
	    }
	}
	public static int Odd(int n1 ,int n)
	{
		return Odd(n1+2, n);
	}

}
