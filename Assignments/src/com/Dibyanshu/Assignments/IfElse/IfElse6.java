package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse6 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the year you want to check");
			 int year = sc.nextInt(); 
			 if(year%4==0)
			 {
				 System.out.println("Year is a Leap Year");
			 }
			 else
			 {
				 System.out.println("Year is not a Leap Year");
			 }
		}
	}
}
