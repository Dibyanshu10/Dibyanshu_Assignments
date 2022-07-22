package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse3 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your number");
			 int n = sc.nextInt(); 
			 if(n>0)
			 {
				 System.out.println("Number is positive");
			 }
			 else if(n==0)
			 {
				 System.out.println("Number is zero");
			 }
			 else
			 {
				 System.out.println("Number is negative");
			 }
		}
	}

}
