package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse1 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first number");
			 int n1 = sc.nextInt(); 
			 System.out.println("Enter Second  number");
			 int n2 = sc.nextInt(); 
			 if(n1>n2)
			 {
				 System.out.println("First number is greater ");
			 }
			 else {
				 {
					 System.out.println("Second  number is greater");
				 }
			}
		}
	}

}
