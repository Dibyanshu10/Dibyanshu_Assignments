package com.Dibyanshu.Assignments.ConditionalOperators;

import java.util.Scanner;

public class COperators4 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the  year ");
			int year = sc.nextInt();
			
			String res = year%4==0 ? "Leap" : " Not a Leap";
			System.out.println("Year  is :: "+ res);
		}
	}

}
