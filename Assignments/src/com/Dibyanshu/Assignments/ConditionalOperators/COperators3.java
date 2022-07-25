package com.Dibyanshu.Assignments.ConditionalOperators;

import java.util.Scanner;

public class COperators3 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the  number ");
			int n = sc.nextInt();
			
			String res = n%2==0 ? "even" : "odd";
			System.out.println("Number is"+ res);
		}
	}
 }
		


