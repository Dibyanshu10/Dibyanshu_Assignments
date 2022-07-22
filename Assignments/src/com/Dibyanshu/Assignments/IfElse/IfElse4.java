package com.Dibyanshu.Assignments.IfElse;

import java.util.Scanner;

public class IfElse4 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your number");
			 int n = sc.nextInt(); 
			 if(n%5==0 && n%11==0)
			 {
				 System.out.println("Number is divisible by 5 & 11");
			 }
			 else
			 {
				 System.out.println("Number is not divisible by 5 & 11");
			 }
		}
	}

}
