package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse5 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your number");
			 int n = sc.nextInt(); 
			 if(n%2==0)
			 {
				 System.out.println("Number is even");
			 }
			 else
			 {
				 System.out.println("Number is odd");
			 }
		}
	}

}

 

