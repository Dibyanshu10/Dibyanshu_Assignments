package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops17 
 {
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			 int n = sc.nextInt(); 
			 int b =0;
			 int  a =0;
			 while(n!=0)
			 {
				 b = n%10;
			     a = a *10 +b;
				 n = n/10;
			 }
			 if(a==n)
			 {
				 System.out.println("Number is a Palindrome number");
			 }
			 else 
			 {
				 System.out.println("Number is not a Palindrome number");
			 }
		}
	}
}
