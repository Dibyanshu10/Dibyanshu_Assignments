package com.Dibyanshu.Assignments.ConditionalOperators;

import java.util.Scanner;

public class COperators1 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the first number ");
			int n1 = sc.nextInt();
			System.out.println("Enter the second number ");
			int n2 = sc.nextInt();
			int max = (n1>n2) ? n1 :n2;
			System.out.println("Greater number is ::"+max);
		}
	}
}
